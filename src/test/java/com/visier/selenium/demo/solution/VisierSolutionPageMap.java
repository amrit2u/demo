package com.visier.selenium.demo.solution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visier.selenium.demo.common.CommonPageMap;

/**
 * This class contain WebElement locator used in the tests and helper methods of
 * this package. It suppose to contain web element which are specific to
 * "Events" page
 * 
 * @author amrit kumar
 */

public class VisierSolutionPageMap extends CommonPageMap {

	public VisierSolutionPageMap(WebDriver webDriver) {
		super(webDriver);
	}

	// WebElement locator which will get initialized by PageFactory

	// Solution Overview Page Content
	@FindBy(css = "div[class='content-inner']")
	public static WebElement solutionOverviewPageContent;
	
	// Product Capability Book Download link
	@FindBy(css = "#main > section.section.splash.fullpage-block.height-auto > div.content > div > div:nth-child(3) > a")
	public static WebElement productCapabilityBookDownload;

	// Product Capability Book Download form
	@FindBy(css = "div[id='top_marketo_form']")
	public static WebElement productCapabilityBookDownloadForm;

	// UserFirstName text field
	@FindBy(css = "input[id='FirstName']")
	public static WebElement userFirstName;

	// UserLastName text field
	@FindBy(css = "input[id='LastName']")
	public static WebElement userLastName;

	// UserJobTitle text field
	@FindBy(css = "input[id='Title']")
	public static WebElement userJobTitle;

	// UserEmail text field
	@FindBy(css = "input[id='Email']")
	public static WebElement userEmail;

	// Company field
	@FindBy(css = "input[id='Company']")
	public static WebElement userCompany;

	// Country field
	@FindBy(css = "select[id='Country']")
	public static WebElement userCountry;

	// Download button
	@FindBy(css = "button[class='mktoButton']")
	public static WebElement downloadButton;
	
	// None of the above option in verify company popup
	@FindBy(css = "	#RFDisplayFrame > table > tbody > tr.tabCompNATR > td > div > div.divCompNAName")
	public static WebElement noneOfTheAboveVerifyCompany;
	
	// Download link for product capability book 
	@FindBy(css = "#top-gated > div > div.row > div > div > div:nth-child(2) > div > a")
	public static WebElement downloadProductCapabilityBookLink;


	// ----------------------------------------------------

	// CSS selector constants. We need CSS selector sometime as required by
	// WebDriver api

}
