/**
 * 
 */
package com.test.calculator.calculatorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Kuna
 *
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatorStepDefinition {
	
	private static final Logger logger = LoggerFactory.getLogger(CalculatorStepDefinition.class);
	
	@Autowired
	private CalculatorHttpClient calculatorHttpClient;
	
	int response = 0;
	
	@When("the client calls \\/calc\\/add with values {int} and {int}")
	public void the_client_calls_arithmetic_add_with_values_and(int int1, int int2) {
		logger.info("inside when condition of Add scenario");
		response = calculatorHttpClient.addCalc(int1, int2);
	}
	
	@Then("the client receives answer as {int}")
    public void the_client_receives_answer_as(int result) {
		logger.info("inside Then condition ");
        assertEquals(result, response);
    }
	
	@When("the client calls \\/calc\\/sub with values {int} and {int}")
    public void the_client_calls_calc_sub_with_values_and(Integer int1, Integer int2) {
		logger.info("inside when condition of Sub scenario");
		response = calculatorHttpClient.subCalc(int1, int2);
	}
	
	@When("the client calls \\/calc\\/mul with values {int} and {int}")
    public void the_client_calls_calc_mul_with_values_and(int int1, int int2) {
		logger.info("inside when condition of Mul scenario");
        response = calculatorHttpClient.mulCalc(int1, int2);
    }
	
	@When("the client calls \\/calc\\/div with values {int} and {int}")
    public void the_client_calls_calc_div_with_values_and(Integer int1, Integer int2) {
		logger.info("inside when condition of div scenario");
        response = calculatorHttpClient.divCalc(int1, int2);
    }
}