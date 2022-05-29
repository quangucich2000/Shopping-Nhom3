package com.nhom3.entity.User;

public class User {

	private int id;
	public String mobile;
	private String sex;
	private String dateOfBirth;
	private Account account;
	private Address address;
	private FullName fullName;
	private Customer customer;
	private Empolyee empolyee;

	public User() {
	}
	
	public User(Account account) {
		super();
		this.account = account;
	}

	public User(String mobile, Account account) {
		super();
		this.mobile = mobile;
		this.account = account;
	}

	public User(int id,String mobile, String sex, String dateOfBirth) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
	}

	public User(String mobile, Account account, Customer customer, Empolyee empolyee) {
		super();
		this.mobile = mobile;
		this.account = account;
		this.customer = customer;
		this.empolyee = empolyee;
	}
	
	public User(int id, String mobile, String sex, String dateOfBirth,int fullNameId, int accountId, int addressId) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
		this.fullName = new FullName(fullNameId);
		this.account = new Account(accountId);
		this.address = new Address(addressId);
	}

	public User(int id, String mobile, String sex, String dateOfBirth, Account account, Address address,
			FullName fullName) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
		this.account = account;
		this.address = address;
		this.fullName = fullName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.mobile+this.dateOfBirth + this.sex;
	}
}
