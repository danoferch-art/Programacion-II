/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebacronometro;
/**
 *
 * @author DANILO
 */
public class Cronometro {
    private long inicia;
    private long finaliza;
    public Cronometro() {
        inicia = System.currentTimeMillis();
    }
    // Reinicia el cronómetro
    public void inicia() {
        inicia = System.currentTimeMillis();
    }
    // Detiene el cronómetro
    public void detener() {
        finaliza = System.currentTimeMillis();
    }
    // Getter inicia
    public long getInicia() {
        return inicia;
    }
    // Getter finaliza
    public long getFinaliza() {
        return finaliza;
    }
    // Tiempo transcurrido en milisegundos
    public long lapsoDeTiempo() {
        return finaliza - inicia;
    }
}