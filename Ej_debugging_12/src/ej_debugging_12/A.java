/*
 Laboratorio de Computación II
 */

package ej_debugging_12;

import java.util.ArrayList;

/**
 *
 * @author jmonetti
 */
public class A {
    ArrayList a = new ArrayList();
    int cantidadElementos=400;
    
    public void cargarArray() {
       int i=0; 
     
       for(i=0;i<cantidadElementos;i++);
           a.add( i );       //agrego un elemento al ArrayList
    } 
    
    public void mostrarElementosArray(){
       for(int i=0;i<cantidadElementos;i++)
           System.out.println( a.get(i));
    }
}
