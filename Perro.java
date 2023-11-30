/*
                  Universidad de las fuerzas armadas
                   Tecnologías de la información
Nombre: Juan Pablo Cano                             NRC: 13930
Fecha: 13-11-2023
                            
Autor: Juan Pablo Cano 
 */
package gato_perro;

public class Perro {   
    String nombre;
    int edad;
    String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void comer (){
        System.out.println(this.nombre+" empezo a comer"); 
        
    }
    
        public void saltar (){
        System.out.println(this.nombre+" empezo a comer"); 
        
    }
        public void ladrar (){
        System.out.println(this.nombre+" empezo a comer"); 
        
    }
    
    
    
    
}
