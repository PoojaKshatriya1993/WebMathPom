package com.pom.main;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.pageobjects.AboutWebmathPage;
import com.pom.pageobjects.AlgebraPage;
import com.pom.pageobjects.ContactUsPage;
import com.pom.pageobjects.GeneralMathPage;
import com.pom.pageobjects.HomePage;
import com.pom.pageobjects.K8MathPage;
import com.pom.pageobjects.MathForEveryonePage;
import com.pom.pageobjects.OtherStuffPage;
import com.pom.pageobjects.PlotsAndGeometryPage;
import com.pom.pageobjects.TrigAndCalculusPage;

public class WebMath_POMMain {
	
	public static void main(String[] args) {
		try {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://webmath.com/");
			Thread.sleep(2000);
			
			HomePage hp = new HomePage(driver);
			hp.ClickOnHome();
			Thread.sleep(2000);
			
			MathForEveryonePage mfep = new MathForEveryonePage(driver);
			mfep.ClickOnMathForEveryone();
			Thread.sleep(2000);
			mfep.ClickOnDropdown();
			Thread.sleep(2000);
			mfep.ClickOnConversionMass();
			Thread.sleep(2000);
			mfep.ClickOnInput(); 
			Thread.sleep(2000);
		    mfep.ClickOnGrams();
			Thread.sleep(2000);
			mfep.ClickOnKilograms();
			Thread.sleep(2000);
			mfep.ClickOnConvert();
			Thread.sleep(2000);
			mfep.ClickOnMathForEveryone();
			Thread.sleep(2000);
			mfep.ClickOnCompoundInterest();
			Thread.sleep(2000);
			mfep.ClickOnPrincipleAmount();
			Thread.sleep(2000);
			mfep.ClickOnInterestRate();
			Thread.sleep(2000);
			mfep.ClickOnCompoundYear();
			Thread.sleep(2000);
			mfep.ClickOnPrincipleAfterYears();
			Thread.sleep(2000);
			mfep.ClickOnNewAmountOfMoney();
			Thread.sleep(2000);
			
			
			GeneralMathPage gmp = new GeneralMathPage(driver);
			Thread.sleep(2000);
			gmp.ClickOnGeneralMath();
			Thread.sleep(2000);
			gmp.ClickOnDropdown();
			Thread.sleep(2000);
			gmp.ClickOnCalculusIntegration();
			Thread.sleep(2000);
			gmp.ClickOninput();
			Thread.sleep(2000);
			gmp.ClickOnIntegrate();
			Thread.sleep(2000);
			gmp.ClickOnGeneralMath();
			Thread.sleep(2000);
			gmp.ClickOnDecimalToFraction();
			Thread.sleep(2000);
			gmp.ClickOnDecimalInput();
			Thread.sleep(2000);
			gmp.ClickOnConvertIt();
			Thread.sleep(2000);
			
			K8MathPage kmp = new K8MathPage(driver);
			Thread.sleep(2000);
			kmp.ClickOnK8Math();
			Thread.sleep(2000);
			kmp.ClickOnK8Math();
			Thread.sleep(2000);
			kmp.ClickOnCoinsConting();
			Thread.sleep(2000);
			kmp.ClickOnQuarters();
			Thread.sleep(2000);
			kmp.ClickOnDimes();
			Thread.sleep(2000);
			kmp.ClickOnNickels();
			Thread.sleep(2000);
			kmp.ClickOnPennies();
			Thread.sleep(2000);
			kmp.ClickOnHelpMeCountIt();
			Thread.sleep(2000);
			
			AlgebraPage ap = new AlgebraPage(driver);
			Thread.sleep(2000);
			ap.ClickOnAlgebra();
			Thread.sleep(2000);
			ap.ClickOnDropDown();
			Thread.sleep(2000);
			ap.ClickOnFactorsGreatestCommon();
			Thread.sleep(2000);
			ap.ClickOnInputs();
			Thread.sleep(2000);
			ap.ClickOnGCF();
			Thread.sleep(2000);
			
			PlotsAndGeometryPage pagp = new PlotsAndGeometryPage(driver);
			Thread.sleep(2000);
			pagp.ClickOnPlotsAndGeometry();
			Thread.sleep(2000);
			pagp.ClickOnCircles();
			Thread.sleep(2000);
			pagp.ClickOnRadius();
			Thread.sleep(2000);
			pagp.ClickOnInputValue();
			Thread.sleep(2000);
			pagp.ClickOnDiameter();
			Thread.sleep(2000);
			pagp.ClickOnDoIt();
			Thread.sleep(2000);
			
			TrigAndCalculusPage tacp = new TrigAndCalculusPage(driver);
			Thread.sleep(2000);
			tacp.ClickOnTrigAndCalculus();
			Thread.sleep(2000);
			tacp.ClickOnDropdown();
			Thread.sleep(2000);
			tacp.ClickOnComplexNumbersAddingOf();
			Thread.sleep(2000);
			tacp.ClickOnInputValue();
			Thread.sleep(2000);
			tacp.ClickOnClickHereToadd();
			Thread.sleep(2000);
			
			OtherStuffPage osp = new OtherStuffPage(driver);
			Thread.sleep(2000);
			osp.ClickOnOtherStuff();
			Thread.sleep(2000);
			osp.ClickOnBasicMath();
			Thread.sleep(2000);
			osp.ClickOnAdditionProblem();
			Thread.sleep(2000);
			osp.ClickOnWholeNumbers();
			Thread.sleep(2000);
			osp.ClickOnLargestNumber();
			Thread.sleep(2000);
			osp.ClickOnSmallestNumber();
			Thread.sleep(2000);
			osp.ClickOnAnswer();
			Thread.sleep(2000);
			osp.ClickOnDecimalPlaces();
			Thread.sleep(2000);
			osp.ClickOnMixedNumerals();
			Thread.sleep(2000);
			osp.ClickOnProblemsCount();
			Thread.sleep(2000);
			
			ContactUsPage cup = new ContactUsPage(driver);
			Thread.sleep(2000);
			cup.ClickOnContactUs();
			Thread.sleep(2000);
			
			AboutWebmathPage awp = new AboutWebmathPage(driver);
			Thread.sleep(2000);
			awp.ClickOnAboutWebmath();
			Thread.sleep(2000);
			
			driver.quit();

			
		} catch (Exception e) {

		}
}
}
