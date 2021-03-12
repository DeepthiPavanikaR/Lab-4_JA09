package com.cg.eis.pl;
import com.cg.eis.service.*;
public class InputUser {

	public static void main(String[] args) {
		Service emp=new Service();
		emp.getEmployDetails();
		emp.InsType();
		emp.Display();

	}

}