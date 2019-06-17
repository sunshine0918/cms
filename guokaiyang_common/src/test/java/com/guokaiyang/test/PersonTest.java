package com.guokaiyang.test;

import java.util.LinkedList;

import com.guokaiyang.bean.Person;
import com.guokaiyang.common.utils.RandomUtil;
import com.guokaiyang.common.utils.StringUtil;

public class PersonTest {
	
	public static void main(String[] args) {
		LinkedList<Person> linkedList = new LinkedList<Person>();
		
		for (int i = 0; i < 10000; i++) {
			
			Person person = new Person();
			
			person.setName(StringUtil.generateChineseName());
			person.setAge((int)(RandomUtil.randomNum(1, 120)));
			person.setAbout(StringUtil.randomChineseString(140));
			person.setCreated(RandomUtil.randomDate("2010-01-01 00:00:00", "2019-06-17 09:30:00"));
			
			linkedList.add(person);
		}
		
		for (Person p : linkedList) {
			System.out.println(p);
		}
		
		
	}

}
