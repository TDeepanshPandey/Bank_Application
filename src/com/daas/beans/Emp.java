package com.daas.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;




public class Emp {
		
	@NotNull
	private int accountid;
	
	@NotEmpty
	@Pattern(regexp="[^0-9]*")
	private String name;
	
	@Email
	private String emailid;
	
	@NotEmpty
	private String accounttype;
	
	@NotEmpty
	private String dob;
	
	@NotEmpty
	@Pattern(regexp="[^a-z]*",message="invalid.pannumber")
	private String pannumber;
	
	private String address;
	
	@NotNull
	private int pincode;
	
	@Size(min=10,max=10)
	@Pattern(regexp="[^a-z A-Z]*")
	private String mobile;
	
	private int balance = 0;
	private int amount;
	private int oldbalance;
	private int newbalance;
	private String transtype;
	private String remarks;
	private String username;
	private String password;
	public int getAccountid() {
	return accountid;
}
public void setAccountid(int accountid) {
	this.accountid = accountid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getAccounttype() {
	return accounttype;
}
public void setAccounttype(String accounttype) {
	this.accounttype = accounttype;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getPannumber() {
	return pannumber;
}
public void setPannumber(String pannumber) {
	this.pannumber = pannumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

public int getAmount()
{
	return amount;
}
public void setAmount(int amount)
{
	this.amount = amount;
}
public int getBalance()
{
	return balance;
}
public void setBalance(int balance)
{
	this.balance = balance;
}
public int getOldbalance()
{
	return oldbalance;
}
public void setOldbalance(int oldbalance)
{
	this.oldbalance = oldbalance;
}
public int getNewbalance()
{
	return newbalance;
}
public void setNewbalance(int newbalance)
{
	this.newbalance = newbalance;
}
public String getTranstype()
{
	return transtype;
}
public void setTranstype(String transtype)
{
	this.transtype = transtype;
}
public String getRemarks()
{
	return remarks;
}
public void setRemarks(String remarks)
{
	this.remarks = remarks;
}
public String getUsername()
{
	return username;
}
public void setUsername(String username)
{
	this.username = username;
}
public String getPassword()
{
	return password;
}
public void setPassword(String password)
{
	this.password = password;
}

}
