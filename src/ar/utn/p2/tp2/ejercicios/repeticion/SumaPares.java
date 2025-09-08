package ar.utn.p2.tp2.ejercicios.repeticion;

import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.util.Scanner;

public class SumaPares implements Exercise {
    @Override
    public void execute() {
        // Suma de números pares con bloque while
        int numero;

        // Se debe inicializar suma, ya que si no entra al cilo al mostrarla puede dar error
        int suma = 0;

        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese un número (0 para terminar): ", 'n');
        Scanner scanner = new Scanner(System.in);

        // realizamos la primer lectura fuera del ciclo
        numero = scanner.nextInt();
        while (numero != 0) {
            // Suma solo si es par
            if (numero % 2 == 0) {
                suma += numero;
            }
            UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese un número (0 para terminar): ",'n');
            numero = scanner.nextInt();
        }
        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Suma de pares: "+suma);
    }
}
