package com.wehnert.log4j2demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestTraceEntryAndExit {
	
	private static Logger logger = LogManager.getLogger(TestTraceEntryAndExit.class);

	public int print() {
			logger.traceEntry("This is a function entry of function print()");
			logger.trace("This is a mesage with log level TRACE");
			logger.debug("This is a mesage with log level DEBUG");
			logger.info ("This is a mesage with log level INFO");
			logger.warn ("This is a mesage with log level WARN");
			logger.error("This is a mesage with log level ERROR");
			logger.fatal("This is a mesage with log level FATAL");
			return logger.traceExit("This is a function exit for function print()", 0);
	}
}
