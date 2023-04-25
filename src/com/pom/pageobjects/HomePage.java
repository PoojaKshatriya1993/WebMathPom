package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By home = By.xpath("//*[@id=\"navBox-0\"]/a");
	


public HomePage (WebDriver driver) {
	   this.driver = driver;
	   
}
public void ClickOnHome() {
	   driver.findElement(home).click();
}
}
