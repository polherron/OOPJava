package com.sta;

public class Person {
	public int idNo;
	public String fName;
	public String lName;
	public String address;
	
	public boolean equals(Person person)
	{
		return (this.idNo == person.idNo
				&& this.fName == person.fName
				&& this.lName == person.lName
				&& this.address == person.address);
	}
	
	public String toString()
	{
		return String.format("%s,%s,%s,%s",this.idNo,this.fName,this.lName,this.address);
	}
}
