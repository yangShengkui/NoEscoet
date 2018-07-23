package com.slk.wph.framework.Util.push;

import java.util.Iterator;

import net.sf.json.JSONObject;

import com.slk.wph.framework.Util.push.android.AndroidBroadcast;
import com.slk.wph.framework.Util.push.android.AndroidUnicast;

public class PushUtil {

	private static String appkey = "59b652c1f43e4844c3001732";
	private static String appMasterSecret = "38n14aqza9mrrfitwlt8dfin9w3voilt";
	private String timestamp = null;
	private static PushClient client = new PushClient();
	
	
	public static void main(String[] args) throws Exception {
//		PushUtil.sendAndroidUnicast();
		
		
	
	}
	
	/**
	 * 描述：向所有安卓设备推送消息（打开app）
	 *
	 * @param ticker 通知栏显示标题
	 * @param title	   打开通知栏显示标题
	 * @param text	   显示推送文本
	 * @return flag 成功/失败
	 *
	 * @author 宋现亮
	 * @time 2017年9月14日-上午11:58:48
	 */
	public static Boolean sendAndroidBroadcast(String ticker,String title,String text){
		Boolean flag = true;
		try {
			AndroidBroadcast broadcast = new AndroidBroadcast(appkey,appMasterSecret);
			broadcast.setTicker(ticker);
			broadcast.setTitle(title);
			broadcast.setText(text);
			broadcast.goAppAfterOpen();
			broadcast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
			broadcast.setProductionMode();
			client.send(broadcast);
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	
	
	
	/**
	 * 描述：指定单个app推送消息（打开app）-安卓
	 *
	 * @param ticker 通知栏显示标题
	 * @param title	   打开通知栏显示标题
	 * @param text	   显示推送文本
	 * @param token  所要推送的安卓设备的token标识
	 * @return flag 成功/失败
	 * 
	 * @author 宋现亮
	 * @time 2017年9月14日-上午11:58:48
	 */
	public static Boolean sendAndroidUnicast(String ticker,String title,String text,String token) {
		Boolean flag = true;
		try {
			AndroidUnicast unicast = new AndroidUnicast(appkey,appMasterSecret);
			unicast.setDeviceToken(token);
			unicast.setTicker(ticker);
			unicast.setTitle(title);
			unicast.setText(text);
			unicast.goAppAfterOpen();
			unicast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
			unicast.setProductionMode();
			client.send(unicast);
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	
	
	/**
	 * 描述：指定单个app推送消息（打开app）-安卓
	 *
	 * @param ticker 通知栏显示标题
	 * @param title	   打开通知栏显示标题
	 * @param text	   显示推送文本
	 * @param token  所要推送的安卓设备的token标识
	 * @param activity  所要推送的安卓设备的activity标识(app所有打开的页面)
	 * @return 发送成功/失败
	 * 
	 * @author 宋现亮
	 * @time 2017年9月14日-上午11:58:48
	 */
	public static Boolean sendAndroidUnicastActivity(String ticker,String title,String text,String token, String activity) {
		Boolean flag = true;
		try {
			AndroidUnicast unicast = new AndroidUnicast(appkey,appMasterSecret);
			unicast.setDeviceToken(token);
			unicast.setTicker(ticker);
			unicast.setTitle(title);
			unicast.setText(text);
			unicast.goActivityAfterOpen(activity);
			unicast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
			unicast.setProductionMode();
			client.send(unicast);
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	
	
	
	/**
	 * 描述：指定单个app推送消息（打开app）-安卓
	 *
	 * @param ticker 通知栏显示标题
	 * @param title	   打开通知栏显示标题
	 * @param text	   显示推送文本
	 * @param token  所要推送的安卓设备的token标识
	 * @param activity  所要推送的安卓设备的activity标识(app所有打开的页面)
	 * @param jsonExtra  向app传递参数（最多可传入10对key:value），传递类型JSONObject.toString
	 * @return  发送成功/失败
	 * 
	 * @author 宋现亮
	 * @time 2017年9月14日-上午11:58:48
	 */
	public static Boolean sendAndroidUnicastActivityExtra(String ticker,String title,String text,String token, String activity,String jsonExtra) {
		Boolean flag = true;
		try {
			AndroidUnicast unicast = new AndroidUnicast(appkey,appMasterSecret);
			unicast.setDeviceToken(token);
			unicast.setTicker(ticker);
			unicast.setTitle(title);
			unicast.setText(text);
			unicast.goActivityAfterOpen(activity);
			unicast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
			unicast.setProductionMode();
			//向APP传递参数
			JSONObject hostObject = JSONObject.fromObject(jsonExtra);
			Iterator<String> sIterator = hostObject.keys();  
			while(sIterator.hasNext()){  
			    String key = sIterator.next();// 获得key  
			    String value = hostObject.getString(key);// 根据key获得value
			    unicast.setExtraField(key, value);
			}  
			client.send(unicast);
			
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	
}
