package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OtherStuffPage {
	
	WebDriver driver;
	
	By otherstuff = By.linkText("Other Stuff");
	By basicmath = By.linkText("Basic math");
	By additionproblem = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/ol/li[1]/select");
	By wholenumbers = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/ol/li[2]/select");
	By largestnumber = By.name("maxnum");
	By smallestnumber = By.name("minnum");
	By answer = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/ol/li[4]/select");
	By decimalplaces = By.name("dplaces");
	By mixednumerals = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/ol/li[6]/select");
	By problemscount = By.name("count");
	
	public OtherStuffPage (WebDriver driver) {
		   this.driver = driver;
	}
	
	public void ClickOnOtherStuff() {
		driver.findElement(otherstuff).click();
	}
	
	public void ClickOnBasicMath() {
		driver.findElement(basicmath).click();
	}
	
	public void ClickOnAdditionProblem() {
		driver.findElement(additionproblem).click();
	}
	
	public void ClickOnWholeNumbers() {
		driver.findElement(wholenumbers).click();
	}
	
	public void ClickOnLargestNumber() {
		driver.findElement(largestnumber).sendKeys("30");
	}
	
	public void ClickOnSmallestNumber() {
		driver.findElement(smallestnumber).sendKeys("3");
	}
	
	public void ClickOnAnswer() {
		driver.findElement(answer).click();
	}
	
	public void ClickOnDecimalPlaces() {
		driver.findElement(decimalplaces).sendKeys("3");
	}
	
	public void ClickOnMixedNumerals() {
		driver.findElement(mixednumerals).click();
	}
	
	public void ClickOnProblemsCount() {
		driver.findElement(problemscount).sendKeys("2");
	}

}
