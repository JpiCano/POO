/*
                  Universidad de las fuerzas armadas
                   Tecnologías de la información
Nombre: Juan Pablo Cano                             NRC: 13930
Fecha: 24-11-2023
                            
Autor: Juan Pablo Cano 
 */
package eSucursales;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        int opcion1;
        int opcion2;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("MENU EMPRESA");
            System.out.println("1. SUCURSAL 1");
            System.out.println("2. SUCURSAL 2");
            System.out.println("3. SUCURSAL 3");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion: ");            
            opcion1=leer.nextInt();
            
            switch(opcion1){
                case 1:
                    Compania sucursal1 = new Compania();
                    System.out.println("ELIGA UN PRODUCTO");
                    System.out.println("1. PAPAS");
                    System.out.println("2. QUESO");
                    System.out.println("3. LECHE");
                    opcion2=leer.nextInt();
                        switch (opcion2){
                            case 1:
                                System.out.println("HOLA MUNDO");
                                
                                break;
                            case 2:
                                System.out.println("ronny puto");
                                break;
                                
                            case 3:
                                System.out.println("jpi dios");
                                break;
                        }
                    break;
                    
                case 2:
                    Compania sucursal2 = new Compania();
                    System.out.println("ELIGA UN PRODUCTO");
                    System.out.println("1. PAPAS");
                    System.out.println("2. QUESO");
                    System.out.println("3. LECHE");
                    opcion2=leer.nextInt();
                        switch (opcion2){
                            case 1:
                                System.out.println("HOLA MUNDO");
                                
                                break;
                            case 2:
                                System.out.println("ronny puto");
                                break;
                                
                            case 3:
                                System.out.println("jpi dios");
                                break;
                        }
                    break;
                    
                case 3:
                    Compania sucursal3 = new Compania();
                    System.out.println("ELIGA UN PRODUCTO");
                    System.out.println("1. PAPAS");
                    System.out.println("2. QUESO");
                    System.out.println("3. LECHE");
                    opcion2=leer.nextInt();
                        switch (opcion2){
                            case 1:
                                System.out.println("HOLA MUNDO");
                                
                                break;
                            case 2:
                                System.out.println("ronny puto");
                                break;
                                
                            case 3:
                                System.out.println("jpi dios");
                                break;
                        }
                    break;

            }
        }while(opcion1 != 4);
    }
}    
