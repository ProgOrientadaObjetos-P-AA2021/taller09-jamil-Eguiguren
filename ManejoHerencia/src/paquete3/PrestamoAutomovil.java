/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualAutomovil;

    public PrestamoAutomovil(Persona b, double tPM, String cP, String tA, String mA, Persona g1, double vA) {
        super(b, tPM, cP);

        tipoAutomovil = tA;
        marcaAutomovil = mA;
        garante1 = g1;
        valorAutomovil = vA;
    }

    public void establecerTipoAutomovil(String tA) {
        tipoAutomovil = tA;
    }

    public void establecerMarcaAutomovil(String mA) {
        marcaAutomovil = mA;
    }

    public void establecerGarante1(Persona g1) {
        garante1 = g1;
    }

    public void establecerValorAutomovil(double vA) {
        valorAutomovil = vA;
    }

    public void calcularvalorMensualAutomovil() {
        valorMensualAutomovil = valorAutomovil / obtenerTiempoDePrestamoEnMeses();
    }

    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarcaAutomovil() {
        return marcaAutomovil;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensualAutomovil() {
        return valorMensualAutomovil;
    }

    @Override
    public String toString() {
        String cadena = String.format("Beneficiarios\n\tNombre: %s\n\tApellido: %s\n"
                + "Tiempo de prestamo en meses: %.2f\nCiudad del prestamo: %s\n",
                beneficiario.obtenerNombre(), beneficiario.obtenerApellido(),
                obtenerTiempoDePrestamoEnMeses(), obtenerCiudadPrestamo().toLowerCase());
        cadena = String.format("%sTipo de automovil: %s\nMarca del automovil: %s\n"
                + "Garante\n\tNombre: %s\n\tApellido: %s\nvalor del automovil: "
                + "%.2f\nvalor mensual de pago: %.2f\n", cadena, obtenerTipoAutomovil(),
                obtenerMarcaAutomovil(), obtenerGarante1().obtenerNombre(),
                obtenerGarante1().obtenerApellido(), obtenerValorAutomovil(),
                obtenerValorMensualAutomovil());
        return cadena;
    }
}
