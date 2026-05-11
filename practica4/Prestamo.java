/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;

/**
 *
 * @author DANILO
 */
import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;
    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = fechaPrestamo.plusDays(7);
    }
    public Libro getLibro() {
        return this.libro;
    }
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    public void mostrarInfo() {
        System.out.println("Préstamo:");
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Fecha préstamo: " + fechaPrestamo);
        System.out.println("Fecha devolución: " + fechaDevolucion);
    }
    @Override
    public String toString() {
        return estudiante.getNombre() + " tiene el libro: " + libro.getTitulo();
    }
}