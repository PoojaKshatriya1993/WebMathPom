package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutWebmathPage {
	
	WebDriver driver;
	 By aboutwebmath = By.linkText("About WebMath");
	 
	 public AboutWebmathPage (WebDriver driver) {
		   this.driver = driver;
	}
	 
	 public void ClickOnAboutWebmath() {
		 driver.findElement(aboutwebmath).click();
	 }

}
