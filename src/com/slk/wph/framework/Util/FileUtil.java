package com.slk.wph.framework.Util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;

import sun.misc.BASE64Decoder;

public class FileUtil {
	
	//项目外网地址（项目域名）
	public static String applicationUrl="http://127.0.0.1";
	//文件存放物理地址
	public static String projectPath="E:/";
	//项目名称，一般就是本项目名称为了多项目使用同一个文件服务器而存在的
	public static String projectName="images";
	
	public static String picRoot="SpringMVC-Mybatis";
	
	
	//阿里云
	private static String endpoint = "http://oss.tjkelin.com.cn";
	
	
	private static String accessKeyId = "LTAIJ0gd3iqNF4tt";
    
    private static String accessKeySecret = "oS7mlRlM5FFe8NF7crCyAF8QcIUMza";
	
    private static String appbucketName = "slk-save";
    
//    private static String serverbucketName="";
    
    private static Calendar now = Calendar.getInstance();  
	
	
	
	public static void main(String[] args) {
		deleteFile("E:/images/Wph/mealMenu/1499765894931oxs9728123321.jpg");
	}

	
	
	public static String RandomFileName() {
		String result = "";
		for (int i = 0; i < 3; i++) {
			int intVal = (int) (Math.random() * 26 + 97);
			result = result + (char) intVal;
		}
		result = new Date().getTime() + result
				+ (int) ((Math.random() * 9 + 1) * 1000);
		return result;
	}
	
	
	
	
	
	
	/**
	 * 阿里云方式文件删除
	 * 创建者：隋乔镇
	 * @param @param picPath    文件key
	 * @return void  
	 * @throws
	 * @date 2016年7月16日
	 */
	public static void FileDel(String picPath){
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		ossClient.deleteObject(appbucketName, picPath);
	}
	
	
	
	/**
	 * 描述：字节数组上传（适用于base64）
	 *
	 * @param imgurl
	 * @param picPath
	 * @throws IOException
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月28日-下午3:09:18
	 */
	public static String FileByteImgUp(String imgurl,String picPath) throws IOException{
		// 创建OSSClient实例
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		BASE64Decoder decoder = new BASE64Decoder();
		// 解密
		byte[] b = decoder.decodeBuffer(imgurl);
		// 处理数据
		for (int i = 0; i < b.length; ++i) {
			if (b[i] < 0) {
				b[i] += 256;
			}
		}
	    //图片路径，路径命名规则：项目名称/模块名称/当前年份+月份/随机图片名称
		imgurl = picPath+"/"+now.get(Calendar.YEAR)+"-"+(now.get(Calendar.MONTH) + 1)+"/"+RandomFileName()+".jpg";
		
		// 上传
		ossClient.putObject(appbucketName, imgurl, new ByteArrayInputStream(b));
		// 关闭client
		ossClient.shutdown();
		
		return "http://slk-save.oss-cn-beijing.aliyuncs.com/"+imgurl;
	}
	
	
	
	
	
