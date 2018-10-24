package com.RetoPractico.step_definitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.TesterSteps;

public class MyStepDefinitions {

	@Managed(driver = "chrome")
	public WebDriver driver;

	@Steps
	public TesterSteps tester;
	
    @Given("^Ricardo open the browser$")
    public void ricardo_open_the_browser() throws Throwable {
        tester.abrirNavegador();
    }

    @When("^I want search 'accenture' in google$")
    public void i_want_search_accenture_in_google() throws Throwable {
        tester.escribirEnElBuscador();
    }
    @And("^i get in  to page of accenture$")
    public void i_get_in_to_page_of_accenture() throws Throwable {
        tester.entrarAPaginaAccenture();
    }

    @And("^get in to accenture page Sign in$")
    public void get_in_to_accenture_page_sign_in() throws Throwable {
        tester.entrarAIngresarEnPaginaDeAccenture();
    }
    
    @Then("^in the page is word '(.*)'$")
    public void in_the_page_is_word_ingresar_con_email_y_contraseña(String validacion) throws Throwable {
       tester.validar(validacion);
    }

   

}