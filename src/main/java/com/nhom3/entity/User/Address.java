//
package com.nhom3.entity.User;

/**
 * This class is .
 * 
 * @Description: .
 * @author: Quang Le
 * @create_date: Nov 22, 2021
 * @version: 1.0
 * @modifer: Quang Le
 * @modifer_date: Nov 22, 2021
 */
public class Address {
	private int id;
	private int number;
	private String street;
	private String district;
	private String city;

	public Address() {
		super();
	}
	
	public Address(int id) {
		super();
		this.id = id;
	}

	public Address(int number, String street, String district, String city) {
		super();
		this.number = number;
		this.street = street;
		this.district = district;
		this.city = city;
	}
	
	public Address(int id,int number, String street, String district, String city) {
		super();
		this.id = id;
		this.number = number;
		this.street = street;
		this.district = district;
		this.city = city;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
