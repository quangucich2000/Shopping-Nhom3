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
public class Account {
	private int id;
	private String username;
	private String password;

	public Account() {
		super();
	}
	
	public Account(int id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	
	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Account(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
