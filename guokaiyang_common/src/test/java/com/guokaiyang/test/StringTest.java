package com.guokaiyang.test;

import org.junit.Test;

import com.guokaiyang.common.utils.StringUtil;

public class StringTest {
	
	@Test
	public void testHasLength(){
		
		String string ="     ";
		boolean hasLength = StringUtil.hasLength(string);
		
		System.out.println(hasLength);
	}

	@Test
	public void testHasText(){
		
		String string ="                ";
		boolean hasLength = StringUtil.hasText(string);
		
		System.out.println(hasLength);
	}
	
	@Test
	public void testRandomChineseString(){
		
		String chineseString = StringUtil.randomChineseString(2);
		System.out.println(chineseString);
	}

	@Test
	public void testGenerateChineseName(){
		
		String generateChineseName = StringUtil.generateChineseName();
		
		System.out.println(generateChineseName);
	}
	
	
	
	
}
