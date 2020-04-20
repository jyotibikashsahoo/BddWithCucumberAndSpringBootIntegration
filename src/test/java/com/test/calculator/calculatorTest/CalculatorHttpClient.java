/**
 * 
 */
package com.test.calculator.calculatorTest;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


/**
 * @author Kuna
 *
 */
@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class CalculatorHttpClient {
	
	private final Logger log = LoggerFactory.getLogger(CalculatorHttpClient.class);
	private final String SERVER_URL = "http://localhost";
    private final String CALCULATOR_ENDPOINT = "/calc/";
    private final String ADDURL = "add";
    private final String SUBURL = "sub";
    private final String MULURL = "mul";
    private final String DIVURL = "div";
    
    @LocalServerPort
    private int port;
    private final RestTemplate restTemplate = new RestTemplate();
    
    private String calculatorAddEndpoint(int a , int b) {
    	log.info("the endpoint url is "+SERVER_URL + ":" + port + CALCULATOR_ENDPOINT + ADDURL);
        return SERVER_URL + ":" + port + CALCULATOR_ENDPOINT + ADDURL + "?a=" +a +"&b=" +b;
    }
    
    private String calculatorSubEndpoint(int a , int b) {
    	log.info("the endpoint url is "+SERVER_URL + ":" + port + CALCULATOR_ENDPOINT + SUBURL);
        return SERVER_URL + ":" + port + CALCULATOR_ENDPOINT + SUBURL + "?a=" +a +"&b=" +b;
    }
    
    private String calculatorMulEndpoint(int a , int b) {
    	log.info("the endpoint url is "+SERVER_URL + ":" + port + CALCULATOR_ENDPOINT + MULURL);
        return SERVER_URL + ":" + port + CALCULATOR_ENDPOINT + MULURL + "?a=" +a +"&b=" +b;
    }
    
    private String calculatorDivEndpoint(int a , int b) {
    	log.info("the endpoint url is "+SERVER_URL + ":" + port + CALCULATOR_ENDPOINT + DIVURL);
        return SERVER_URL + ":" + port + CALCULATOR_ENDPOINT + DIVURL + "?a=" +a +"&b=" +b;
    }
    public int addCalc(int a, int b) {
    	return restTemplate.getForObject(calculatorAddEndpoint(a,b), Integer.class);
    }
    
    public int subCalc(int a, int b) {
    	return restTemplate.getForObject(calculatorSubEndpoint(a,b), Integer.class);
    }
    public int mulCalc(int a, int b) {
    	return restTemplate.getForObject(calculatorMulEndpoint(a,b), Integer.class);
    }
    public int divCalc(int a, int b) {
    	return restTemplate.getForObject(calculatorDivEndpoint(a,b), Integer.class);
    }

}

