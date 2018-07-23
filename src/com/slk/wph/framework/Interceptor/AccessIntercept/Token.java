package com.slk.wph.framework.Interceptor.AccessIntercept;
import java.lang.annotation.ElementType;  
import java.lang.annotation.Retention;  
import java.lang.annotation.RetentionPolicy;  
import java.lang.annotation.Target; 

/**
 * 在要防止重复提交数据的方法中加上此方法
 * @ClassName:       CheckData
 * @Description:    TODO
 * @author:         隋乔镇
 * @date:            2017年10月23日        下午4:56:17
 */
@Target(ElementType.METHOD)  
@Retention(RetentionPolicy.RUNTIME) 
public @interface Token  {
	boolean save() default false;
	
	boolean remove() default false;
}
