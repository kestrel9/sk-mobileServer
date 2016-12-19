package com.tacademy.test;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.tacademy.vo.Person;
import com.tacademy.vo.PersonListResult;

public class PersonTest {

	public PersonTest() {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동1",22,"000-9999",true));
		list.add(new Person("홍길동2",23,"100-9999",true));
		list.add(new Person("홍길동3",24,"200-9999",true));
		list.add(new Person("홍길동4",25,"300-9999",true));
		list.add(new Person("홍길동5",26,"400-9999",true));
		list.add(new Person("홍길동6",27,"500-9999",true));
		list.add(new Person("홍길동7",28,"600-9999",true));
		list.add(new Person("홍길동8",29,"700-9999",true));
		list.add(new Person("홍길동9",30,"800-9999",true));
		
		Gson gson = new Gson();
//		String result = gson.toJson(list);
		PersonListResult personListResult = new PersonListResult();
		personListResult.setCount(list.size());
		personListResult.setList(list);
		personListResult.setStatus("success");
		
		String result = gson.toJson(personListResult);
		
		System.out.println(result);

//		Person person = new Person();
//		
//		person.setName("홍길동");
//		person.setAge(30);
//		person.setSex(true);
//		person.setTel("000-0999-9999");
//		
//		
//		Gson gson = new Gson();
//		String result = gson.toJson(person);
//		System.out.println(result);
//		
//		String str = "{\"name\":\"홍길동\",\"age\":30,\"tel\":\"000-0999-9999\",\"sex\":true}";
//		
//		Person person1 = gson.fromJson(str, Person.class);
//
//		System.out.println(person1);
////		System.out.println(person);
	}

	public static void main(String[] args) {
		new PersonTest();

	}

}
