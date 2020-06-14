

Feature: Employee Contact Details

  Scenario Outline: Admin should ba able to change employee contact details 
    Given user logins with valid admin credentials
    And user clicks on PIM then on Employee list 
    When user enters employee id "14325" and clicks on search button
    And user clicks on user id link
    When user clicks on Contact Details and is navigated to that page
    When user clicks on Edit button and modifies contact details "<Address Street 1>", "<Address Street 2>","<City>","<State/Province>","<Zip/Postal Code>", "<Country>","<Home Telephone>","<Mobile>","<Work Telephone>", "<Work Email>", "<Other Email>"
    Then admin saves the modifications 
    
    Examples:
    
    
   | Address Street 1    | Address Street 2 | City     | State/Province | Zip/Postal Code | Country | Home Telephone | Mobile      | Work Telephone | Work Email     | Other Email         |
   |12345 Strawberry Dr. | suite 302        | Mclean   | VA             | 54321           | U.S.    | 703-334-2343   | 571-342-6677| 703-445-6752   | work@gmail.com | SaraSmith@gmail.com |
    
  
    
    
   


 
 
  
    
    