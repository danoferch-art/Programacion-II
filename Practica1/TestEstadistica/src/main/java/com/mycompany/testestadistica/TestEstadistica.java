/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testestadistica;
import java.util.Scanner;
/**
 *
 * @author DANILO
 */
public class TestEstadistica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }
        Estadistica est = new Estadistica(numeros);
        System.out.println("El promedio es " + est.promedio());
        System.out.println("La desviación estándar es "
                + est.desviacion());
        scanner.close();
    }
}