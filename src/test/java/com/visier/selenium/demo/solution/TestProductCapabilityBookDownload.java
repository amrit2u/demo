package com.visier.selenium.demo.solution;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.visier.selenium.demo.common.CommonPageMap;
import com.visier.selenium.demo.toolkit.MasterHelper;
import com.visier.selenium.demo.toolkit.TestVisierException;

/**
 * @author amrit kumar
 */

public class TestProductCapabilityBookDownload extends SolutionHelper {

	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userCompany;
	private String country;
	private String userJobtitle;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		MasterHelper.init();
		new VisierSolutionPageMap(MasterHelper.getWebdriver());
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		Properties prop = MasterHelper.loadProperties(this.m_dataFolder
				+ "productCapabilityBook.properties");
		userFirstName = prop.getProperty("userFirstName").trim();
		userLastName = prop.getProperty("userLastName").trim();
		userEmail = prop.getProperty("userEmail").trim();
		userCompany = prop.getProperty("userCompany").trim();
		country = prop.getProperty("country").trim();
		userJobtitle = prop.getProperty("jobtitle").trim();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void download_productCapabilityBook_with_validInfo() throws Exception {

		try {
			// open browser with given application
			this.openBrowser(MasterHelper.m_appUrl);
			// Home Page Validation
			assertTrue(this.waitAndCheckDisplay(CommonPageMap.homePageContent));
			// Move the mouse to given (solution) tab
			this.moveToToolbarTab("solution");
            // Navigate to given(overview) sub menu
			this.navigateToSolutionSubMenu("overview");
			// Solution overview page validation
			assertTrue(this.waitAndCheckDisplay(VisierSolutionPageMap.solutionOverviewPageContent));
			// click download button
			this.waitAndClick(VisierSolutionPageMap.productCapabilityBookDownload);
			// Download form validation
			assertTrue(this.waitAndCheckDisplay(VisierSolutionPageMap.productCapabilityBookDownloadForm));
			// Fill required info 
			this.fillRequiredInfo(userFirstName, userLastName, userJobtitle,
					userCompany, userEmail, country);
			// Download product capability book form
			this.waitAndClick(VisierSolutionPageMap.downloadButton);
			// Select none of the above in verify company pop-up
			this.waitAndClick(VisierSolutionPageMap.noneOfTheAboveVerifyCompany);
			// click download link
			this.waitAndClick(VisierSolutionPageMap.downloadProductCapabilityBookLink);
			// validation post download
			String currentUrl = this.getWebdriver().getCurrentUrl();
			String[] result = currentUrl.split("/");
			String expected = "visier-workforce-intelligence-product-capability-book";
			assertEquals(expected, result[result.length - 2]);
			Thread.sleep(10000);
			this.closeBrowser();

		} catch (Exception e) {
			throw new TestVisierException(e.getMessage());
		}
	}
}
