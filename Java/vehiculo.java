/*
                  Universidad de las fuerzas armadas
                   Tecnologías de la información
Nombre: Juan Pablo Cano                             NRC: 13930
Fecha: 15-11-2023
                            
Autor: Juan Pablo Cano 
 */
package vehiculo_multa;

import java.util.Scanner;


public class vehiculo {
    //Atributos
     String marca;
     int velocidad;
     
    //Contructor

    public vehiculo() {
        this.marca = marca;
        this.velocidad = velocidad;
    }

     
    // Métodos 
    //Método para ingresar la velocidad del vehiculo
    
    public void ingresarVelocidad (){
        System.out.println("ingrese la velocidad del vehiculo: ".toUpperCase());
        Scanner leer = new Scanner(System.in);
        velocidad=leer.nextInt();
    }
    //Método para ingresar la marca del vehiculo
     public void ingresarMarca (){
        System.out.println("ingrese la marca del vehiculo: ".toUpperCase());
        Scanner leer = new Scanner(System.in);
        marca=leer.nextLine();
    }
    
    //Método para mostrar la velocidad del vehiculo
    public void mostrarVelocidad (){
        System.out.println("la velocidad del vehiculo es: ".toUpperCase()+this.velocidad);
    } 
    //Método para mostrar la marca del vehiculo
    public void mostrarMarca (){
        System.out.println("la marca del vehiculo es: ".toUpperCase()+this.marca);
    } 
    //Metodo para determinar el exceso de velocidad y si va a ser multado o no
    public void excesoVelocidad (){
        if (velocidad > 50){
            System.out.println("El vehiculo sera multado".toUpperCase());
        } 
        else{
            System.out.println("El vehiculo no sera multado".toUpperCase());
        }
    }
    
}
