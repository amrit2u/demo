package com.visier.selenium.demo.common;

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

public class TestMenuBarNavigation extends CommonHelper {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	//	MasterHelper.init();
	//	new CommonPageMap(MasterHelper.getWebdriver());
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_example() throws Exception {

		try {

		} catch (Exception e) {
			throw new TestVisierException(e.getMessage());
		}
	}

}
