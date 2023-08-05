/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbrojas.model;

import java.awt.event.KeyEvent;

/**
 *
 * @author cbrojas
 */
public class MethodKeyEvent {
    
    public static boolean evaluarTeclas(char c, String cadena) {
        return (c < '0' || c > '9')
                && c != KeyEvent.VK_BACK_SPACE
                && (c != '.' || cadena.contains("."))
                && (c != '-' || cadena.contains("-") || (c == '-' && cadena.length() > 0));
    }

    public static boolean evaluarTeclas(char c, double num) {

        return (c >= '0' && c <= '9')
                || c == KeyEvent.VK_BACK_SPACE
                || c == '.';

    }
    
    public static boolean validarCadenaCajaDeTexto(String cadena){
        return cadena.isEmpty() || cadena.equals(".")||cadena.equals("-");
    }
}
