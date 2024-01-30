/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exoneracion;

/**
 *
 * @author juanp
 */
public abstract class  Persona {
    public String Nombre;
    public int Edad;
    private String cedula;
    
    public Persona(String Nombre, int edad, String cedula) {
        this.Nombre = Nombre;
        this.Edad = edad;
    }

    public void setCedula(String nuevaCedula) {
        this.cedula = nuevaCedula;
    }
    
    public abstract void comer();
    public abstract void Dormir();

}
