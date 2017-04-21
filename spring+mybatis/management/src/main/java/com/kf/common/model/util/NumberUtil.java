package com.kf.common.model.util;

/**
 * 数字工具类
 * User:gongJin
 * Date:2017/3/3 0003
 * Time:13:39
 */
public class NumberUtil {


	/**
	 * Integer转换为int整形，如果为null，返回0
	 * @Author gongJin
	 * @Date 2017/3/3 0003 13:40
	 */
	public static int intValue(Integer value){
		if (value == null)
			return  0;
		return value.intValue();
	}
}
