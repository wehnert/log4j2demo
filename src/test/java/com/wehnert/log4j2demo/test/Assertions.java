package com.wehnert.log4j2demo.test;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.opentest4j.AssertionFailedError;

/**
 * Wrapper class for JUnit Assertions. This class here
 * will use custom log level "ASSERTION_FAILED"
 */
public class Assertions {
	
	public static Logger logger = LogManager.getLogger(Assertions.class);
	
	public static Level assertionFailed = Level.getLevel("ASSERTION_FAILED");
	
	public static <V> V fail(String message) {
		try {
			return org.junit.jupiter.api.Assertions.fail(message);
		}  catch (AssertionFailedError e) {
			throw logger.throwing(assertionFailed, e);
		}
	}
	
	public static void assertEquals(int expected, int actual, String message) {
		try {
			org.junit.jupiter.api.Assertions.assertEquals(expected, actual, message);
		}  catch (AssertionFailedError e) {
			throw logger.throwing(assertionFailed, e);
		}
		
	}

	public static void assertEquals(String expected, String actual, String message) {
		try {
			org.junit.jupiter.api.Assertions.assertEquals(expected, actual);;
		}  catch (AssertionFailedError e) {
			throw logger.throwing(assertionFailed, e);
		}
	}
}
