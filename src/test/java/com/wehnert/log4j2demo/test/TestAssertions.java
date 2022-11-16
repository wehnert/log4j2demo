package com.wehnert.log4j2demo.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.junit.jupiter.api.Test;

/**
 * Class to test our custom Assertions class
 * @author Marco Wehnert
 *
 */
public class TestAssertions {
	
	private static Logger logger = LogManager.getLogger(TestAssertions.class);
	
	private static Marker marker = MarkerManager.getMarker("MARKER");
	
	@Test
	public void test() {
		String function = "public void test()";
		try {
			logger.trace(">>> {}", function);
			logger.info("A normal log message with level 'info'.");
			logger.info(marker, "Message with a marker");
			logger.info("A: Message that starts with A:");
			logger.info("B: Message that starts with B:");
			Assertions.fail("This line here is written by 'Assertions.fail(...)'");
		} finally {
			logger.trace("<<< {}", function);
		}
	}
	
	@Test
	public void test2() {
		
	}
}
