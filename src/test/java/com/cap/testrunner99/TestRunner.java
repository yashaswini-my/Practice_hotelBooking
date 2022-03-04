package com.cap.testrunner99;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit= "--step-notifications",
		plugin = {"json:target/cucumber.json"},
		features = "Feature"
		,glue={"step_definition"}
		,tags={"@succesful_login"}
		)
public class TestRunner {

}
