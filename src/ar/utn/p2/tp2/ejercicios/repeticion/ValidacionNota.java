package ar.utn.p2.tp2.ejercicios.repeticion;

import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.util.Scanner;

public class ValidacionNota implements Exercise {
    @Override
    public void execute() {
       // Validsción de nota entre 0 y 10 do while
        int nota;
        Scanner scanner = new Scanner(System.in);
        do {
            UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese una nota (0-10): ",'n');
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                UtilsColor.imprimirBloque(ContextColor.ERROR, "Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Nota guardada correctamente.");
    }

}