	/**
	 * 阿里云方式图片上传与修改
	 * 创建者：隋乔镇
	 * @param @param picPath 文件的key=存储路径+随机数字+文件名
	 * @param @param multipartFile
	 * @param @return   
	 * @return String  
	 * @throws
	 * @date 2017年8月28日
	 */
	public static String FileImgUp(MultipartFile multipartFile,String picPath){
		
		 OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

		//图片路径，路径命名规则：项目名称/模块名称/当前年份+月份/随机图片名称
		String imgurl = picPath+"/"+now.get(Calendar.YEAR)+"-"+(now.get(Calendar.MONTH) + 1)+"/"+RandomFileName()+".jpg";
		 
	        try {
	        	  if (ossClient.doesBucketExist(appbucketName)) {
	              } else {
	                  ossClient.createBucket(appbucketName);
	              }
	        	  ossClient.putObject(appbucketName, imgurl,multipartFile.getInputStream());
	        	  
	        } catch (OSSException | ClientException | IOException oe) {
	            oe.printStackTrace();
	        } finally {
	            ossClient.shutdown();
	        }	
			return "http://slk-save.oss-cn-beijing.aliyuncs.com/"+imgurl;
	}
	
	
	
	
	
	
	/**
	 * 
	 * @Title:             generateImage
	 * @param:             @param modulePath 文件夹名称
	 * @param:             @param multipartFile 文件名称  
	 * @param:             @return
	 * @param:             @throws Exception   
	 * @return:         boolean   
	 * @throws
	 * 作者: 		隋乔镇
	 * 描述：强Base64转为图片
	 */
	public static String generateImage(String modulePath, String multipartFile) throws Exception{
		if (multipartFile == null)
			return "";
		BASE64Decoder decoder = new BASE64Decoder();
		// 解密
		byte[] b = decoder.decodeBuffer(multipartFile);
		// 处理数据
		for (int i = 0; i < b.length; ++i) {
			if (b[i] < 0) {
				b[i] += 256;
			}
		}
		
		String fileName = RandomFileName()+".png";
		
		String FolderPath = projectPath+projectName+"/Wph/"+modulePath+"/";
		
		//创建文件夹
		File newFile = new File(FolderPath);
		if (!newFile.exists() && !newFile.isDirectory()) {
			newFile.mkdirs();
		}
		//images/Wph/Photograph/1498016781831yqg6784.png
		//RandomFileName随机生成文件名
		OutputStream out = new FileOutputStream(FolderPath+fileName);
		out.write(b);
		out.flush();
		out.close();
		//图片访问路径
		String url = projectName+"/Wph/"+modulePath+"/"+fileName;
		return url;
	}
	
	
	
	
	
