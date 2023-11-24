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
     * @return 
     */
    public static void main(String[] args) {
         
      int limite = 15;
        int numerador = 1;
        int denominador = 1;
        String signo;
        String cadena = "";
        double resultado = 0;
        double v2;
        do {
            // para manejar el signo asociado 
            if (denominador % 2 == 1) {
                signo = "-";
                v2 = -numerador/denominador;
                resultado = resultado + v2;
            } else {
                signo = "+";
                resultado = resultado + numerador/denominador;
            }
            
            cadena = String.format("%s%s%d/%d\n ", 
                    cadena,
                    signo,
                    numerador, 
                    denominador,
                    resultado);
            denominador = denominador + 2;
           
           

        } while (denominador <= limite);
        

        System.out.println(cadena);
        System.out.println("resultado"+resultado);
       

  }
}
  
    
