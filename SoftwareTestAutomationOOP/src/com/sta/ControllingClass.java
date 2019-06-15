package com.sta;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ControllingClass {

	public static void main(String[] args) {
				
		Person person1 = new Person();
		person1.idNo = 1234;
		person1.fName = "Paul";
		person1.lName = "Herron";
		person1.address = "Derry, cooler than Gweedore";
		
		Person person2 = new Person();
		person2.idNo = 1234;
		person2.fName = "Paul";
		person2.lName = "Herron";
		person2.address = "Derry, cooler than Gweedore";
		
		if (person1.equals(person2)) {
			System.out.println("people are equal");
		} else {
			System.out.println("people are not equal");
		}
	}

}
