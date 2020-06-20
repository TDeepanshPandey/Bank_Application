package com.daas.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.daas.beans.Emp;

public class EmpDao {
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}
public int save(Emp p){
	String sql="insert into bankonlineproject(accountid,name,emailid,accounttype,dob,pannumber,address,pincode,mobile,balance) values('"+p.getAccountid()+"','"+p.getName()+"','"+p.getEmailid()+"','"+p.getAccounttype()+"','"+p.getDob()+"','"+p.getPannumber()+"','"+p.getAddress()+"','"+p.getPincode()+"','"+p.getMobile()+"','"+p.getBalance()+"')";
	int i = template.update(sql);
	return i;
}

public int deposit(Emp p)
{
	String sql ="update bankonlineproject set balance=balance+"+p.getAmount()+" where accountid="+p.getAccountid();
	int i = template.update(sql);
	return i;
}
public int withdraw(Emp p)
{
	
	String sql ="update bankonlineproject set balance=balance-"+p.getAmount()+" where accountid="+p.getAccountid();
	int i = template.update(sql);
	return i;
}
public int getBank(Emp p)
{
	String sql = "select balance from bankonlineproject where accountid ="+p.getAccountid();
	return template.queryForInt(sql);
}
public int balance(Emp emp)
{
	int j = emp.getAccountid();
	return j;
}

public int record(Emp emp)
{
	int j = emp.getAccountid();
	return j;
}
public List<Emp> getEmployees(int j){
	return template.query("select * from transactionlog where accountid="+j,new RowMapper<Emp>(){
		public Emp mapRow(ResultSet rs, int row) throws SQLException {
			Emp e=new Emp();
			e.setAccountid(rs.getInt(1));
			e.setOldbalance(rs.getInt(2));
			e.setNewbalance(rs.getInt(3));
			e.setTranstype(rs.getString(4));
			e.setRemarks(rs.getString(5));
			return e;
		}
	});
}

public List<Emp> getBalance(int j){
	return template.query("select balance,name,accountid from bankonlineproject where accountid="+j,new RowMapper<Emp>(){
		public Emp mapRow(ResultSet rs, int row) throws SQLException {
			Emp e=new Emp();
			e.setBalance(rs.getInt(1));
			e.setAccountid(rs.getInt(3));
			e.setName(rs.getString(2));
			return e;
		}
	});
}

public int login(Emp emp)
{
	String sql = "select count(*) from usercred where username = '"+emp.getUsername()+"' AND password='"+emp.getPassword()+"'";
	return template.queryForInt(sql);
}
}
