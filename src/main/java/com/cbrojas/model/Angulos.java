/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbrojas.model;

/**
 *
 * @author cbrojas
 */



public class Angulos {
    
    /**
     * Declaramos como constantes la medida de una vuelta en cada sistema de medida
     */
    
    private static final int SEXAGESIMAL = 360;
    private static final int CENTESIMAL = 400;
    private static final double RADIAN = 2*Math.PI;
    
    
    private double anguloSexagesimal;
    private double anguloCentesimal;
    private double anguloRadian;

    public void setAnguloSexagesimal(double anguloSexagesimal) {
        this.anguloSexagesimal = anguloSexagesimal;
        
        this.anguloCentesimal = anguloSexagesimal*CENTESIMAL/SEXAGESIMAL;
        this.anguloRadian = anguloSexagesimal*RADIAN/SEXAGESIMAL;
    }

    public void setAnguloCentesimal(double anguloCentesimal) {
        this.anguloCentesimal = anguloCentesimal;
        
        this.anguloSexagesimal= anguloCentesimal*SEXAGESIMAL/CENTESIMAL;
        this.anguloRadian = anguloCentesimal*RADIAN/CENTESIMAL;
    }

    public void setAnguloRadian(double anguloRadian) {
        this.anguloRadian = anguloRadian;
        
        this.anguloCentesimal = anguloRadian*CENTESIMAL/RADIAN;
        this.anguloSexagesimal= anguloRadian*SEXAGESIMAL/RADIAN;
    }

    public double getAnguloSexagesimal() {
        return anguloSexagesimal;
    }

    public double getAnguloCentesimal() {
        return anguloCentesimal;
    }

    public double getAnguloRadian() {
        return anguloRadian;
    }
    
    
    
    
    
    
}
