package com.dentalsoft.page;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Data
public class RegistroPage extends PageObject {

    private final By listTipoDocumento = By.xpath("//select[@name='tipodoc']");
    private final By txtNumeroDoc = By.xpath("//input[@id='document']");
    private final By txtNombre = By.xpath("//input[@name='nombre']");
    private final By listSexo = By.xpath("//select[@name='sexo']");
    private final By listEstadoCivil = By.xpath("//select[@name='estadocivil']");
    private final By listPaisNacimiento = By.xpath("//select[@name='paisnac']");
    private final By txtCiudadNacimiento = By.xpath("//input[@name='ciudadnac']");
    private final By txtFechaNacimiento = By.xpath("//input[@name='fechanac']");
    private final By txtFechaIngreso= By.xpath("//input[@name='fechaingreso']");
    private final By listPaisResidencia= By.xpath("//select[@name='paisdomi']");
    private final By txtCiudadResidencia= By.xpath("//input[@name='ciudaddomi']");
    private final By txtDireccionResidencia= By.xpath("//input[@name='direcciondomi']");
    private final By txtBarrioResidencia= By.xpath("//input[@name='barriodomi']");
    private final By txtTelefono= By.xpath("//input[@name='celular']");
    private final By txtCorreo= By.xpath("//input[@name='correo']");
    private final By txtOcupacion= By.xpath("//input[@name='ocupacion']");
    private final By listEps= By.xpath("//select[@name='eps']");
    private final By txtTipoAfiliacion= By.xpath("//input[@name='tipoafiliacion']");
    private final By txtPoliza= By.xpath("//input[@name='poliza']");
    private final By txtClave= By.xpath("//input[@name='password']");
    private final By txtFoto= By.xpath("//input[@id='file']");

    private final By btnRegistro = By.xpath("//button[@id='send']");
}
