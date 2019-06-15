package com.sta;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ControllingClass {

	public static void main(String[] args) {
				
		Person person1 = new Person();
		person1.idNo = 1234;
		person1.fName = "Paul";
		person1.lName = "Herron";
		person1.address = "Derry";
		
		Person person2 = person1;
		
		if (person1 == person2) {
			System.out.print("People are equal");
		} else {
			System.out.print("People are not equal");
		}

	}

}
