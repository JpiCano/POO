/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exoneracion;
import java.util.Scanner;
/**
 *
 * @author juanp
 */
public class Principal_Exoneracion {

    public static void main(String[] args) {
        // TODO code applicatio
        Scanner scanner = new Scanner(System.in);
        boolean datosCorrectos = false;
    do {    
    try {    
        System.out.print("Ingrese el nombre del visitante:\n ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del visitante:\n ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la cédula del visitante:\n ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el numero de carnet del visitante:\n ");
        String Numerocarnet = scanner.nextLine();
        
        visitante visitante1 = new visitante(nombre,edad,cedula,Numerocarnet);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos);
    datosCorrectos = false;
        System.out.println("Se registro el visitante");
    do {    
    try {    
        System.out.print("Ingrese el nombre del cuidador:\n ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del cuidador:\n "); 
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la cédula del cuidador:\n ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el numero de carnet del cuidador:\n ");
        String Numerocarnet = scanner.nextLine();
        
        cuidador cuidador1 = new cuidador(nombre,edad,cedula,Numerocarnet);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos); 
    datosCorrectos = false;
        System.out.println("se registro el cuidador");
     
    do {    
    try {    
        System.out.print("Ingrese el nombre del leon:\n ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del leon:\n ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el Numero registro del leon:\n ");
        String Numeroregistro = scanner.nextLine();
        System.out.print("Ingrese el numero de carnet del leon:\n ");
        String vacuna = scanner.nextLine();
        
        Leon Leon1 = new Leon(nombre,edad,Numeroregistro,vacuna);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos);
    datosCorrectos = false;
        System.out.println("se registro el leon");
        
    do {    
    try {    
        System.out.print("Ingrese el nombre del pinguino:\n ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad: del pinguino:\n");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el numero registro: del pinguino:\n");
        String Numeroregistro = scanner.nextLine();
        System.out.print("Ingrese el numero de carnet:\n ");
        String Numerocarnet = scanner.nextLine();
        
        Pinguino Pinguino1 = new Pinguino (nombre,edad,Numeroregistro);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos); 
        datosCorrectos = false;
    
        System.out.println("se registro el pinguino");
    }
}