/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercio5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        int numerador = 0;
        int denominador = 3;
        int contador = 0;
        String cadena = "1 ";
     
        
        do {
            if (contador %2 == 0){
             numerador = +1 / denominador;
             cadena = String.format("%s- 1/ %d\n ", 
                     cadena, 
                     denominador);
            } else {
            numerador = -1 / denominador;
            cadena = String.format("%s+ 1/ %d\n ",
                    cadena,
                    denominador);
            }
           
            denominador = denominador + 2;
            
            contador = contador + 1;
            
            
        } while (contador <= 5);
        
        System.out.printf("%s\n",cadena);
     
        
    
       

  }
}
