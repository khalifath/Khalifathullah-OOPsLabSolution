package com.oopslab.service;

public class CredentialsService {
	
	private String emailAddress="";
	private String password="";

	public String generateEmailAddress (String fName, String lName, String department, String company) {
		emailAddress = fName+lName+ "@" + department +"."+ company +".com";
		//System.out.println ("Email Generated is : " + emailAddress);
		return emailAddress;
	}
	
	public String generatePassword () {
		String pwdNum = "0123456789"; 
		String pwdSpl = "!@#$%^&*";
		String pwdSplChar ="AaBb!@#CcDdEeFfGgHh$%IiJjKkLlMmNnOoPpQqRrSs^&*TtUuVvWwXxYyZz";
		
		for (int i=0;i<3;i++) password += pwdNum.charAt((int)(Math.random()*pwdNum.length()));
		password += pwdSpl.charAt((int)(Math.random()*pwdSpl.length()));
		for (int i=0;i<4;i++) password += pwdSplChar.charAt((int)(Math.random()*pwdSplChar.length()));
		
		//System.out.println ("Generated Password is : " + password);
		return password;
	}
	
	public void showCredentials(String fName, String lName, String department, String company) {
		
		if (fName.isEmpty() || lName.isEmpty() || department.isEmpty() || company.isEmpty()) {
			System.out.println ("Plesae check the data passed to this function");	
		}else {
			System.out.println("Dear " +fName +" your generated credentials are as follows");
			System.out.println("Email    --> " + generateEmailAddress(fName.toLowerCase(),lName.toLowerCase(),department,company));
			System.out.println("Password --> " + generatePassword());
		}
		
	}
}
