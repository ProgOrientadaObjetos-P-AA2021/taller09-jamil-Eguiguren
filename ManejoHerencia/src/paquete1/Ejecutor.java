/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 3) {
            System.out.printf("Elegir\n1. Prestamo de un Automovil\n2. Prestamo "
                    + "Educativo\n3. Salir\n");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    prestamoAutomovil();
                    break;
                    
                case 2:
                    prestamoEstudiante();
                    break;
                    
                case 3:
                    System.out.println("Fin");
                    break;
                
                default:
                     System.out.println("La opcion es incorecta");
            }
        }
    }

    public static void prestamoAutomovil() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el nombre del beneficiario");
        String nombreB = entrada.nextLine();
        System.out.println("Ingresar apellido del beneficiario");
        String apellidoB = entrada.nextLine();
        
        Persona personaB = new Persona(nombreB, apellidoB);
        
        System.out.println("Ingresar tiempo de préstamo en meses");
        double tiempoPrestamoMeses = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingresar ciudad del préstamo");
        String ciudadPrestamo = entrada.nextLine();
        System.out.println("Ingresar tipo de vehiculo");
        String tipoAutomovil = entrada.nextLine();
        System.out.println("Ingrese la marca del vehiculo");
        String marcaAutomovil = entrada.nextLine();
        System.out.println("Ingresa el nombre del garante");
        String nombreG = entrada.nextLine();
        System.out.println("Ingresar apellido del garante");
        String apellidoG = entrada.nextLine();
        
        Persona personaG = new Persona(nombreG, apellidoG);
 
        System.out.println("Ingresar el valor del automovil");
        double valorAutomovil = entrada.nextDouble();
        
        PrestamoAutomovil prestamoA = new PrestamoAutomovil(personaB, tiempoPrestamoMeses,
                ciudadPrestamo, tipoAutomovil, marcaAutomovil, personaG, valorAutomovil);
        
        prestamoA.calcularvalorMensualAutomovil();
        
        System.out.println(prestamoA);
    }
    
    public static void prestamoEstudiante(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el nombre del beneficiario");
        String nombreB = entrada.nextLine();
        System.out.println("Ingresar apellido del beneficiario");
        String apellidoB = entrada.nextLine();
        
        Persona personaB = new Persona(nombreB, apellidoB);
        
        System.out.println("Ingresar tiempo de préstamo en meses");
        double tiempoPrestamoMeses = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingresar ciudad del préstamo");
        String ciudadPrestamo = entrada.nextLine();
        System.out.println("Ingrese el nivel de estudio");
        String nivelE = entrada.nextLine();
        System.out.println("Ingrese el nombre de centro educativo");
        String nombreCE = entrada.nextLine();
        System.out.println("Ingrese el valor de la carrera");
        double valorC = entrada.nextDouble();
        
        PrestamoEducativo prestamoEdu = new PrestamoEducativo(personaB, 
                tiempoPrestamoMeses, ciudadPrestamo, nivelE, nombreCE, valorC);
        
        prestamoEdu.establecerValorPC();
        
        System.out.println(prestamoEdu);
    }
}
