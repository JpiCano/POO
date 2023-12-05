/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exoneracion;

/**
 *
 * @author juanp
 */
public class cuidador extends Persona{
     
    public String NumeroId;

    public cuidador(String nombre, int edad, String cedula,String NumeroId) {
        super(nombre, edad, cedula);
        this.NumeroId = NumeroId;
    }
    
    /**
     *
     */


    @Override
    public void comer() {
           System.out.println("El cuidador "+this.Nombre+" esta comiendo");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     
    }

    @Override
    public void Dormir() {
           System.out.println("El cuidador "+this.Nombre+" esta dormiendo");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }
       
        public void Alimentar_Animales(){
            System.out.println("El cuidador "+this.Nombre+" esta alimentadno a los animales ");
    }
}
