/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testecuacioncuadratica;
import java.util.Scanner;
/**
 *
 * @author DANILO
 */
public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        EcuacionCuadratica ecuacion =
                new EcuacionCuadratica(a, b, c);
        double discriminante = ecuacion.getDiscriminante();
        if (discriminante > 0) {
            System.out.println("La ecuación tiene dos raíces "
                    + ecuacion.getRaiz1() + " y "
                    + ecuacion.getRaiz2());
        } 
        else if (discriminante == 0) {
            System.out.println("La ecuación tiene una raíz "
                    + ecuacion.getRaiz1());
        } 
        else {
            System.out.println("La ecuación no tiene raíces reales");
        }

        scanner.close();
    }
}