package steps;

import com.RetoPractico.pages.AccenturePage;
import com.RetoPractico.pages.GooglePage;
import com.RetoPractico.pages.Validar;

import net.thucydides.core.annotations.Step;

public class TesterSteps {
	
	GooglePage googlepage;
	AccenturePage accenturePage;
	Validar validacion;
	@Step
	public void abrirNavegador() {
		googlepage.open();
	}
	
	@Step
	public void escribirEnElBuscador() {
		googlepage.escribeEnLaBarraDeBusqueda();
	}
	@Step
	public void entrarAPaginaAccenture() {
		googlepage.ingresarPaginaAccenture();
	}
	@Step
	public void entrarAIngresarEnPaginaDeAccenture() {
		accenturePage.ingresarARegistroAccenture();
	}
	@Step
	public void validar (String word) {
		validacion.capturar(word);
	}

}
