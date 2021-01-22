package com.cruds.logdemo;

import org.apache.log4j.BasicConfigurator;
 
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class HelloWorld {

	static final Logger logger=	Logger.getLogger(HelloWorld.class);
	
	
		public static void main(String[] args) {
			//BasicConfigurator.configure();
			PropertyConfigurator.configure("log4j.properties");
			logger.debug("This is debug message");
			logger.info("This is info message");
			logger.warn("This is warn message");
			logger.error("This is error message");
			logger.fatal("Application failed"); 
			
			
			}

	}
 