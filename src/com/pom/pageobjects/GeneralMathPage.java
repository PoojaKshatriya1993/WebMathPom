package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralMathPage {
	WebDriver driver;
	By generalmath = By.xpath("//*[@id=\"navBox-2\"]/a");
	By dropdown = By.name("topicItem");
	By calculusintegration = By.xpath("//*[@id=\"topicItem\"]/option[3]");
	By input = By.name("s");
	By integrate = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p/input[1]");
    By decimaltofraction = By.linkText("Decimal to Fraction");
    By decimalinput = By.name("decimal");
    By convertit = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/center/table/tbody/tr/td[2]/form/center/p[2]/input[3]");


public GeneralMathPage (WebDriver driver) {
	   this.driver = driver;
}
	   
	   public void ClickOnGeneralMath(){
		   driver.findElement(generalmath).click();
	   }
	   
	   public void ClickOnDropdown() {
		   driver.findElement(dropdown);
	   }
	   
	   public void ClickOnCalculusIntegration() {
		   driver.findElement(calculusintegration).click();
	   }
	   
	   public void ClickOninput() {
		   driver.findElement(input).sendKeys("12");
	   }
	   
	   public void ClickOnIntegrate() {
		   driver.findElement(integrate).click();
	   }
	   
	   public void ClickOnDecimalToFraction() {
		   driver.findElement(decimaltofraction).click();
	   }
	   
	   public void ClickOnDecimalInput() {
		   driver.findElement(decimalinput).sendKeys("125.25");
	   }
	   
	   public void ClickOnConvertIt() {
		   driver.findElement(convertit).click();
	   }
}

