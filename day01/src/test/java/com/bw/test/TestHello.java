package com.bw.test;

import org.junit.Test;

import com.bw.bean.Hello;

public class TestHello {
	
	@Test
	public void testSayHello(){
		Hello hello = new Hello();
		hello.sayHello();
		
	}

}
