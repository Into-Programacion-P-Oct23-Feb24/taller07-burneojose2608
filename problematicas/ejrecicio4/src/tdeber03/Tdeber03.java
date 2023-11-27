/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tdeber03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Tdeber03 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
         
      int limite = 15;
        int numerador = 1;
        int denominador = 1;
        String signo;
        String cadena = "";
        double resultado = 0;
        int i = 2;
        do {
       
            // para manejar el signo asociado 
            if (denominador == i + 2) {
                signo = "+";
              
            } else {
                signo = "-";
               
            }
            
            cadena = String.format("%s%s%d/%d\n ", 
                    cadena,
                    signo,
                    numerador, 
                    denominador,
                    resultado);
            denominador = denominador + 2;
            resultado = denominador + denominador -denominador; 
           
           

        } while (denominador <= limite);
        

        System.out.println(cadena);
        System.out.println("resultado"+resultado);
       

  }
}
  
    
