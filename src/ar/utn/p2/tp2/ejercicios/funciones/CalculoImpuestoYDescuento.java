package ar.utn.p2.tp2.ejercicios.funciones;

import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.util.Scanner;

public class CalculoImpuestoYDescuento implements Exercise {
    @Override
    public void execute() {
       double impuesto, descuento, precioBase, precioFinal;
       Scanner scanner = new Scanner(System.in);
       UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese precio base del producto: ", 'n');
       precioBase = scanner.nextDouble();
       UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ", 'n');
       impuesto = scanner.nextDouble();
       UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ", 'n');
       descuento = scanner.nextDouble();

       // fijamos en dos decimales el resultado utilizando las funcionalidades de la clase Math
       precioFinal = Math.round(calcularPrecioFinal(impuesto, descuento, precioBase));

       UtilsColor.imprimirEncabezado();
       UtilsColor.imprimirBloque(ContextColor.SUCCESS, "El precio final del producto es: "+precioFinal);
    }

    double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
        return precioBase * (1 - descuento / 100) * (1 + impuesto / 100);
    }
}
