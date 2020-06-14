package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		features = "src/test/resources/features/",
		glue="com/RedTeamHrms/steps", 
		dryRun=false
		,monochrome=true
		,strict=true
		,tags="@test"
		,plugin= {
				"pretty",
				"html:target/cucumber-default-report",
				"json:target/cucumber.json"
		}
		
		
		)

public class TestRunner {

}
