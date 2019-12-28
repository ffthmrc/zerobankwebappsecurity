package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/recources/features",
        glue = "com/zerobank/step_Definations",
        plugin = {"pretty", "html:target/default-cucumber-reports", "json:target/cucumber.json"},
        dryRun = false,
        tags ="@AccountActivity"



)

public class CukesRunner {

}
