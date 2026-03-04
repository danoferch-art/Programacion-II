/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.estadisticamodular;
import java.util.Scanner;
/**
 *
 * @author DANILO
 */
public class EstadisticaModular {
    public static double promedio(double[] datos) {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.length;
    }
    public static double desviacion(double[] datos) {
        double prom = promedio(datos);
        double suma = 0;

        for (double num : datos) {
            suma += Math.pow(num - prom, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }
        System.out.println("El promedio es " + promedio(numeros));
        System.out.println("La desviación estándar es "
                + desviacion(numeros));
        scanner.close();
    }
}