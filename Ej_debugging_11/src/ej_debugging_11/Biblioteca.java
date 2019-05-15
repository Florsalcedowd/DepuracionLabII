/*
 Laboratorio de Computación II
 */
package ej_debugging_11;

import java.util.ArrayList;

/**
 *
 * @author jmonetti
 */
public class Biblioteca {

    ArrayList<Libro> Libros = new ArrayList();

    public Biblioteca() {

        //cargar algunos libros de ejemplo
        Libros.add(new Libro("Introducción a Java 2", "Javier Ceballos"));
        Libros.add(new Libro("Why Programs Fail", "Andreas Zeller"));
        Libros.add(new Libro("Java Debugging", "IBM"));
        Libros.add(new Libro(null, "Deitel y Deitel"));
        Libros.add(new Libro("Análisis Estadístico de Valores Extremos", "Gloria Maggio"));
    }

    public void imprimirAutores() {
        //recorrer todo el ArrayList de libros
        System.out.println();
        System.out.println("Estos son los libros almacenados");
        System.out.println("================================");
        for (int j = 1; j < Libros.size(); j++) {
            Libro l = Libros.get(j);
            System.out.println("Autor:   " + l.Autor);
        }
    }

    public void buscarPorTitulo(String parteDelTitulo) {
        //recorrer todo el ArrayList buscando la parte del titulo
        for (int j = 0; j < Libros.size(); j++) {
            Libro l = Libros.get(j);
            if (l.Titulo.contains(parteDelTitulo)) {
                System.out.println();
                System.out.println("Libro que contenga la palabra: " + parteDelTitulo+ " ENCONTRADO!!!");
                System.out.println(l.Titulo + " escrito por " + l.Autor);
                return;     //si lo encontró, terminar
            }
        }
    }

     //metodo que devuelve la cantidad de libros
    //que tiene esta biblioteca
    public int cuantosLibros() {
        return Libros.size();
    }

    //metodo que ordena la biblioteca por el nombre de autor
    public void ordenarBibliotecaPorAutor() {
        for (int i = 0; i < Libros.size(); i++) {
            for (int j = i; j < Libros.size(); j++) {
                Libro libro1 = Libros.get(i);
                Libro libro2 = Libros.get(j);
                if (libro1.Autor.compareTo(libro2.Autor) < 1) {
                    Libro aux = libro1;
                    libro1 = libro2;
                    libro2 = aux;
                }

            }
        }
    }

    public void mostrarSoloLibrosSinPrestar() {
        System.out.println("\nLos siguientes libros estan disponibles");
        System.out.println("=======================================");
        for (int i = 0; i < Libros.size(); i++) {
            Libro l = Libros.get(i);
            if (!l.Prestado) {
                System.out.println(l.Titulo.toUpperCase() + " esta disponible para prestamo");
            }
        }
    }
}
