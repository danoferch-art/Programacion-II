/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica4;

/**
 *
 * @author DANILO
 */
import java.util.*;
public class Practica4 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca UMSA");

        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("Mario Vargas Llosa", "Peruano");

        biblioteca.agregarAutor(autor1);
        biblioteca.agregarAutor(autor2);

        List<String> paginas1 = Arrays.asList(
                "Inicio del libro",
                "Desarrollo",
                "Final"
        );

        List<String> paginas2 = Arrays.asList(
                "Capítulo 1",
                "Capítulo 2",
                "Capítulo 3"
        );

        Libro libro1 = new Libro("Cien años de soledad", "ISBN001", paginas1);
        Libro libro2 = new Libro("La ciudad y los perros", "ISBN002", paginas2);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        Estudiante est1 = new Estudiante("2023001", "Carlos");
        Estudiante est2 = new Estudiante("2023002", "Ana");

        biblioteca.prestarLibro(est1, libro1);
        biblioteca.prestarLibro(est2, libro2);

        biblioteca.prestarLibro(est2, libro1);

        biblioteca.mostrarEstado();

        System.out.println("\n--- Lectura de libro ---");
        libro1.leer();
        
        System.out.println("\n--- Cerrando biblioteca ---");
        biblioteca.cerrarBiblioteca();

        biblioteca.mostrarEstado();
    }
}