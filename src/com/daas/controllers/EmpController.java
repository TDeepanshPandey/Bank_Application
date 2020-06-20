package com.daas.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daas.beans.Emp;
import com.daas.dao.EmpDao;
@Controller
public class EmpController {
    @Autowired
	EmpDao dao;
    
    
	@RequestMapping("/empform")
	public ModelAndView showform(){
		return new ModelAndView("empform","command",new Emp());
	}

	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save(@Valid Emp emp, BindingResult bindingresult){
		if(bindingresult.hasErrors())
		{
				return new ModelAndView("failureregister","message","Failed");			
		}
		else
		{	
			dao.save(emp);
			return new ModelAndView("successregister","message","Successful");		
		}
	}
	
	
	
	
	@RequestMapping("/depositpage")
	public ModelAndView depositform(){
		return new ModelAndView("deposit","command",new Emp());
	}
	@RequestMapping(value="/deposit",method = RequestMethod.POST)
	public ModelAndView deposit(@ModelAttribute("emp") Emp emp){
		dao.deposit(emp);
		return new ModelAndView("successdeposit","message","You have successfully deposited");//will redirect to viewemp request mapping
	}
	
	
	
	
	@RequestMapping("/withdrawpage")
	public ModelAndView withdrawform(){
		return new ModelAndView("withdraw","command",new Emp());
	}
	@RequestMapping(value="/withdraw",method = RequestMethod.POST)
	public ModelAndView withdraw(@ModelAttribute("emp") Emp emp){
		int j = dao.getBank(emp);
		if(emp.getAmount() > j)
		{
			return new ModelAndView("failurewithdraw","message","Null");//will redirect to viewemp request mapping	
		}
		else{
		dao.withdraw(emp);
		return new ModelAndView("successwithdraw","message","You have successfully withdraw");//will redirect to viewemp request mapping
	}}
	
	@RequestMapping("/getbalance")
	public ModelAndView balanceform(){
		return new ModelAndView("balance","command",new Emp());
	}
	@RequestMapping(value="/balance",method = RequestMethod.POST)
	public ModelAndView balance(@ModelAttribute("emp") Emp emp){
		int j = dao.balance(emp);
		return new ModelAndView("redirect:/viewbalance","message",j);//will redirect to viewemp request mapping
	}
	
	@RequestMapping("/viewbalance")
	public ModelAndView viewbalance(int message){
		List<Emp> list=dao.getBalance(message);
		return new ModelAndView("viewbalance","list",list);
	}
	
	@RequestMapping("/report")
	public ModelAndView reportform(){
		return new ModelAndView("record","command",new Emp());
	}
	@RequestMapping(value="/record",method = RequestMethod.POST)
	public ModelAndView record(@ModelAttribute("emp") Emp emp){
		int j = dao.record(emp);
		return new ModelAndView("redirect:/viewrecord","message",j);//will redirect to viewemp request mapping
	}
	
	@RequestMapping("/viewrecord")
	public ModelAndView viewemp(int message){
		List<Emp> list=dao.getEmployees(message);
		return new ModelAndView("viewrecord","list",list);
	}
	
	@RequestMapping("/login")
	public ModelAndView loginform(){
		return new ModelAndView("loginform","command",new Emp());
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("emp") Emp emp){
		int j = dao.login(emp);
		if(j == 0)
		return new ModelAndView("failure","message","Wrong Credentials");//will redirect to viewemp request mapping
		else
		{
			String name = emp.getUsername(); 
			String firstLetter = name.substring(0,1).toUpperCase();
		        	String restLetters = name.substring(1).toLowerCase();
		        	String message = firstLetter + restLetters;
		return new ModelAndView("mainmenu","message",message);
		}
	}

	@RequestMapping("/logout")
	public ModelAndView logout(@ModelAttribute("emp") Emp emp){
		return new ModelAndView("logout","message","Successfully ");//will redirect to viewemp request mapping
	}
	
	
	@RequestMapping("/newuser")
	public ModelAndView newuserform(){
		return new ModelAndView("newuser","message","Null");
	}
	
	@RequestMapping("/index")
	public ModelAndView indexform(){
		return new ModelAndView("index","message","Null");
	}
}