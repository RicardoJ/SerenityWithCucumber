package com.RetoPractico.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
	features = "src/test/resource/features",
	glue = {"com.accenture.RetoPractico.step_definitions"}
	)
public class DefinitionTestSuite {}
