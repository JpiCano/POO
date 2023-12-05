/*
                  Universidad de las fuerzas armadas
                   Tecnologías de la información
Nombre: Juan Pablo Cano                             NRC: 13930
Fecha: 27-11-2023
                            
Autor: Juan Pablo Cano 
 */
package calculadoraExcepciones;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora_Excepciones {
    //Atributos
    int number1;
    int number2;
    
    //Constructor
    public Calculadora_Excepciones() {
        this.number1 = number1;
        this.number2 = number2;
    }
    
    //Metodo para la suma
    public void Suma (){
        int resultadoSuma;
        Scanner sc = new Scanner (System.in);
        System.out.println("***SUMA***");
        System.out.println("Ingrese numero 1");
        this.number1 = sc.nextInt();
        System.out.println("Ingrese numero 2");
        this.number2 = sc.nextInt();
        
        resultadoSuma=number1+number2;
        System.out.println("El resultado de la suma es: "+ resultadoSuma);
           
    }
    
    //Metodo para la resta
    public void Resta (){
        int resultadoResta;
        Scanner sc = new Scanner (System.in);
                System.out.println("\n***RESTA***");
        System.out.println("Ingrese numero 1");
        this.number1 = sc.nextInt();
        System.out.println("Ingrese numero 2");
        this.number2 = sc.nextInt();
        
        resultadoResta=number1-number2;
        System.out.println("El resultado de la resta es: "+ resultadoResta);
           
    }
    
    //Metodo para la multiplicacion
    public void Multiplicacion (){
        int resultadoMultiplicacion;
        Scanner sc = new Scanner (System.in);
        System.out.println("\n***MULTIPLICACION***");        
        System.out.println("Ingrese numero 1");
        this.number1 = sc.nextInt();
        System.out.println("Ingrese numero 2");
        this.number2 = sc.nextInt();
        
        resultadoMultiplicacion=number1*number2;
        System.out.println("El resultado de la multiplicacion es: "+ resultadoMultiplicacion);
           
    }
    
    //Metodo para la division
    public void Division (){

        try {
                int resultadoDivision;
                Scanner sc = new Scanner (System.in);
                System.out.println("\n***DIVISION***");
                System.out.println("Ingrese numero 1");
                this.number1 = sc.nextInt();
                System.out.println("Ingrese numero 2");
                this.number2 = sc.nextInt();
                resultadoDivision=number1/number2;
                System.out.println("El resultado de la Division es: "+ resultadoDivision);
                
        }catch(ArithmeticException ex){
            do {
            System.out.println("Error de division por cero, ingrese nuevamente un valor correcto ");
                int resultadoDivision;
                Scanner sc = new Scanner (System.in);
                System.out.println("\n***DIVISION***");
                System.out.println("Ingrese numero 1");
                this.number1 = sc.nextInt();
                System.out.println("Ingrese numero 2");
                this.number2 = sc.nextInt();
                resultadoDivision=number1/number2;
                System.out.println("El resultado de la Division es: "+ resultadoDivision);
            }while(this.number2 == 0);

        }
           
    }
    
}
