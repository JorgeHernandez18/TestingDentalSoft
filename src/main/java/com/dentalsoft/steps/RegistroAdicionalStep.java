package com.dentalsoft.steps;

import com.dentalsoft.models.Datos;
import com.dentalsoft.models.ManejoPopUp;
import com.dentalsoft.page.RegistroAdicionalPage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class RegistroAdicionalStep {

    @Page
    RegistroAdicionalPage registroAdicionalPage;

    @Step("El usuario diligencia el formulario de registro adicional")
    public void elUsuarioDiligenciaElFormularioDeRegistroAdicional(){
        WaitUntil.the(registroAdicionalPage.getTxtCedula(), isEnabled()).forNoMoreThan(20).seconds();
        registroAdicionalPage.getDriver().findElement(registroAdicionalPage.getTxtCedula()).sendKeys(Datos.data().get(0).get("Cedula"));
        registroAdicionalPage.getDriver().findElement(registroAdicionalPage.getTxtSeleccion()).click();
        registroAdicionalPage.getDriver().findElement(registroAdicionalPage.getTxtMasculino()).click();
        registroAdicionalPage.getDriver().findElement(registroAdicionalPage.getTxtFecha()).sendKeys(Datos.data().get(0).get("Fecha"));
        registroAdicionalPage.getDriver().findElement(registroAdicionalPage.getBtnEnviar()).click();
        ManejoPopUp.ventanaPrincipal(registroAdicionalPage.getDriver());
    }
}
