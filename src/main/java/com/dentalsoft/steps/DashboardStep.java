package com.dentalsoft.steps;


import com.dentalsoft.page.DashboardPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class DashboardStep {

    @Page
    DashboardPage dashboardPage;

    @Step("El usuario oprime el boton agregar paciente")
    public void elUsuarioOprimeElBotonAgregarPaciente(){
        dashboardPage.getDriver().findElement(dashboardPage.getBtnAgregar());
    }
}
