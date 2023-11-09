package com.dentalsoft.steps;

import com.dentalsoft.models.Datos;
import com.dentalsoft.page.LoginPage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginStep {

    @Page
    LoginPage loginPage;

    @Step("Abrir el navegador")
    public void abrirNavegador(){
        loginPage.openUrl("https://dentalsoft-production.up.railway.app/admin/login");}

    @Step("El usuario digita sus credenciales de acceso")
    public void elUsuarioDigitaSusCredencialesDeAcceso(){
        WaitUntil.the(loginPage.getBtnEntrar(), isVisible()).forNoMoreThan(20).seconds();
        loginPage.getDriver().findElement(loginPage.getTxtDocumento()).sendKeys(Datos.data().get(0).get("Document"));
        loginPage.getDriver().findElement(loginPage.getTxtClave()).sendKeys(Datos.data().get(0).get("Password"));
    }

    @Step("El usuario clickea ingresar")
    public void elUsuarioClickeaIngresar(){
        loginPage.getDriver().findElement(loginPage.getBtnEntrar()).click();
    }

}
