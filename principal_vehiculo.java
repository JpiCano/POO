/*
                  Universidad de las fuerzas armadas
                   Tecnologías de la información
Nombre: Juan Pablo Cano                             NRC: 13930
Fecha: 15-11-2023
                            
Autor: Juan Pablo Cano 
 */
package vehiculo_multa;

public class principal_vehiculo {


    public static void main(String[] args) {
        System.out.println("*****ingrese los datos del vehiculo*****".toUpperCase());
        vehiculo vehiculo1 = new vehiculo ();
        vehiculo1.ingresarVelocidad ();
        vehiculo1.ingresarMarca();
        
        System.out.println("*****los datos del vehiculo son*****".toUpperCase());
        vehiculo1.mostrarMarca();
        vehiculo1.mostrarVelocidad();
        
        vehiculo1.excesoVelocidad();
          
    }
    
}
