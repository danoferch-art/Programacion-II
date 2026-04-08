/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_3;
/**
 *
 * @author DANILO
 */
public class Juego {
    protected int vidas;
    protected int record;
    public Juego(int vidas) {
        this.vidas = vidas;
        this.record = 0;
    }
    public void reiniciaPartida() {
        System.out.println("Partida reiniciada. Vidas: " + vidas);
    }
    public void actualizaRecord() {
        record++;
        System.out.println("Nuevo record: " + record);
    }
    public boolean quitaVida() {
        vidas--;
        System.out.println("Te quedan " + vidas + " vidas");
        return vidas > 0;
    }
}