package com.dentalsoft.utils;
/*
 * @(#) Data.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Data {
    private  static ArrayList<Map<String, String>> data= new ArrayList<>();

    public static ArrayList<Map<String, String>> extractTo(){
        try {
            data= Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx","datos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
