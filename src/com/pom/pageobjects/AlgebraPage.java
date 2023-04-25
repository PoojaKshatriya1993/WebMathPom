package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlgebraPage {
	
	WebDriver driver;
	By algebra = By.linkText("Algebra");
	By dropdown = By.name("topicItem");
	By factorsgreatestcommon = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/form[2]/div/select/option[25]");
	By inputs = By.name("param0");
	By gcf = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p/input[2]");
	
	
	public AlgebraPage (WebDriver driver) {
		   this.driver = driver;
	}
	
	public void ClickOnAlgebra() {
		driver.findElement(algebra).click();
	}
	
	public void ClickOnDropDown() {
		driver.findElement(dropdown).click();
	}
	
	public void ClickOnFactorsGreatestCommon() {
		driver.findElement(factorsgreatestcommon).click();
	}
	
	public void ClickOnInputs() {
		driver.findElement(inputs).sendKeys("5","10","35");
		}
	
	public void ClickOnGCF() {
		driver.findElement(gcf).click();
	}

}
