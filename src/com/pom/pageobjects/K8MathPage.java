package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class K8MathPage {
	WebDriver driver;
	
	By k8math = By.linkText("K-8 Math");
	By dropdown = By.name("topicItem");
	By coinscounting = By.xpath("//*[@id=\"topicItem\"]/option[5]");
	By quarters = By.name("q");
	By dimes = By.name("d");
	By nickels = By.name("n");
	By pennies = By.name("p");
	By helpmecountit = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/form/center/p[4]/input");
	
	public K8MathPage (WebDriver driver) {
		   this.driver = driver;
	}
	
	public void ClickOnK8Math() {
		driver.findElement(k8math).click();
	}
	
	public void ClickOndropdown() {
		driver.findElement(dropdown).click();
	}
	
	public void ClickOnCoinsConting() {
		driver.findElement(coinscounting).click();
	}
	
	public void ClickOnQuarters() {
		driver.findElement(quarters).sendKeys("2");
	}
	
	public void ClickOnDimes() {
		driver.findElement(dimes).sendKeys("4");
	}
	
	public void ClickOnNickels() {
		driver.findElement(nickels).sendKeys("3");
	}
	
	public void ClickOnPennies() {
		driver.findElement(pennies).sendKeys("7");
	}
	
	public void ClickOnHelpMeCountIt() {
		driver.findElement(helpmecountit).click();
	}
	
	
}