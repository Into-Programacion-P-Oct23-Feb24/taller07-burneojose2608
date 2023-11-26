/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal;
        double estatura ;
        int salida;
        String nombre; 
        String posicion;
        boolean bandera = true;
        int edad ;
        int contador_calificaciones = 0;
        
        cadenaFinal = "Jugadores de futbol\n";
        
        do {
            System.out.println("Ingrese el nombre del jugador:");
             nombre = entrada.nextLine();
               System.out.println("Ingrese la estatura del jugador:");
             estatura = entrada.nextDouble();
             System.out.println("Ingrese la posicion de juego:");
             posicion = entrada.nextLine();
              System.out.println("Ingrese la edad del jugador:");
             edad = entrada.nextInt();
           
            contador_calificaciones = contador_calificaciones + 1;
            
          
             
            
  
             cadenaFinal = String.format("%snombre% dposicion %s\n",
                    cadenaFinal,
                    posicion,nombre,edad,estatura);
             
                 
            System.out.println("Ingrese (2) si desea salir del ciclo; "
                    + "cualquier otro número para continuar");
            salida = entrada.nextInt();

            if (salida == -2) {
                bandera = false;
            }
            
            entrada.nextLine(); 

        } while (bandera); 
            
        System.out.printf("%s\n", cadenaFinal);
       
    }

  
    }
    
    

