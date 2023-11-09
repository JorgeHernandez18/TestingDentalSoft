package com.dentalsoft.models;
/*
 * @(#) Credenciales.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */


import com.dentalsoft.utils.Excel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Datos {
    private static ArrayList<Map<String, String>> data= new ArrayList<>();

    public static ArrayList<Map<String, String>> data(){

        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "datos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