	/**
	 * 单图片上传
	 * @param modulePath 模块名称
	 * @param multipartFile
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public static String uploadFile(String modulePath,MultipartFile multipartFile) throws IllegalStateException, IOException {
		String filePath="";
		if(multipartFile!=null &&! multipartFile.equals("") && !multipartFile.getOriginalFilename().equals("")){
		multipartFile.getOriginalFilename();
		String fileName=RandomFileName()+multipartFile.getOriginalFilename();
		String path = projectPath +"/"+projectName+"/Wph/"+modulePath+"/"+ fileName;
		
		
		File newFile = new File(projectPath +"/"+projectName+"/Wph/"+modulePath+"/");
		if (!newFile.exists() && !newFile.isDirectory()) {
			newFile.mkdirs();
		}
		File localFile = new File(path);
		
		multipartFile.transferTo(localFile);
		filePath=projectName+"/Wph/"+modulePath+"/"+ fileName;
		}
		
		return filePath;
	}
	
	/**
	 * 单图片修改
	 * @param modulePath 模块名称
	 * @param multipartFile
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public static String uploadFileUpdate(String picName,MultipartFile multipartFile) throws IllegalStateException, IOException {
		String filePath="";
		
		if(multipartFile!=null &&! multipartFile.equals("") && !multipartFile.getOriginalFilename().equals("")){
		multipartFile.getOriginalFilename();
		
		File newFile = new File(projectPath +"/"+picName);
		if (!newFile.exists() && !newFile.isDirectory()) {
			newFile.mkdirs();
		}
		
		File localFile = new File(projectPath +"/"+picName);
		multipartFile.transferTo(localFile);
		filePath=picName;
		}
		
		return filePath;
	}
	
	
	
	/**
	 * 描述： 删除单个文件
	 *
	 * @param fileName 要删除的文件的文件名
	 * @return 单个文件删除成功返回true，否则返回false
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月12日-上午10:23:58
	 */
    public static boolean deleteFile(String fileName) {
        File file = new File(projectPath+"/"+fileName);
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                System.out.println("删除单个文件" + fileName + "成功！");
                return true;
            } else {
                System.out.println("删除单个文件" + fileName + "失败！");
                return false;
            }
        } else {
            System.out.println("删除单个文件失败：" + fileName + "不存在！");
            return false;
        }
    }

	/**
	 * 多图片上传
	 * @param picPath
	 * @param mf
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public static String uploadsFile(String picPath,MultipartFile[] mf) throws IllegalStateException, IOException {
		String filePath="";
		
		if(mf!=null && mf.length>0)
		for(MultipartFile multipartFile:mf)
		if(multipartFile!=null &&! multipartFile.equals("") && !multipartFile.getOriginalFilename().equals("")){
		multipartFile.getOriginalFilename();
		String fileName=RandomFileName()+multipartFile.getOriginalFilename();
		String path = projectPath +"/"+projectName+"/Wph/"+picPath+"/"+ fileName;
		
		
		File newFile = new File(projectPath +"/"+projectName+"/Wph/"+picPath+"/");
		if (!newFile.exists() && !newFile.isDirectory()) {
			newFile.mkdirs();
		}
		File localFile = new File(path);
		
		multipartFile.transferTo(localFile);
		filePath=projectName+"/Wph/"+picPath+"/"+ fileName;
		}
		
		return filePath;
	}
	

		/**
		 * 文件下载方法
		 * @param fileName
		 * @param response
		 */
		public static void downloadFile(String fileName,HttpServletResponse response){  
		    response.setCharacterEncoding("utf-8");  
		    response.setContentType("multipart/form-data");  
		
		    response.setHeader("Content-Disposition", "attachment;fileName="+fileName);  
		    try {  
		        File file=new File(projectPath +"/"+fileName);  
		        System.out.println(file.getAbsolutePath());  
		        InputStream inputStream=new FileInputStream(file);  
		        OutputStream os=response.getOutputStream();  
		        byte[] b=new byte[1024];  
		        int length;  
		        while((length=inputStream.read(b))>0){  
		            os.write(b,0,length);  
		        }  
		        inputStream.close();  
		    } catch (FileNotFoundException e) {  
		        e.printStackTrace();  
		    } catch (IOException e) {  
		        e.printStackTrace();  
		    }  
		}  
		
		public static String FileUp(MultipartFile multipartFile,String picPath){
			
			 OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

			//图片路径，路径命名规则：项目名称/模块名称/当前年份+月份/随机图片名称
			String imgurl = picPath+"/"+multipartFile.getOriginalFilename();
			 
		        try {
		        	  if (ossClient.doesBucketExist(appbucketName)) {
		              } else {
		                  ossClient.createBucket(appbucketName);
		              }
		        	  ossClient.putObject(appbucketName, imgurl,multipartFile.getInputStream());
		        	  
		        } catch (OSSException | ClientException | IOException oe) {
		            oe.printStackTrace();
		        } finally {
		            ossClient.shutdown();
		        }	
				return "http://slk-save.oss-cn-beijing.aliyuncs.com/"+imgurl;
		}
		
	 public static String getEndpoint() {
		return endpoint;
	}
	
	
	
	public static void setEndpoint(String endpoint) {
		FileUtil.endpoint = endpoint;
	}
	
	
	
	public static String getAccessKeyId() {
		return accessKeyId;
	}
	
	
	
	public static void setAccessKeyId(String accessKeyId) {
		FileUtil.accessKeyId = accessKeyId;
	}
	
	
	
	public static String getAccessKeySecret() {
		return accessKeySecret;
	}
	
	
	
	public static void setAccessKeySecret(String accessKeySecret) {
		FileUtil.accessKeySecret = accessKeySecret;
	}
	
	
	
	public static String getAppbucketName() {
		return appbucketName;
	}
	
	
	
	public static void setAppbucketName(String appbucketName) {
		FileUtil.appbucketName = appbucketName;
	}


}
