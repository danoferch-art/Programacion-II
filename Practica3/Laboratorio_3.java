/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.laboratorio_3;
/**
 *
 * @author DANILO
 */
public class Laboratorio_3 {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);
        
        System.out.println("=== JUEGO NORMAL ===");
        juego1.juega();

        System.out.println("\n=== JUEGO PARES ===");
        juego2.juega();

        System.out.println("\n=== JUEGO IMPARES ===");
        juego3.juega();
    }
}