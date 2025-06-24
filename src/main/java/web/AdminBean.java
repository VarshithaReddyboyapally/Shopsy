package web;

import java.io.Serializable;
@SuppressWarnings("serial")
//It implements the Serializable interface, meaning objects of this class can be saved or transmitted.
public class AdminBean implements Serializable{
	private String name;
	private String email;
	private Long phno;
	private String password;
	private String cpassword;
	
	public AdminBean() {
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCPassword() {
		return cpassword;
	}

	public void setCPassword(String cpassword) {
		this.cpassword = cpassword;
	}
public String getName() {
	return name;

	}

public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getphno() {
	return phno;
}
public void setPhno(Long phno) {
	this.phno=phno;
}

public String getPassword() {
	return password;
}



}
