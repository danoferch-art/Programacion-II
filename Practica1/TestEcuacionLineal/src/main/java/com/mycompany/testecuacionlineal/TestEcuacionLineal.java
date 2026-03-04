/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testecuacionlineal;
import java.util.Scanner;
/**
 *
 * @author DANILO
 */
public class TestEcuacionLineal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        EcuacionLineal ecuacion =
                new EcuacionLineal(a, b, c, d, e, f);
        if (ecuacion.tieneSolucion()) {
            System.out.println("x = " + ecuacion.getX()
                    + ", y = " + ecuacion.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
        scanner.close();
    }
}