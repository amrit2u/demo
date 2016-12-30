package com.visier.selenium.demo.solution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.visier.selenium.demo.common.CommonHelper;
import com.visier.selenium.demo.common.CommonPageMap;
import com.visier.selenium.demo.toolkit.MasterHelper;
import com.visier.selenium.demo.toolkit.TestVisierException;

/**
 * @description If the code of tests is reusable then it should probably become
 *              a helper. This class contain helper for Solution page
 *              functionality
 * @author amrit kumar
 */
public abstract class SolutionHelper extends CommonHelper {

	/**
	 * This method is to fill required info in product capability book download
	 * form. Parameter input need to be provided from global.properties file
	 * 
	 */

	public void fillRequiredInfo(String userFirstName, String userLastName,
			String userJobTitle, String userCompany, String userEmail,
			String country) {

		this.waitAndClick(VisierSolutionPageMap.userFirstName);
		this.setText(VisierSolutionPageMap.userFirstName, userFirstName);

		this.waitAndClick(VisierSolutionPageMap.userLastName);
		this.setText(VisierSolutionPageMap.userLastName, userLastName);

		this.waitAndClick(VisierSolutionPageMap.userJobTitle);
		this.setText(VisierSolutionPageMap.userJobTitle, userJobTitle);

		this.waitAndClick(VisierSolutionPageMap.userCompany);
		this.setText(VisierSolutionPageMap.userCompany, userCompany);

		this.waitAndClick(VisierSolutionPageMap.userEmail);
		this.setText(VisierSolutionPageMap.userEmail, userEmail);

		new Select(VisierSolutionPageMap.userCountry)
				.selectByVisibleText("Canada");

	}

	public void navigateToSolutionSubMenu(String subMenu) {
		String index = "";
		if (subMenu.equalsIgnoreCase("overview")) {
			index = "menu-overview";
		} else if (subMenu.equalsIgnoreCase("organize")) {
			index = "menu-overview";
		} else if (subMenu.equalsIgnoreCase("plan")) {
			index = "menu-plan";
		} else if (subMenu.equalsIgnoreCase("acquire")) {
			index = "menu-acquire";
		} else if (subMenu.equalsIgnoreCase("reward")) {
			index = "menu-reward";
		} else if (subMenu.equalsIgnoreCase("develop")) {
			index = "menu-develop";
		}
		WebElement tabLocator = this.getSolutionSubMenuWebElement(index);
		tabLocator.click();
	}

	private WebElement getSolutionSubMenuWebElement(String tabIndex) {
		WebElement tabId = MasterHelper
				.getWebdriver()
				.findElement(
						(By.cssSelector("#menu-new-main-visier-nav > li.dropdown.menu-solution > ul > li."
								+ tabIndex)));
		return tabId;
	}

}
