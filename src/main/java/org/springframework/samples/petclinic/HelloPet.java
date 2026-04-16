package org.springframework.samples.petclinic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloPet {

	
	private static final Logger logger = LogManager.getLogger(HelloPet.class);

	public static void main(String[] args) {
		logger.info("Entering main() - starting HelloPetwith {} argument(s)", args.length);
		logger.info("Exiting main() - HelloPet has started successfully");
		logger.info("Exiting main() - HelloPet has started successfully");
		logger.info("Exiting main() - HelloPet has started successfully");
		logger.info("Exiting main() - HelloPet has started successfully");
		logger.info("Exiting main() - HelloPet has started successfully");
		
		writeExtendedGreeting();
	}
	
	
	private static void writeExtendedGreeting() {
		logger.info("Helloooooooooooooooo");
		logger.info("Helloooooooooooooooo");
		logger.info("Helloooooooooooooooo");
		logger.info("Helloooooooooooooooo");
		logger.info("Helloooooooooooooooo");
		logger.info("Helloooooooooooooooo");
		logger.info("Helloooooooooooooooo");
		logger.info("Helloooooooooooooooo");
		logger.info("Helloooooooooooooooo");
		logger.info("Helloooooooooooooooo");
		
	}
	
	
}
