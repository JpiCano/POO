/*
                  Universidad de las fuerzas armadas
                   Tecnologías de la información
Nombre: Juan Pablo Cano                             NRC: 13930
Fecha: 153-11-2023
                            
Autor: Juan Pablo Cano 
 */
package gato_perro;

public class Claseuno {

    public static void main(String[] args) {
        System.out.println("PERRO");
        Perro perro1 = new Perro ("Tony",5,"Pastor Aleman");
        perro1.comer();
        perro1.ladrar();
        perro1.saltar();
        System.out.println("GATO");
        Gato gato1 = new Gato ("Michi",3,"Egipcio");
        gato1.comer();
        gato1.maullar();
        gato1.saltar();
        gato1.correr();
        
        
    }
    
}
