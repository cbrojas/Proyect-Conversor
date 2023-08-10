/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbrojas.model;

/**
 *
 * @author cbrojas
 */

public class Monedas {
    
    /**
     * Declaramos las constantes que nos ayudaran a realizar las conversiones de monedas
     * los valores de las constantes estan en base al tipo de cambio con el Dolar USD
     */
    
    private static String[] monedas= {"Dolar Americano","Sol Peruano", "Euro"};
    private static String[] simboloMoneda = {"USD" , "PEN", "EUR"};
    private static double[] tipoCambio ={1.0, 3.67, 0.91};
    
    
    public  static String[] getMonedas() {
        return monedas;
    }

    public static double convertirMoneda(int indiceDE, int indiceA, double moneda1){
        return (moneda1/tipoCambio[indiceDE])*tipoCambio[indiceA];
    }
    
    
}
