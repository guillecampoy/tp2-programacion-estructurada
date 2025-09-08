package ar.utn.p2.tp2.ejercicios.condicionales;

import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.util.Scanner;

public class ClasificacioEdad implements Exercise {
    @Override
    public void execute() {
        int edad;
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el edad ", 'n');
        Scanner scanner = new Scanner(System.in);
        edad = scanner.nextInt();

        //Determinamos según la edad con bloques condicionales
        if (edad < 12) {
            UtilsColor.imprimirEncabezado();
            UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Eres un niño");
        } else if (edad <= 17) {
            UtilsColor.imprimirEncabezado();
            UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Eres un adolescente");
        }  else if (edad <= 59) {
            UtilsColor.imprimirEncabezado();
            UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Eres un adulto");
        } else {
            UtilsColor.imprimirEncabezado();
            UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Eres un adulto mayor");
        }

    }
}
