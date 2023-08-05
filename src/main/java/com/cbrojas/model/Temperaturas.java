/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.cbrojas.model;

/**
 *
 * @author cbrojas
 */
public class Temperaturas {

    /**
     * @param args the command line arguments
     */
    private double celsius;
    private double fahrenheit;
    private double kelvin;
    private double rankine;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
        cambiarCelsiusAKelvin(celsius, 0);
    }

    public double getFahrenheit() {
        return fahrenheit;
        
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        cambiarFahrenheitARankine(fahrenheit, 0);
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
        cambiarKelvinAFahrenheit(kelvin, 0);
    }

    public double getRankine() {
        return rankine;
    }

    public void setRankine(double rankine) {
        this.rankine = rankine;
        cambiarRankineACelsius(rankine, 0);
    }
    
    private void cambiarCelsiusAKelvin (double celsius, int indice){
        if(indice<3){
            this.kelvin=celsius + 273;
            cambiarKelvinAFahrenheit(kelvin, ++indice);
        }
    }
    
    private void cambiarKelvinAFahrenheit (double kelvin, int indice){
        if(indice<3){
            this.fahrenheit=((kelvin-273)*9/5)+32;
            cambiarFahrenheitARankine(fahrenheit, ++indice);
        }
        
    }
    
    private void cambiarFahrenheitARankine (double fahrenheit, int indice){
        if(indice <3){
            this.rankine = fahrenheit + 460;
            cambiarRankineACelsius(rankine, ++indice);
        }
        
    }
    
    private void cambiarRankineACelsius (double rankine, int indice){
           if(indice<3){
            this.celsius = (rankine-492)*5/9;
            cambiarCelsiusAKelvin(celsius, ++indice);
        }
    }
}
