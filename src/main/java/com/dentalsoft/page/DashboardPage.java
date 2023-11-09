package com.dentalsoft.page;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Data
public class DashboardPage extends PageObject {

    private final By btnAgregar = By.xpath("//span[normalize-space()='Agregar paciente']");
    private final By lblValidation = By.xpath("//label[normalize-space()='¡Paciente registrado con éxito!']");
}
