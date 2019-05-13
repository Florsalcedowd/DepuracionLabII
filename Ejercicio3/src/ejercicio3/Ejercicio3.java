/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author flocy
 */

class A{
    public void algo0(int a){
        a++;
        algo1(a);
    }
    
    public void algo1 (int a){
        a++;
        E e= new E();
        e.termina(a);
    }
}

class B {
    int m;
    public void algo0(int a){
        a++;
        algo1(a);
    }
    
    public void algo1 (int a){
        a++;
        A obja = new A();
        obja.algo0(a);
        m= 9;
    }
}

class C{
    public void algo0(int a){
        a++;
        algo1(a);
    }
    
    public void algo1 (int a){
        a++;
        B objB = new B();
        objB.algo0(a);
    }
}

class D{
    public void algo0(int a){
        a++;
        algo1(a);
    }
    
    public void algo1 (int a){
        a++;
        C objC = new C();
        objC.algo0(a);
    }
}

class E{
    public void termina (int a){
        int acu=0;
        for (int i = 0; i < 1000; i++) {
            acu = acu+i;
            if (i==500) {
                System.out.println(acu);
            }
        }
    }
}

public class Ejercicio3 {

    public static void main(String[] args) {
        int a= 0;
        a= 1;
        B b = new B();
        b.algo0(10);
        System.out.println("Termino");
    }
    
}
