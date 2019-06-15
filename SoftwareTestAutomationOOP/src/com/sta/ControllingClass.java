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
		
		System.out.println(person1.fName);
		System.out.println(person1.lName);
		
	}

}
