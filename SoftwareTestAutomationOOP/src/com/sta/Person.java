package com.sta;

public class Person {
	
	private int idNo;
	private String fName;
	private String lName;
	private String address;
	private boolean gender;
	private boolean euCitizen;
	
	/**
	 * Empty Constructor
	 */
	public Person() {
	}
	
	/**
	 * @param idNo
	 * @param fName
	 * @param lName
	 * @param address
	 * @param gender
	 * @param euCitizen
	 */
	public Person(int idNo, String fName, String lName, String address, 
			boolean gender, boolean euCitizen) {
		this.idNo = idNo;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.gender = gender;
		this.euCitizen = euCitizen;
	}


	


	int getIdNo() {
		return idNo;
	}

	void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	String getFName() {
		return fName;
	}

	void setFName(String fName) {
		this.fName = fName;
	}

	String getLName() {
		return lName;
	}

	void setLName(String lName) {
		this.lName = lName;
	}

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

	boolean isGender() {
		return gender;
	}

	void setGender(boolean gender) {
		this.gender = gender;
	}

	boolean isEuCitizen() {
		return euCitizen;
	}

	void setEuCitizen(boolean euCitizen) {
		this.euCitizen = euCitizen;
	}


	
	public boolean equals(Person person)
	{
		return (this.idNo == person.idNo
				&& this.fName.equals(person.fName)
				&& this.lName.equals(person.lName)
				&& this.address.equals(person.address)
				&& this.gender == person.gender
				&& this.euCitizen == person.euCitizen);
	}
	
	public String toString()
	{
		return String.format("%s,%s,%s,%s,%s,%s",this.idNo,this.fName,
				this.lName,this.address, this.gender, this.euCitizen);
	}
}
