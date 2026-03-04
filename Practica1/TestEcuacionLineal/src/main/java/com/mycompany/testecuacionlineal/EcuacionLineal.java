/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testecuacionlineal;
/**
 *
 * @author DANILO
 */
public class EcuacionLineal {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    public EcuacionLineal(double a, double b, double c,
                          double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    // Verifica si tiene solución
    public boolean tieneSolucion() {
        return (a * d - b * c) != 0;
    }
    // Retorna valor de X
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }
    // Retorna valor de Y
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}