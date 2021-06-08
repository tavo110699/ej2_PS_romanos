/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gustavo
 */
public class Romano {
    String [][] numeros = {{"1", "I"},{"5", "V"},{"10", "X"},{"50", "L"},{"100", "C"},{"500", "D"},{"1000", "M"}};
    
    public String Convertir(int decimal){ 
        String romano = ""; 
    
        if(decimal < 1000 && decimal > 0){ 
            int numero = decimal; 
            int unidad = numero % 10; 
            int decena = (numero/10) % 10; 
            int centena = numero/100; 
            romano = Digito(centena, 4) + Digito(decena, 2) + Digito(unidad, 0);
            
        } else if(decimal == 1000){ 
            romano = "M";
        } else { 
            romano = "Ingrese un numero del 1 al 1000 ";
        }        
        return romano;
    }
    
    String Digito(int digito, int posicion){
        String romano = ""; 
        if(digito == 9){ 
            romano = numeros[posicion][1] + numeros[posicion + 2][1];
        } else if(digito >= 5){ 
            romano = numeros[posicion + 1][1]; 
            if(digito - 5 > 0){
                for(int i = 0; i < digito - 5; i++){
                   romano += numeros[posicion][1]; 
                }
            }
        } else if(digito == 4){ 
            romano = numeros[posicion][1] + numeros[posicion + 1][1];
        } else if(digito > 0){ 
            for(int i = 0; i < digito; i++){
                romano += numeros[posicion][1];
            }
        }        
        return romano; 
    }
}
