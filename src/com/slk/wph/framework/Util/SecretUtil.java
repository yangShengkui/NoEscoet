package com.slk.wph.framework.Util;

	import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
	public class SecretUtil {
		/** 安全密钥 */
	    private String keyData = "A$$dsf23049SDFD%^%$#ASDEF@!$TWXYZabcdefghij中文kl$%^$%^%$mnoASFSqrstwxyz0123456789-_.";
	    
	    /**
	     * 使用默认秘钥
	     */
	    public SecretUtil() {
	    }
	 /**
	  * 加解密构造函数
	  * @param key
	  * 传入秘钥
	  */
	    public SecretUtil(String key) {
	        this.keyData = key;
	    }
	    
	    
	 
	    /**
	     * 加密（UTF-8）
	     * @param source
	     * 进行加密的字符串
	     * @return
	     * 返回加密后的字符串
	     * @throws UnsupportedEncodingException
	     *@author 隋乔镇
	     *@date 2016年6月14日 上午8:48:23 
	     *@comment
	     */
	    public String encrypt(String source)   {
	    	String str="";
			try {
				str = encrypt(source, "UTF-8");
			} catch (Exception e) {
				// TODO Auto-generated catch block
			System.out.println("=-------encrypt-----");
			}
	        return str;
	    }
	  /*  
	    public static void main(String[] args) throws Exception {
	    	SecretUtil s=new SecretUtil();
	    	System.out.println(s.decrypt("cSzUocBa0W6D3TO5pf4k/aMNHs3UYtQjHFNSVDrP+ixKkBoQXTl5rHOT+vfIeBys"));
		}*/
	 
	    /**
	     * 解密（UTF-8）
	     * @param encryptedData
	     * 要解密的字符串
	     * @return
	     * 返回解密后的字符串
	     * @throws UnsupportedEncodingException
	     *@author 隋乔镇
	     *@date 2016年6月14日 上午9:11:56 
	     *@comment
	     */
	    public String decrypt(String encryptedData) throws UnsupportedEncodingException {
	    	  
	    	
	    	String str=decrypt(encryptedData, "UTF-8");
	    	
	        return str;
	    }
	    
	    public String encrypt(String source, String charSet) {
	        String encrypt = null;
	        try {
				byte[] ret = encrypt(source.getBytes(charSet));
				encrypt = new String(DESBase64SuiUtil.encode(ret));
			} catch (UnsupportedEncodingException e) {
				System.out.println("=-------encrypt-----");
			}
	        return encrypt;
	    }
	 
	    public String decrypt(String encryptedData, String charSet)
	            throws UnsupportedEncodingException {
	        String descryptedData = null;
	        byte[] ret = descrypt(DESBase64SuiUtil.decode(encryptedData.toCharArray()));
	        descryptedData = new String(ret, charSet);
	        return descryptedData;
	    }
	 
	    private byte[] encrypt(byte[] primaryData) {
	 
	 
	        /** DES算法要求有一个可信任的随机数源 */
	        SecureRandom sr = new SecureRandom();
	 
	        /** 使用原始密钥数据创建DESKeySpec对象 */
	        DESKeySpec dks = null;
	        try {
	            dks = new DESKeySpec(keyData.getBytes());
	        } catch (InvalidKeyException e) {
	            e.printStackTrace();
	        }
	 
	        /** 创建一个密钥工厂 */
	        SecretKeyFactory keyFactory = null;
	        try {
	            keyFactory = SecretKeyFactory.getInstance("DES");
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	 
	        /** 用密钥工厂把DESKeySpec转换成一个SecretKey对象 */
	        SecretKey key = null;
	        try {
	            key = keyFactory.generateSecret(dks);
	        } catch (InvalidKeySpecException e) {
	            e.printStackTrace();
	        }
	 
	        /** Cipher对象实际完成加密操作 */
	        Cipher cipher = null;
	        try {
	            cipher = Cipher.getInstance("DES");
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        } catch (NoSuchPaddingException e) {
	            e.printStackTrace();
	        }
	 
	        /** 用密钥初始化Cipher对象 */
	        try {
	            cipher.init(Cipher.ENCRYPT_MODE, key, sr);
	        } catch (InvalidKeyException e) {
	            e.printStackTrace();
	        }
	 
	        /** 正式执行加密操作 */
	        byte encryptedData[] = null;
	        try {
	            encryptedData = cipher.doFinal(primaryData);
	        } catch (IllegalStateException e) {
	            e.printStackTrace();
	        } catch (IllegalBlockSizeException e) {
	            e.printStackTrace();
	        } catch (BadPaddingException e) {
	            e.printStackTrace();
	        }
	 
	        /** 返回加密数据 */
	        return encryptedData;
	    }
	 
	    private byte[] descrypt(byte[] encryptedData) {
	 
	        /** DES算法要求有一个可信任的随机数源 */
	    	SecureRandom sr = new SecureRandom();
	 
	        /** 使用原始密钥数据创建DESKeySpec对象 */
	        DESKeySpec dks = null;
	        try {
	            dks = new DESKeySpec(keyData.getBytes());
	        } catch (InvalidKeyException e) {
	            e.printStackTrace();
	        }
	 
	        /** 创建一个密钥工厂 */
	        SecretKeyFactory keyFactory = null;
	        try {
	            keyFactory = SecretKeyFactory.getInstance("DES");
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	 
	        /** 用密钥工厂把DESKeySpec转换成一个SecretKey对象 */
	        SecretKey key = null;
	        try {
	            key = keyFactory.generateSecret(dks);
	        } catch (InvalidKeySpecException e) {
	            e.printStackTrace();
	        }
	 
	        /** Cipher对象实际完成加密操作 */
	        Cipher cipher = null;
	        try {
	            cipher = Cipher.getInstance("DES");
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        } catch (NoSuchPaddingException e) {
	            e.printStackTrace();
	        }
	 
	        /** 用密钥初始化Cipher对象 */
	        try {
	            cipher.init(Cipher.DECRYPT_MODE, key, sr);
	        } catch (InvalidKeyException e) {
	            e.printStackTrace();
	        }
	 
	        /** 正式执行解密操作 */
	        byte decryptedData[] = null;
	        try {
	            decryptedData = cipher.doFinal(encryptedData);
	        } catch (IllegalStateException e) {
	            e.printStackTrace();
	        } catch (IllegalBlockSizeException e) {
	            e.printStackTrace();
	        } catch (BadPaddingException e) {
	            e.printStackTrace();
	        }
	 
	        return decryptedData;
	    }
	    
	    public  String convertMD5(String inStr){  
	    	  
	        char[] a = inStr.toCharArray();  
	        for (int i = 0; i < a.length; i++){  
	            a[i] = (char) (a[i] ^ 't');  
	        }  
	        String s = new String(a);  
	        return s;  
	  
	    }  
	 
	}
