$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EmpContactDetails.feature");
formatter.feature({
  "name": "Employee Contact Details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Admin should ba able to change employee contact details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user logins with valid admin credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on PIM then on Employee list",
  "keyword": "And "
});
formatter.step({
  "name": "user enters employee id \"14325\" and clicks on search button",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on user id link",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Contact Details and is navigated to that page",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on Edit button and modifies contact details \"\u003cAddress Street 1 \u003e\", \"\u003cAddress Street 2\u003e\",\"\u003cCity \u003e\",\"\u003cState/Province \u003e\",\"\u003cZip/Postal Code\u003e\", \"\u003cCountry\u003e\",\"\u003cHome Telephone\u003e\",\"\u003cMobile\u003e\",\"\u003cWork Telephone\u003e\", \"\u003cWork Email \u003e\", \"\u003cOther Email \u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "admin saves the modifications",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Address Street 1",
        "Address Street 2",
        "City",
        "State/Province",
        "Zip/Postal Code",
        "Country",
        "Home Telephone",
        "Mobile",
        "Work Telephone",
        "Work Email",
        "Other Email"
      ]
    },
    {
      "cells": [
        "12345 Strawberry Dr.",
        "suite 302",
        "Mclean",
        "VA",
        "54321",
        "U.S.",
        "703-334-2343",
        "571-342-6677",
        "703-445-6752",
        "work@gmail.com",
        "SaraSmith@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Admin should ba able to change employee contact details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user logins with valid admin credentials",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on PIM then on Employee list",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters employee id \"14325\" and clicks on search button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on user id link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on Contact Details and is navigated to that page",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on Edit button and modifies contact details \"\u003cAddress Street 1 \u003e\", \"suite 302\",\"\u003cCity \u003e\",\"\u003cState/Province \u003e\",\"54321\", \"U.S.\",\"703-334-2343\",\"571-342-6677\",\"703-445-6752\", \"\u003cWork Email \u003e\", \"\u003cOther Email \u003e\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "admin saves the modifications",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});