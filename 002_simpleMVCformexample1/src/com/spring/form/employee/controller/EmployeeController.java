package com.spring.form.employee.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.form.employee.bean.EmployeeBean;

@Controller
//@RequestMapping("/employee")
public class EmployeeController {
	  @RequestMapping("/employeeform")  
	    public ModelAndView showform(){   
	        return new ModelAndView("employeeform","command",new EmployeeBean());  
	    }  
	    @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public ModelAndView save(@ModelAttribute EmployeeBean employeebean){  
	        System.out.println(employeebean.getName()+" "+employeebean.getSalary()+" "+employeebean.getDesignation()); 
	        return new ModelAndView("redirect:/viewemp"); 
	    }  
	      
	    @RequestMapping("/viewemployee")  
	    public ModelAndView viewemp(){ 
	        List<EmployeeBean> list=new ArrayList<EmployeeBean>();  
	        list.add(new EmployeeBean(1,"rahul","S.Engineer",35000f));  
	        list.add(new EmployeeBean(2,"aditya","IT Manager",25000f));  
	        list.add(new EmployeeBean(3,"sachin","Care Taker",55000f));  
	          
	        return new ModelAndView("viewemp","list",list);  
	    }  
	    
	    @RequestMapping(value="/save",method=RequestMethod.POST)
	    public ModelAndView save()
	    {
	    	return new ModelAndView("redirect:viewemployee.html");
	    }
	    
	    @RequestMapping(value="/index",method=RequestMethod.GET)
	    public ModelAndView welcome()
	    {
	    	return new ModelAndView("index");
	    }
	    
}
