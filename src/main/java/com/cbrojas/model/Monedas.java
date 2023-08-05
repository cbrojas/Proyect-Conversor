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
    private static final double USD=1.00;
    private static final double PEN=3.67;
    private static final double EUR=0.91;

    public double cambiarSolesADolar (double monedaPEN){
        return monedaPEN/PEN;
    }
    
    public double cambiarEuroADolar (double monedaEUR){
        return monedaEUR/EUR;
    }
    
    public double cambiarDolarAEuro (double monedaUSD){
        return monedaUSD*EUR;
    }
    public double cambiarDolarASoles (double monedaUSD){
        return monedaUSD*PEN;
    }
    
    
}
