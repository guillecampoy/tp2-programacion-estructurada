package ar.utn.p2.tp2.ejercicios.funciones;

import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.util.Scanner;

public class CostoEnvioYCompra implements Exercise {
    @Override
    public void execute() {
        double precioProducto;
        double pesoPaquete;
        String zonaEnvio;
        double costoEnvio;
        double costoTotal;
        Scanner scanner = new Scanner(System.in);

        // Lectura de variables
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el precio del producto: ", 'n');
        precioProducto = scanner.nextDouble();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el peso del producto en Kg: ", 'n');
        pesoPaquete = scanner.nextDouble();
        scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese la zona de envío (Nacional/Internacional): ", 'n');
        zonaEnvio = scanner.nextLine();

        // Llamado a funciones auxiliares y cálculos
        costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);
        costoTotal= calcularTotalCompra(precioProducto, costoEnvio);

        // Resultados
        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "El costo del envio es: "+costoEnvio);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "El total a pagar es: "+costoTotal);

    }

    //métodos auxiliares de la clase para cálculo del ejercicio
    double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;

        switch(zona){
            case "Nacional": costoEnvio = peso * 5;
            break;
            case "Internacional": costoEnvio = peso * 10;
            break;
        }
        return costoEnvio;
    }

    double calcularTotalCompra (double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

}
