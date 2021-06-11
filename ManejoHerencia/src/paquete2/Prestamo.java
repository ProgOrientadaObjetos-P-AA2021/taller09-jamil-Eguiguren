/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo{
    protected Persona beneficiario;
    protected double tiempoPrestamoMeses;
    protected String ciudadPrestamo;
    
    public Prestamo(Persona b, double tPM, String cP){
        beneficiario = b;
        tiempoPrestamoMeses = tPM;
        ciudadPrestamo = cP;
    }
    
    public void establecerBeneficiario(Persona b){
        beneficiario = b;
    }
    
    public void establecerTiempoDePrestamoEnMeses(double tPM){
         tiempoPrestamoMeses = tPM;
    }
    
    public void establecerCiudadPrestamo(String cP){
         ciudadPrestamo = cP;
    }
    
     public Persona obtenerBeneficiario(){
        return beneficiario;
    }
    
    public double obtenerTiempoDePrestamoEnMeses(){
         return tiempoPrestamoMeses;
    }
    
    public String obtenerCiudadPrestamo(){
         return ciudadPrestamo;
    }
    
    @Override
    public String toString(){
        String cadena;
        cadena = String.format("Beneficiarios\n\tNombre: %s\n\tApellido: %s\n"
                + "Tiempo de prestamo en meses: %.2f\nCiudad del prestamo: %s\n",
                beneficiario.obtenerNombre(), beneficiario.obtenerApellido(),
                obtenerTiempoDePrestamoEnMeses(), obtenerCiudadPrestamo());
        return cadena;
    }
}
