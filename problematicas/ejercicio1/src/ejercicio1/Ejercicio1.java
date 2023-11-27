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
       
        double estatura ;
        String nombre; 
        String posicion;
        String jugadores = "Listado de jugadores";
        String listado_edades = "Listado de edades" ;
        double promedio_edades = 0;
        double promedio_estatura = 0;
        int edad ;
        int contador = 1;
        int limite ;
        //
         System.out.println("Cuantas jugadores va a ingresar");
            limite = entrada .nextInt();
        
        do {
          entrada.nextLine();
            System.out.println("Ingrese el nombre del jugador:");
             nombre = entrada.nextLine();
             System.out.println("Ingrese la posicion de juego:");
             posicion = entrada.nextLine();
             
               System.out.println("Ingrese la estatura del jugador:");
             estatura = entrada.nextDouble();
              System.out.println("Ingrese la edad del jugador:");
             edad = entrada.nextInt();
      jugadores = String.format("%s\n%d. %s -%s-,edad %d, estatura %.2f\n",
                    jugadores,contador,nombre,posicion,edad,
                    estatura);
                   
             listado_edades = String.format("%s%d \n",
                    listado_edades,edad);
             promedio_edades =(promedio_edades + edad)/ contador;
             promedio_estatura =(promedio_estatura + estatura)/ contador;
             contador = contador + 1;

        } while (contador <= limite); 
            
        System.out.printf("""
                          %s%spromedio de edades: %.2f
                           promedio de estaturas:%.2f
                          """,jugadores,listado_edades,promedio_edades,
                promedio_estatura);
       
    }

  
    }
    
    

