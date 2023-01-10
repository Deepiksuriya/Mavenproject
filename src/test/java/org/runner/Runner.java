package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\PREM\\eclipse-workspace\\FirstMavenProject\\src\\test\\resources\\feature",glue="org.step")

public class Runner {

}
