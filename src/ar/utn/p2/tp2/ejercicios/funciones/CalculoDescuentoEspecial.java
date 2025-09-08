package ar.utn.p2.tp2.ejercicios.funciones;

import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.util.Scanner;

public class CalculoDescuentoEspecial implements Exercise {
    double descuento = 0.10;

    @Override
    public void execute() {
        double precioProducto;
        Scanner scanner = new Scanner(System.in);
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el precio del producto: ",'n');
        precioProducto = scanner.nextDouble();
        calcularDescuentoEspecial(precioProducto);
    }

    void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio*descuento;
        double costofinal = precio - descuentoAplicado;
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "El descuento especial aplicado es: "+"%.2f".formatted(descuentoAplicado));
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "El precio final con descuento es: "  +"%.2f".formatted(costofinal));
    }
}
