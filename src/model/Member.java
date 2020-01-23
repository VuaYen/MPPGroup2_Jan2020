package model;

import java.util.*;

public class Member {

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getMemNO() {
		return memNO;
	}

	public void setMemNO(int memNO) {
		this.memNO = memNO;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	private Address address;
	private List<CheckOutRecord> checkOutRecords;

	private  int memNO;
	private String firstName;
	private String lastName;
	private String tel;
	
	public Member(int memNO, String firstName, String lastName, String tel, Address address) {
		super();
		this.address = address;
		this.memNO = memNO;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tel = tel;
		this.checkOutRecords = new ArrayList<CheckOutRecord>();
	}

	public List<CheckOutRecord> getCheckOutRecords() {
		return checkOutRecords;
	}

	public void setCheckOutRecords(List<CheckOutRecord> checkOutRecords) {
		this.checkOutRecords = checkOutRecords;
	}
	
	

	
}