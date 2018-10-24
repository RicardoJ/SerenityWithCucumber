package com.RetoPractico.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccenturePage extends PageObject{

	
	
    
    @FindBy(xpath ="//div[@class='gh-item signin-container']//div[1]" )
    WebElementFacade accentureRegistro;
    
    public void ingresarARegistroAccenture() {
    	accentureRegistro.click();
    }
}
