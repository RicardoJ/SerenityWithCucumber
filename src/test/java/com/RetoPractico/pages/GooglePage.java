package com.RetoPractico.pages;

import java.util.concurrent.TimeUnit;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com.co")
public class GooglePage extends PageObject {
	
	@FindBy(name="q")
    WebElementFacade buscador;
	
    public void escribeEnLaBarraDeBusqueda() {
    		 	
    	buscador.sendKeys("accenture \n");
    	
    }
    
    @FindBy(xpath ="//*[text()= 'Accenture: Estrategia, Consultoría, Digital, Tecnología, y Operaciones']" )
    WebElementFacade accenture;
    
    public void ingresarPaginaAccenture() {
    	accenture.click();
    }
    
} 