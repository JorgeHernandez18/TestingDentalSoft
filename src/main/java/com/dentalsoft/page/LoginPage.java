package com.dentalsoft.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private final By txtDocumento = By.xpath("//input[@id='user']");
    private final By txtClave = By.xpath("//input[@id='pass']");
    private final By btnEntrar = By.xpath("//button[text()='Ingresar']");


    public By getTxtDocumento() {
        return txtDocumento;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnEntrar() {
        return btnEntrar;
    }

}
