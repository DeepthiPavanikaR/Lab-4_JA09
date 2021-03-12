package com.cg.eis.service;
import java.util.*;
import com.cg.eis.bean.*;
public class Service implements EmployeeService{
	Scanner sc=new Scanner(System.in);
	Employee e=new Employee();
	 public void getEmployDetails() {
		 System.out.println("Enter Details:");
		 System.out.println("Enter id:");e.setId(sc.nextInt());
		 System.out.println("Enter salary:");e.setSalary(sc.nextInt());
		 System.out.println("Enter Designation:");e.setDesignation(sc.next());
		 System.out.println("Enter Name:");e.setName(sc.next());
		 
		 
	 }
	 public void InsType() {
		 System.out.println("=======Insurance Scheme for Employee=======");
		 if(e.getSalary()<10000)
			 e.setinsuranceScheme("Tier 1");
		 else
			 e.setinsuranceScheme("Tier 2");
		System.out.println(e.getinsuranceScheme());
			 }
	 public void Display() {
		 System.out.println("=====Details======");
		 System.out.println("Name: "+e.getName());
		 System.out.println("Id: "+e.getId());
		 System.out.println("Salary: "+e.getSalary());
		 System.out.println("Desig: "+e.getDesignation());
		 System.out.println("INsSch: "+e.getinsuranceScheme());
	 }
}
