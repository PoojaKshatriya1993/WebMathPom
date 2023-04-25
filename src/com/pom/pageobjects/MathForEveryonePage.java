package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MathForEveryonePage {
	
	WebDriver driver;
	By mathforeveryone = By.xpath("//*[@id=\"navBox-1\"]/a");
	By dropdown = By.name("topicItem");
    By conversionmass = By.xpath("//*[@id=\"topicItem\"]/option[14]");
    By input = By.name("param0");
    By grams = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/font/form/b/center/p[1]/select/option[1]");
    By kilograms = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/font/form/b/center/p[1]/select/option[3]");
    By convert = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/font/form/b/center/p[4]/input[1]");
    By compoundinterest = By.linkText("Compound Interest");
    By principleamount = By.name("principal");
    By interestrate = By.name("interest");
    By compoundyear = By.name("compound");
    By principleafteryears = By.name("desired_time");
    By newamountofmoney = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/font/b/form/center[5]/input");
    
public MathForEveryonePage (WebDriver driver) {
	   this.driver = driver;

}
public void ClickOnMathForEveryone() {
	driver.findElement(mathforeveryone).click();
}

public void ClickOnDropdown() {
	driver.findElement(dropdown).click();
}

public void ClickOnConversionMass() {
	driver.findElement(conversionmass).click();
}

public void ClickOnInput()  {
	driver.findElement(input).sendKeys("1000");
}


public void ClickOnGrams() {
	driver.findElement(grams).click();
}

public void ClickOnKilograms() {
	driver.findElement(kilograms).click();
}

public void ClickOnConvert() {
	driver.findElement(convert).click();
}

public void ClickOnCompoundInterest() {
	driver.findElement(compoundinterest).click();
}

public void ClickOnPrincipleAmount() {
	driver.findElement(principleamount).sendKeys("100000");
}

public void ClickOnInterestRate() {
	driver.findElement(interestrate).sendKeys("8");
}

public void ClickOnCompoundYear() {
	driver.findElement(compoundyear).sendKeys("3");
}

public void ClickOnPrincipleAfterYears() {
	driver.findElement(principleafteryears).sendKeys("2");
}

public void ClickOnNewAmountOfMoney() {
	driver.findElement(newamountofmoney).click();
}
}
