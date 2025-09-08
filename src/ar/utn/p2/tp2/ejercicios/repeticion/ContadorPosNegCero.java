package ar.utn.p2.tp2.ejercicios.repeticion;

import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.util.Scanner;

public class ContadorPosNegCero implements Exercise {
    @Override
    public void execute() {
        // Implementar contador de números positivos, negativos y 0 de un total de 10
        // utilizar un bloque for

        int numero;
        int contadorPos, contadorNeg, contadorCero;
        contadorPos = 0;
        contadorNeg = 0;
        contadorCero = 0;
        Scanner scanner = new Scanner(System.in);
        // implementa ciclo for con 10 elementos
        for (int i = 0; i < 10; i++) {
            UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese número "+i+": ",'n');
            numero = scanner.nextInt();
            if (numero > 0) {
                contadorPos++;
            } else if (numero < 0) {
                contadorNeg++;
            } else {
                contadorCero++;
            }
        }
        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Positivos: "+contadorPos);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Negativos: "+contadorNeg);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Ceros: "+contadorCero);
    }
}
