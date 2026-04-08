/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_3;

/**
 *
 * @author DANILO
 */
public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int vidas) {
        super(vidas);
    }
    @Override
    public boolean validaNumero(int num) {
        if (num < 0 || num > 10) {
            return false;
        }
        if (num % 2 == 0) {
            System.out.println("Error. debes ingresar un numero IMPAR");
            return false;
        }
        return true;
    }
}