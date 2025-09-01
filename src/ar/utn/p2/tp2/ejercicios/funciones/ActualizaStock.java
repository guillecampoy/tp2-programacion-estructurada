package ar.utn.p2.tp2.ejercicios.funciones;

import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.util.Scanner;

public class ActualizaStock implements Exercise {
    @Override
    public void execute() {
        int cantVendida;
        int cantRecibida;
        int stockActual;
        Scanner scanner = new Scanner(System.in);

        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el stock actual del producto: ",'n');
        stockActual = scanner.nextInt();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese la cantidad vendida: ",'n');
        cantVendida = scanner.nextInt();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese la cantidad recibida: ",'n');
        cantRecibida = scanner.nextInt();
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "El nuevo stock del producto es: ",'n');
        System.out.println(actualizarStock(stockActual, cantVendida, cantRecibida));
    }

    int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual-cantidadVendida+cantidadRecibida;
    }
}
