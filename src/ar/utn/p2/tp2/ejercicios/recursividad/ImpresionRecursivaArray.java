package ar.utn.p2.tp2.ejercicios.recursividad;
import java.text.DecimalFormat;
import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

public class ImpresionRecursivaArray implements Exercise {
    // Índice a modificar y nuevo valor (constantes)
    private static final int TARGET_INDEX = 2;      // 0-based
    private static final double NEW_PRICE  = 129.99;

    // Ajustamos a un único decimal
    private static final DecimalFormat DF = new DecimalFormat("#0.0##");

    @Override
    public void execute() {
        // Declarar e inicializar el array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // Mostrar originales (recursivo)
        UtilsColor.imprimirBloque(ContextColor.INFO,"Precios originales:");
        printRecursiveOriginal(precios, 0);

        // Modificar un elemento específico (constantes)
        if (TARGET_INDEX >= 0 && TARGET_INDEX < precios.length) {
            precios[TARGET_INDEX] = NEW_PRICE;
        }

        // Mostrar modificados (recursivo)
        UtilsColor.imprimirBloque(ContextColor.SUCCESS,"\nPrecios modificados, sólo índice 2 por constante");
        printRecursiveModified(precios, 0);
    }

    // Funciones para listado recursivo, el enunciado solicita que sean dos métodos
    // Se deja xcomo observación que los mismos son exactamente iguales
    // Se aprovecha a colorear de forma diferente para sumar algúndiferencial

    static void printRecursiveOriginal(double[] arr, int idx) {
        if (idx == arr.length) return;
        UtilsColor.imprimirBloque(ContextColor.INFO, "Precio: $" + DF.format(arr[idx]));
        printRecursiveOriginal(arr, idx + 1);
    }

    static void printRecursiveModified(double[] arr, int idx) {
        if (idx == arr.length) return;
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Precio: $" + DF.format(arr[idx]));
        printRecursiveModified(arr, idx + 1);
    }
}
