package com.febin.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="is Required")
	@Size(min=1,message ="isRequired")
	private String lastName;
	
	@Min(value=0 ,message="must be greater or equal to 0")
	@Max(value=10 ,message="must be less or equal to 10")
	@NotNull(message="is Required")
	private int freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 characters or digits")
	private String postalCode;
	
	
	
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
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
	
	

}
