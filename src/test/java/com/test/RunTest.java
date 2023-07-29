package com.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberTestes.json", "html:target/reports/"},
        features = "src/test/resources/features",
        tags = {"@pedidoSuccess"},
        glue = {"com.test"}
)
public class RunTest {

    @AfterClass
    public static void fecharApp(){
        Hooks.quitDriver();
    }
}