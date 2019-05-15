/*
Laboratoio de Computación II
 */

package ej_debugging_11;

/**
 * @author jmonetti
 */
public class Libro {
  public String Titulo;
  public String Autor;
  public boolean Prestado=false;
  
  public Libro(String Titulo, String Autor){
     this.Titulo = Titulo;
     this.Autor = Autor;
  }
  
  //constructor de copia
  public Libro(Libro l) {
    this.Titulo = l.Titulo;
    this.Autor = l.Autor;
  }
  
//metodo para marcar este libro como prestado
  public void Prestar() {
    this.Prestado = true;
  }
  
  //metodo para marcar este libro como devuelto
  public void Devolver() {
    this.Prestado = false;
  }
  
}
