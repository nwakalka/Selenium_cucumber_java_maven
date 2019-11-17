package com.automatedtest.sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/automatedtest/sample/sennkeys_assert.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/selenium-page.json",
        "html:target/selenium-page-html"},
        glue = {"com.automatedtest.sample.infrastructure.driver",
                "com.automatedtest.sample.homepage"})
public class SendKeysDemoTest {

}
