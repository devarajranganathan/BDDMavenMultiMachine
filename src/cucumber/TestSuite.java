package cucumber;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.BeforeClass;
import org.junit.AfterClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

 
/*
 * This is a test suite class that we will create to run all our tests
 * Follow along to see how its done Pay special attention to annotations
 */
 
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "Feature"
			,glue={"stepdefinition"}
			,plugin={"pretty","html:target/htmlreport/","json:target/cucumber.json"}
			,monochrome=true
			)
 
public class TestSuite {
		

}