package com.RetoPractico.pages;



import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Validar extends PageObject {
	@FindBy(xpath="//section[@class='container-block']//h2[@id='sign-in-heading']") 
	private WebElementFacade palabrasAvalidar;
	
	public void capturar(String word) {
		System.out.println(palabrasAvalidar.getText());
		if (palabrasAvalidar.getText().equalsIgnoreCase(word)) {
	Assert.assertTrue(true);
		}else {
			Assert.assertFalse(false);
			
		}
	}
 }
