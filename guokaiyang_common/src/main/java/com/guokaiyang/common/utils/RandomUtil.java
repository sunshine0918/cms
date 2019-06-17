package com.guokaiyang.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

/***
 * 随机数工具类
 * @author yyyyy
 *
 */
public class RandomUtil {
	
	/**
	 * 方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。
	 * 
	 */
	public static long randomNum(long min, long max){
		
		long random = (long)(Math.random()*(max-min)+min);
		
		return random;
		
	}
	
	/**
	 * 2.在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，
	 * [3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到
	 */
	public static HashSet<Long> subRandomNum(long min, long max,int n){
		
		HashSet<Long> hashSet = new HashSet<Long>();
		
		for (int i = 0; i < n; i++) {
			long random = (long)(Math.random()*(max-min)+min);
			
			hashSet.add(random);
		}

		return hashSet;
		
	}
	
	/**
	 * 方法3：返回1个1-9,a-Z之间的随机字符。
	 */
	public static char randomCharacter(){
		String string = "1234567890qazwsxedcrfvtgbyhnujmikolpQAZWSXEDCRFVTGBYHNUJMIKOLP";
		
		char[] charArray = string.toCharArray();
		
		Random random = new Random();
		
		int abs = Math.abs(random.nextInt(charArray.length));
	
		
		return charArray[abs];
	}
	
	/**
	 * 方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 
	 */
	public static String randomString(int length){
		
		String string = "";
		
		for (int i = 0; i < length; i++) {
			
			char character = randomCharacter();
			
			string +=character;
		}
		
		
		return string;
	}

	/**
	 * 获取随机时间
	 */
	public static String randomDate(String min, String max){
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Date start = format.parse(min);
			Date end = format.parse(max);
			
			if(start.getTime()>=end.getTime()){
				return null;
			}
			long num = randomNum(start.getTime(), end.getTime());
			
			Date date = new Date(num);
			
			return format.format(date);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	
	}
	
	

}
