package com.steps;



import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmpSteps extends CommonMethods{
	@Given("user logins with valid admin credentials")
	public void user_logins_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
	}

	@Given("user clicks on PIM then on Employee list")
	public void user_clicks_on_PIM_then_on_Employee_list() {
		jsClick(dashboard.PIM);
		jsClick(dashboard.empListPage);
	   
	
	}
	@When("user enters employee id {string} and clicks on search button")
	public void user_enters_employee_id_and_clicks_on_search_button(String empID) {
		 sendText(viewEmp.empID, empID);
		 jsClick(viewEmp.searchBtn);
	}
	
	@When("user clicks on user id link")
	public void user_clicks_on_user_id_link() {
	jsClick(viewEmp.idLink);
	
	}
	
	@When("user clicks on Contact Details and is navigated to that page")
	public void user_clicks_on_Contact_Details_and_is_navigated_to_that_page() {
	jsClick(viewEmp.CDbutton);
	}
	
	@When("user clicks on Edit button and modifies contact details {string}, {string},{string},{string},{string}, {string},{string},{string},{string}, {string}, {string}")
	public void user_clicks_on_Edit_button_and_modifies_contact_details(String address1, String address2, String city, String state, String zipcode, String country, String homeTelephone, String mobile, String workTelephone, String workEmail, String otherEmail) {
	  jsClick(viewEmp.EditButton);
	  sendText(viewEmp.add1,address1);
	  wait(2);
	  sendText(viewEmp.add2,address2);
	  wait(2);
	  sendText(viewEmp.city,city);
	  wait(2);
	  sendText(viewEmp.state,state);
	  wait(2);
	  sendText(viewEmp.zipcode,zipcode);
	  wait(2);
	  selectDdValue(viewEmp.country, "United States");
	  wait(2);
	  sendText(viewEmp.homeTel,homeTelephone);
	  wait(2);
	  sendText(viewEmp.mobile,mobile);
	  wait(2);
	  sendText(viewEmp.workTel,workTelephone);
	  wait(2);
	  sendText(viewEmp.workEmail,workEmail);
	  wait(2);
	  sendText(viewEmp.otherEmail,otherEmail);

		
		}
	

	@Then("admin saves the modifications")
	public void admin_saves_the_modifications() {
	 jsClick(viewEmp.save);
	}



}
