/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;

/**
 *
 * @author DANILO
 */
import java.util.*;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamos;
    private Horario horario;

    class Horario {
        private String diasApertura;
        private String horaApertura;
        private String horaCierre;
        public Horario(String diasApertura, String horaApertura, String horaCierre) {
            this.diasApertura = diasApertura;
            this.horaApertura = horaApertura;
            this.horaCierre = horaCierre;
        }

        public void mostrarHorario() {
            System.out.println("Días: " + diasApertura);
            System.out.println("Apertura: " + horaApertura);
            System.out.println("Cierre: " + horaCierre);
        }
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
        autores = new ArrayList<>();
        prestamos = new ArrayList<>();
        horario = new Horario("Lunes a Viernes", "08:00", "20:00");
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public void prestarLibro(Estudiante estudiante, Libro libro) {
        if (!libros.contains(libro)) {
            System.out.println("Libro no disponible");
            return;
        }

        for (Prestamo p : prestamos) {
            if (p.toString().contains(libro.getTitulo())) {
                System.out.println("El libro ya está prestado");
                return;
            }
        }

        prestamos.add(new Prestamo(estudiante, libro));
        System.out.println("Préstamo realizado");
    }

    public void mostrarEstado() {
        System.out.println("\nBiblioteca: " + nombre);

        System.out.println("\nHorario:");
        horario.mostrarHorario();

        System.out.println("\nLibros:");
        for (Libro l : libros) {
            System.out.println("- " + l.getTitulo());
        }

        System.out.println("\nAutores:");
        for (Autor a : autores) {
            a.mostrarInfo();
        }

        System.out.println("\nPréstamos:");
        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos activos");
        } else {
            for (Prestamo p : prestamos) {
                System.out.println(p);
            }
        }
    }

    public void cerrarBiblioteca() {
        prestamos.clear();
        System.out.println("Biblioteca cerrada. Préstamos eliminados.");
    }
}