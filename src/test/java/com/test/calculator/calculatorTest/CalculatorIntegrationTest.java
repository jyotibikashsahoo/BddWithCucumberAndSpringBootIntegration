/**
 * 
 */
package com.test.calculator.calculatorTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Kuna
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/calculator/calculator.feature",plugin = {"pretty", "html:target/cucumber/calculator","json:target/report/json/calculator.json"})
public class CalculatorIntegrationTest {

}
