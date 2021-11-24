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
public class Empolyee {
	private String role;
	private String dateStart;

	public Empolyee() {
		super();
	}

	public Empolyee(String role, String dateStart) {
		super();
		this.role = role;
		this.dateStart = dateStart;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

}
