package com.testbase;

import com.pages.DashboardPE;
import com.pages.LoginPE;
import com.pages.ViewEmpPE;

public class PageInitializer extends BaseClass{

		public static LoginPE login;
		public static DashboardPE dashboard;
		public static ViewEmpPE viewEmp;
		
		public static void initialize() {
			
			login=new LoginPE();
     		dashboard=new DashboardPE();
			viewEmp= new ViewEmpPE();
		}
}

