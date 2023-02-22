package com.numadic.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.numadic.pages.HomePage;
import com.numadic.pages.JobApplicationPage;
import com.numadic.utility.SeleniumCommands;

public class Test extends SeleniumCommands {

	@BeforeClass
	public void beforeClass() throws Throwable {

		launchBrowser("Chrome");

	}

	@org.testng.annotations.Test
	public void purchaseTest() throws Throwable, Throwable {

		openApp(getProperty("url", "System"));

		HomePage home = new HomePage();
		
		String headerText = home.getJoin().getText();
		
		Assert.assertEquals(headerText, "JOIN OUR CREW");
		
		clickButton(home.getListbox());
		clickButton(home.getEngineering());
		clickButton(home.getQaEngineer());
		
		Assert.assertEquals(driver.getTitle().trim(), "Numadic Iot Pvt. Ltd. - QA Engineer in");
		
		Assert.assertTrue(home.getInterested().isDisplayed());
		
		clickButton(home.getInterested());
		
		JobApplicationPage j=new JobApplicationPage();
		Thread.sleep(2000);
		//scrollDown(j.getListbox());
		//clickButton(j.getListbox());
		//clickButton(j.getMr());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		enterText(j.getFirstName(), getProperty("firstName", "data"));
		enterText(j.getLastName(), getProperty("lastName", "data"));
		enterText(j.getEmail(), getProperty("email", "data"));
		enterText(j.getMobile(), getProperty("mobile", "data"));
		enterText(j.getStreet(), getProperty("street", "data"));
		enterText(j.getCity(), getProperty("city", "data"));
		enterText(j.getState(), getProperty("state", "data"));
		enterText(j.getZip(), getProperty("zip", "data"));
		enterText(j.getCountry(), getProperty("country", "data"));
		enterText(j.getcEmployer(), getProperty("cEmployer", "data"));
		enterText(j.getSkill(), getProperty("skill", "data"));
		enterText(j.getCurrentCTC(), getProperty("currentCTC", "data"));
		enterText(j.geteCTC(), getProperty("eCTC", "data"));
		enterText(j.getReason(), getProperty("reason", "data"));
		enterText(j.getWhyNumadic(), getProperty("whyNumadic", "data"));
		enterText(j.getLinkedin(), getProperty("linkedin", "data"));
		
	}
	
	@AfterMethod
	public void after(ITestResult r) throws Throwable {

		if(r.getStartMillis()==ITestResult.FAILURE) {
			screenShot();
		}
	}

	@AfterClass
	public void afterClass() throws Throwable {

	}

}
