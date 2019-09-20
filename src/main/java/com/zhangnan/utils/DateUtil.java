package com.zhangnan.utils;

import java.util.Date;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author:张楠
 * @date: 2019年9月20日 上午8:38:04
 */
public class DateUtil {
	public static void main(String string) {
		Date date = new Date();
		int year = date.getYear();
		int month = date.getMonth();
		int day = date.getDay();
		int hours = date.getHours();
		int minutes = date.getMinutes();
		System.out.println(year+month+day+hours+minutes);
		long endTime = date.getTime();
		Date date2 = new Date(endTime);
		Date startTime = new Date(2010-10-10);
		System.out.println(startTime);
	}
}
