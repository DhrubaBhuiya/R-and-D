package com.capgemini.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
	private final Logger log = LoggerFactory.getLogger(CarService.class);
	
	public void process(String car) {
		log.debug("Processing: {}",car);
	}
	
}
