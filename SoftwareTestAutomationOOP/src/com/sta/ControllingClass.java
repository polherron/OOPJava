package com.sta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class ControllingClass {

	public static void main(String[] args) {
			
		ArrayList<Person> myPeople = new ArrayList<Person>();
		Person person1 = new Person();
		person1.setIdNo(1234);
		person1.setFName("Paul");
		person1.setLName("Herron");
		person1.setAddress("Derry");
		person1.setGender(true);
		person1.setEuCitizen(true);
		
		myPeople.add(person1);
		
		Person person2 = new Person();
		person2.setIdNo(1235);
		person2.setFName("Roisin");
		person2.setLName("Gallagher");
		person2.setAddress("Dungloe");
		person2.setGender(false);
		person2.setEuCitizen(true);
		
		myPeople.add(person2);
		
		//Use a foreach loop
		//We are going to use our toString method
		for (Person person : myPeople) {
			System.out.println(person.toString());
		}
	}
}
