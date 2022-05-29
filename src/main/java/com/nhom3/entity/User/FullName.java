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
public class FullName {
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;

	public FullName() {
		super();
	}
	
	public FullName(int id) {
		super();
		this.id = id;
	}
	
	public FullName(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public FullName(int id, String firstName, String middleName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.firstName + this.middleName + this.lastName;
	}
}
