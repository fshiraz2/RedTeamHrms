package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.testbase.BaseClass;
import com.utils.CommonMethods;



public class ViewEmpPE extends CommonMethods {


		@FindBy(id = "empsearch_id")
		public WebElement empID;

		@FindBy(id = "searchBtn")
		public WebElement searchBtn;
		
        @FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")
        public WebElement idLink;//id link when you search employee in employee list

        @FindBy(xpath="//*[@id=\"sidenav\"]/li[2]/a")
        public WebElement CDbutton;//contact details button
        
        @FindBy (xpath="//*[@id=\"btnSave\"]")
        public WebElement EditButton;//edit button in contact details
        
        //below are elements for contact details text boxes
        
        @FindBy (id="contact_street1")
        public WebElement add1;
        
        @FindBy (id="contact_street2")
        public WebElement add2;
        
        @FindBy (id="contact_city")
        public WebElement city;
        
        @FindBy (id="contact_province")
        public WebElement state;
        
        
        @FindBy (id="contact_emp_zipcode")
        public WebElement zipcode;
        
//        @FindBy (id="contact_country")
//        public WebElement country ;          //This is a dropdown
        
        @FindBy (id="contact_emp_hm_telephone")
        public WebElement homeTel ;
        
        @FindBy (id="contact_emp_mobile")
        public WebElement mobile;
        
        @FindBy (id="contact_emp_work_telephone")
        public WebElement workTel ;
        
        @FindBy (id="contact_emp_work_email")
        public WebElement workEmail;
        
        @FindBy (id="contact_emp_oth_email")
        public WebElement otherEmail ;
        
        //save button at end
        
        @FindBy(xpath="//*[@id=\"btnSave\"]")
        public WebElement save;
        
        @FindBy (id="contact_country")
        public WebElement country;
        
      
        
        
		public ViewEmpPE() {
			PageFactory.initElements(BaseClass.driver, this);
		}		
}
