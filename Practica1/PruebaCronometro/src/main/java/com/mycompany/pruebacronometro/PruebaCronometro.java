/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebacronometro;
import java.util.Random;
/**
 *
 * @author DANILO
 */
public class PruebaCronometro {
    public static void ordenacionSeleccion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMin]) {
                    indiceMin = j;
                }
            }
            // Intercambio
            int temp = arreglo[i];
            arreglo[i] = arreglo[indiceMin];
            arreglo[indiceMin] = temp;
        }
    }
    public static void main(String[] args) {
        int[] numeros = new int[100000];
        Random random = new Random();
        // Llenar arreglo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100000);
        }
        Cronometro cronometro = new Cronometro();
        cronometro.inicia();
        ordenacionSeleccion(numeros);
        cronometro.detener();
        System.out.println("Tiempo de ejecución: "
                + cronometro.lapsoDeTiempo()
                + " milisegundos");
    }
}