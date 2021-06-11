/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelE;
    private String nombreCE;
    private double valorC;
    private double valorPC;

    public PrestamoEducativo(Persona b, double tPM, String cP, String nE, String nCE, double vC) {
        super(b, tPM, cP);

        nivelE = nE;
        nombreCE = nCE;
        valorC = vC;

    }

    public void establecerNivelE(String n) {
        nivelE = n;
    }

    public void establecerNombre(String nom) {
        nombreCE = nom;
    }

    public void establecerValorC(double vC) {
        valorC = vC;
    }

    public void establecerValorPC() {
        valorPC = (valorC / obtenerTiempoDePrestamoEnMeses());
        valorPC = valorPC - (valorPC * 10) / 100;
    }

    public String obtenerNivelE() {
        return nivelE;
    }

    public String obtenerNombreCentroE() {
        return nombreCE;
    }

    public double obtenerValorC() {
        return valorC;
    }

    public double obtenerValorPC() {
        return valorPC;
    }

    @Override
    public String toString() {
        String cadena = String.format("Beneficiarios\n\tNombre: %s\n\tApellido: %s\n"
                + "Tiempo de prestamo en meses: %.2f\nCiudad del prestamo: %s\n",
                beneficiario.obtenerNombre(), beneficiario.obtenerApellido(),
                obtenerTiempoDePrestamoEnMeses(), obtenerCiudadPrestamo().toUpperCase());
        cadena = String.format("%sNivel del estudio: %s\nNombre del centro "
                + "Educativo: %s\nValor de la carrera: %.2f\nvalor mensual del "
                + "pago del préstamo del valor de la carrera: %.2f\n", cadena,
                obtenerNivelE(), obtenerNombreCentroE(), obtenerValorC(),
                obtenerValorPC());
        return cadena;
    }
}
