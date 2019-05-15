/*
Laboratorio de Computación II
 */

package ej_debugging_11;

/**
 * @author jmonetti
 */ 

//el programa simula el funcionamiento de una biblioteca
//listado de libros, autores, prestamos, devoluciones, etc.
public class Ej_debugging_11 {

    public static void main(String[] args) {
          Biblioteca biblio = new Biblioteca();
          
          biblio.imprimirAutores();
          biblio.ordenarBibliotecaPorAutor();
          biblio.imprimirAutores();
          
          //mostrar la cantidad de libros que tiene la biblioteca
          System.out.println( "La biblioteca tiene actualmente: " + biblio.cuantosLibros() + " libros");
          
          //buscar un libro, pasandole al metodo buscador solo una parte del titulo
          //por ejemplo un libro cuyo titulo contenga la palabra "Java"
          biblio.buscarPorTitulo( "Java");
          
          //simular el prestamo de un libro
          biblio.mostrarSoloLibrosSinPrestar();  //muestra libros disponibles
          biblio.Libros.get(1).Prestar();        //simular el prestamo del 2do libro
          biblio.mostrarSoloLibrosSinPrestar();  //volver a mostrar los libros disponibles
        
    }
    
}
