package com.visier.selenium.demo.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.visier.selenium.demo.common.CommonPageMap;
import com.visier.selenium.demo.solution.VisierSolutionPageMap;
import com.visier.selenium.demo.toolkit.MasterHelper;
import com.visier.selenium.demo.toolkit.TestVisierException;

/**
 * @description If the code of tests is reusable then it should probably become
 *              a helper. This class contain helper for common functionality in
 *              Visier Website.
 * @author amrit kumar
 */

public abstract class CommonHelper extends MasterHelper {

	public void moveToToolbarTab(String tab) throws Exception {
		String index = "";
		if (tab.equalsIgnoreCase("blog")) {
			index = "active.menu-blog";
		} else if (tab.equalsIgnoreCase("solution")) {
			index = "dropdown.menu-solution";
		} else if (tab.equalsIgnoreCase("industries")) {
			index = "dropdown.menu-industries";
		} else if (tab.equalsIgnoreCase("customerSuccess")) {
			index = "dropdown.menu-customer-success";
		} else if (tab.equalsIgnoreCase("resources")) {
			index = "dropdown.menu-resources";
		} else if (tab.equalsIgnoreCase("about")) {
			index = "dropdown.menu-about";
		}
		WebElement tabLocator = this.getTabWebElement(index);
		Actions action = new Actions(MasterHelper.getWebdriver());
		action.moveToElement(tabLocator).release().perform();
	}

	public WebElement getTabWebElement(String tabIndex) {
		WebElement tabId = MasterHelper.getWebdriver().findElement(
				(By.cssSelector("#menu-new-main-visier-nav > li." + tabIndex)));
		return tabId;
	}

}
