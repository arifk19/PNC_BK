package com.pnc.cpo.outer.dto;

import java.io.Serializable;

public class UserInfoDTO implements Serializable {

	private static final long serialVersionUID = 8671176583283455002L;

	private String firstName;
	private String lastName;
	private String companyEmail;
	private String companyName;

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

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
