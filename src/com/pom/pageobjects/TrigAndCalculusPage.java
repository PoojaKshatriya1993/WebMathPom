package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrigAndCalculusPage {
	
	WebDriver driver;
	
	By trigandcalculus = By.linkText("Trig. & Calculus");
	By dropdown = By.name("topicItem");
	By complexnumbersaddingof = By.xpath("//*[@id=\"topicItem\"]/option[7]");
	By inputvalue = By.name("s");
	By clickheretoadd = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/font/b/form/center/p[2]/input[1]");
	
	public TrigAndCalculusPage (WebDriver driver) {
		   this.driver = driver;
	}
	
	public void ClickOnTrigAndCalculus() {
		driver.findElement(trigandcalculus).click();
	}
	
	public void ClickOnDropdown() {
		driver.findElement(dropdown).click();
	}
	
	public void ClickOnComplexNumbersAddingOf() {
		driver.findElement(complexnumbersaddingof).click();
	}
	
	public void ClickOnInputValue() {
		driver.findElement(inputvalue).sendKeys("2i+3 + 4i");
	}
	
	public void ClickOnClickHereToadd() {
		driver.findElement(clickheretoadd).click();
	}
}
