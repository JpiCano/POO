/*
                  Universidad de las fuerzas armadas
                   Tecnologías de la información
Nombre: Juan Pablo Cano                             NRC: 13930
Fecha: 13-11-2023
                            
Autor: Juan Pablo Cano 
 */
package gato_perro;

public class Gato {
    String nombre;
    int edad;
    String raza;

    public Gato(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void maullar (){
        System.out.println(this.nombre+" empezo a maullar");
    }
    
    public void comer (){
        System.out.println(this.nombre+" empezo a comer");
        
    }
    
    public void saltar (){
        System.out.println(this.nombre+" empezo a saltar");
    }
    
    public void correr (){
        System.out.println(this.nombre+" empezo a correr");
    }
    
}
