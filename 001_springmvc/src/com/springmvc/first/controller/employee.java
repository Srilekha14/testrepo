package com.springmvc.first.controller;

public class employee {
	private String name;
	//private int empid;
	private String designation;
	private double salary;
	
		public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

		public employee(String name, double salary,String designation) {
			super();
			this.name = name;
			//this.empid = empid;
			this.designation = designation;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		/*public int getEmpid() {
			return empid;
		}

		public void setEmpid(int empid) {
			this.empid = empid;
		}*/

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		
	
}
