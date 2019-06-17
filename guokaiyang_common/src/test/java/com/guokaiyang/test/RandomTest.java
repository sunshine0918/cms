package com.guokaiyang.test;

import java.util.HashSet;

import org.junit.Test;

import com.guokaiyang.common.utils.RandomUtil;

public class RandomTest {
	
	@Test
	public void testRandomNum(){
		long randomNum = RandomUtil.randomNum(1, 10);
		System.out.println(randomNum);
	}
	
	
	@Test
	public void testSubRandomNum(){
		
		HashSet<Long> subRandomNum = RandomUtil.subRandomNum(1, 10, 3);
		for (Long long1 : subRandomNum) {
			System.out.println(long1);
		}
	}
	
	@Test
	public void testRandomCharacter(){
		char character = RandomUtil.randomCharacter();
		System.out.println(character);
	
	}
	
	@Test
	public void testRandomString(){
		
		String randomString = RandomUtil.randomString(5);
	
		System.out.println(randomString);
	}
	@Test
	public void randomDate(){
		
		String date = RandomUtil.randomDate("2010-01-01 00:00:00", "2019-06-17 09:30:00");
		
		System.out.println(date);
		
	}
	
	
	

	
}
