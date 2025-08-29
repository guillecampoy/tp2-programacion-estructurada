package ar.utn.p2.tp2.ejercicios.condicionales;

import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculoDescuentoCategoria implements Exercise {
    @Override
    public void execute() {
        // Si bien lo correcto es utilizar BigDecimal para manejo de monedas
        // Al no se un tipo de dato primitivo y remitiéndome a lo visto hasta este punto en la materia
        // Se opta por utilizar float
        float monto;
        float precioFinal;
        String opcion;
        Scanner scanner = new Scanner(System.in);

        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese valor del artículo: ",'n');
        monto = Float.parseFloat(scanner.nextLine());
        System.out.println("Categoría A: 10% de descuento\n" +
                "Categoría B: 15% de descuento\n" +
                "Categoría C: 20% de descuento");
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese la categoría: ",'n');
        //forzamos conversión a minúsculas para simplificar comparaciones
        opcion = (scanner.nextLine()).toLowerCase();
        switch (opcion) {
            case "a":
                UtilsColor.imprimirEncabezado();
                UtilsColor.imprimirBloque(ContextColor.INFO, "Descuento aplicado, 10%");
                precioFinal = (float) (monto*0.9);
                UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Precio final: $"+precioFinal);
                break;
            case "b":
                UtilsColor.imprimirEncabezado();
                UtilsColor.imprimirBloque(ContextColor.INFO, "Descuento aplicado, 15%");
                precioFinal = (float) (monto*0.75);
                UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Precio final: $"+precioFinal);
                break;
            case "c":
                UtilsColor.imprimirEncabezado();
                UtilsColor.imprimirBloque(ContextColor.INFO, "Descuento aplicado, 20%");
                precioFinal = (float) (monto*0.8);
                UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Precio final: $"+precioFinal);
                break;
            default:
                UtilsColor.imprimirEncabezado();
                UtilsColor.imprimirBloque(ContextColor.SUCCESS, "categoría sin descuento, precio final: "+monto);
        }
    }
}
