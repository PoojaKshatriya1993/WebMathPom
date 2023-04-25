package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlotsAndGeometryPage {

	WebDriver driver;
	By plotsandgeametry = By.linkText("Plots & Geometry");
	By circles = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[1]");
	By radius = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/p[2]/select");
	By inputvalue = By.name("param_value");
	By diameter = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/p[3]/select/option[2]");
	By doit = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/p[4]/input");
	
	
	public PlotsAndGeometryPage (WebDriver driver) {
		   this.driver = driver;
	}
	
	public void ClickOnPlotsAndGeometry() {
		driver.findElement(plotsandgeametry).click();
	}
	
	public void ClickOnCircles() {
		driver.findElement(circles).click();
	}
	
	public void ClickOnRadius() {
		driver.findElement(radius).click();
	}
	
	public void ClickOnInputValue() {
		driver.findElement(inputvalue).sendKeys("15");
	}
	
	public void ClickOnDiameter() {
		driver.findElement(diameter).click();
	}
	
	public void ClickOnDoIt() {
		driver.findElement(doit).click();
	}
}
