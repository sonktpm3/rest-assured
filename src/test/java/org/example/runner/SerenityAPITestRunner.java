package org.example.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/Employee.feature", glue = {
        "org.example.definitions" })

public class SerenityAPITestRunner {

}
