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

public class Libro {
    private String titulo;
    private String isbn;
    private List<Pagina> paginas;
    class Pagina {
        private int numeroPagina;
        private String contenido;

        public Pagina(int numeroPagina, String contenido) {
            this.numeroPagina = numeroPagina;
            this.contenido = contenido;
        }

        public void mostrarPagina() {
            System.out.println("Página " + numeroPagina + ": " + contenido);
        }
    }

    public Libro(String titulo, String isbn, List<String> contenidoPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();

        int i = 1;
        for (String contenido : contenidoPaginas) {
            paginas.add(new Pagina(i++, contenido));
        }
    }

    public String getTitulo() {
        return titulo;
    }
    public String getIsbn() {
        return isbn;
    }

    public void leer() {
        System.out.println("Libro: " + titulo);
        for (Pagina p : paginas) {
            p.mostrarPagina();
        }
    }
}