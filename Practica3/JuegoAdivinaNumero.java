/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_3;

/**
 *
 * @author DANILO
 */
import java.util.Scanner;
public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;
    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }
    public boolean validaNumero(int num) {
        return num >= 0 && num <= 10;
    }
    public void juega() {
        Scanner sc = new Scanner(System.in);
        reiniciaPartida();
        numeroAAdivinar = (int)(Math.random() * 11);
        System.out.println("Adivina un número entre 0 y 10");
        while (true) {
            int intento = sc.nextInt();
            if (!validaNumero(intento)) {
                System.out.println("Numero invalido. Intenta de nuevo:");
                continue;
            }
            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El numero es MAYOR");
                    } else {
                        System.out.println("El numero es MENOR");
                    }
                } else {
                    System.out.println("Sin vidas");
                    break;
                }
            }
        }
    }
}