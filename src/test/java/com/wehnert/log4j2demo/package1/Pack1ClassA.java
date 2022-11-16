package com.wehnert.log4j2demo.package1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.junit.jupiter.api.Test;

public class Pack1ClassA {
	
	private static Logger logger = LogManager.getLogger(Pack1ClassA.class);
	private static Marker enter = MarkerManager.getMarker("ENTER");
	private static Marker exit = MarkerManager.getMarker("EXIT");

	@Test
	public void test() {
		try {
			logger.trace(enter, ">>> public void test()");
			logger.trace("This is a mesage with log level TRACE");
			logger.debug("This is a mesage with log level DEBUG");
			logger.info ("This is a mesage with log level INFO");
			logger.warn ("This is a mesage with log level WARN");
			logger.error("This is a mesage with log level ERROR");
			logger.fatal("This is a mesage with log level FATAL");
		} finally {
			logger.trace(exit, "<<< public void test()");
		}
	}
}
