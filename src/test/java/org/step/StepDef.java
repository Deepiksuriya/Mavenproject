package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	WebDriver driver;
	
	

@Given("url should be launched")
public void url_should_be_launched() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
  
}
@When("user enters the {string} and {string}")
public void user_enters_the_and(String username, String password) {
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("pass")).sendKeys(password);
	driver.findElement(By.name("login")).click();





}

	
	
	
	
	
	
	
	
	
	
	
}
