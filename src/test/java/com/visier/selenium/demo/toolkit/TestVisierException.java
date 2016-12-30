package com.visier.selenium.demo.toolkit;

/**
 * @description Generic exception used to signify a failure. Use this exception
 *              in your test or Helper whenever a test fails, test class should
 *              automatically catch this exception
 * @author amrit kumar
 */

public class TestVisierException extends RuntimeException {

	public TestVisierException() {
		super();
	}

	public TestVisierException(String error) {
		super(error);
	}

}
