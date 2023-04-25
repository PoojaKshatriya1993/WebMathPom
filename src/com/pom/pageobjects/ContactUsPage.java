package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
	
	WebDriver driver;
	
	By contactus = By.linkText("Contact Us");
	
	public ContactUsPage (WebDriver driver) {
		   this.driver = driver;
	}
	
	public void ClickOnContactUs() {
		driver.findElement(contactus).click();
	}


}
