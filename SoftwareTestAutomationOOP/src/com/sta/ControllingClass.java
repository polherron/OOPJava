package com.sta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class ControllingClass {

	public static void main(String[] args) {
			
		ArrayList<Person> myPeople = new ArrayList<Person>();
		Person person1 = new Person();
		person1.idNo = 1234;
		person1.fName = "Paul";
		person1.lName = "Herron";
		person1.address = "Derry";
		
		myPeople.add(person1);
		
		Person person2 = new Person();
		person2.idNo = 12345;
		person2.fName = "Michael";
		person2.lName = "Doherty";
		person2.address = "Dungloe";
		
		myPeople.add(person2);
		
		//Use a foreach loop
		//We are going to use our toString method
		for (Person person : myPeople) {
			System.out.println(person.toString());
		}

	}

}
