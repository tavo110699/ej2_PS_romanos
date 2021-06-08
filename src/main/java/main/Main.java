/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import model.Romano;
/**
 *
 * @author gustavo
 */
public class Main {
      public static void main(String[] args) {
ingresar();
  
        
    }
      
      public static void ingresar(){
              Scanner leer = new Scanner(System.in);
        Romano r = new Romano();
       
        try{
            System.out.println("Ingrese un número decimal: "); 
            int x = leer.nextInt(); 
            System.out.println("El numero en decimal: "+ x + " en romano es: " + r.Convertir(x));
        } catch(Exception e){
            System.out.println("Ingrese numeros decimales");
        }
      }
}
