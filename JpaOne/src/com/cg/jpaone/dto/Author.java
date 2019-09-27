package com.cg.jpaone.dto;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
	public BigInteger authorId;
	public String firstName;
	public String middleName;
	public String lastName;
	public BigInteger phoneNo;
	public Author() {
		super();
	}
	public Author(BigInteger authorId, String firstName, String middleName, String lastName, BigInteger phoneNo) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	public BigInteger getAuthorId() {
		return authorId;
	}
	public void setAuthorId(BigInteger authorId) {
		this.authorId = authorId;
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
	public BigInteger getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(BigInteger phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}

}
