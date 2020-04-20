/**
 * 
 */
package com.test.calculator.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kuna
 *
 */
@RestController
@RequestMapping("/calc")
public class CalculatorController {
	private static Logger logger = LoggerFactory.getLogger(CalculatorController.class);
	
	@RequestMapping("/add")
	public int add(int a, int b) {
		logger.info("Adding of {} and {} ",a,b);
		return a+b;
	}
	
	@RequestMapping("/sub")
	public int subtract(int a, int b) {
		logger.info("subtracting of {} and {} ",a,b);
		return a-b;
	}
	
	@RequestMapping("/mul")
	public int multiply(int a, int b)	{
		logger.info("Multiplying of {} and {} ",a,b);
		return a*b;
	}
	
	@RequestMapping("/div")
	public int divide(int a, int b) {
		logger.info("Dividing of {} with {} ",a,b);
		return a/b;
	}

}
