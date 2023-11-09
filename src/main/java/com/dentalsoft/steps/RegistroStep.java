package com.dentalsoft.steps;

import com.dentalsoft.models.Datos;
import com.dentalsoft.models.ManejoPopUp;
import com.dentalsoft.models.SeleccionAleatoria;
import com.dentalsoft.page.RegistroPage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class RegistroStep {

    @Page
    RegistroPage registroPage;

    @Step("El usuario diligencia el formulario de registro")
    public void elUsuarioDiligenciaElFormularioDeRegistro(){
        ManejoPopUp.obtenerVentanaActual(registroPage.getDriver());
        ManejoPopUp.cambiarVentanaEmergente(registroPage.getDriver());
        WaitUntil.the(registroPage.getTxtCorreo(), isEnabled()).forNoMoreThan(20).seconds();
        SeleccionAleatoria.seleccion(registroPage.getDriver(), registroPage.getListTipoDocumento()).click();
        registroPage.getDriver().findElement(registroPage.getTxtNumeroDoc()).sendKeys(Datos.data().get(0).get("PatientDocument"));
        registroPage.getDriver().findElement(registroPage.getTxtCorreo()).sendKeys(Datos.data().get(0).get("Correo"));
        registroPage.getDriver().findElement(registroPage.getTxtNombre()).sendKeys(Datos.data().get(0).get("Nombre"));
        registroPage.getDriver().findElement(registroPage.getTxtApellido()).sendKeys(Datos.data().get(0).get("Apellido"));
        registroPage.getDriver().findElement(registroPage.getTxtClave()).sendKeys(Datos.data().get(0).get("Clave"));
        registroPage.getDriver().findElement(registroPage.getTxtConfirmarClave()).sendKeys(Datos.data().get(0).get("ConfirmClave"));
        registroPage.getDriver().findElement(registroPage.getCheckTerminos()).click();
        registroPage.getDriver().findElement(registroPage.getCheckAutorizo()).click();
        registroPage.getDriver().findElement(registroPage.getBtnRegistro()).click();
    }
}
