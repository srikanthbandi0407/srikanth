package Cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/features" 
 ,glue={"StepDefinations"},stepNotifications=true
 
 )  

public class TestRunner   {

}