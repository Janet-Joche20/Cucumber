package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources\\Features", 
glue="com.stepdefinition", plugin= "html:target", tags="@smoke")

public class TestRunner {


	

}
