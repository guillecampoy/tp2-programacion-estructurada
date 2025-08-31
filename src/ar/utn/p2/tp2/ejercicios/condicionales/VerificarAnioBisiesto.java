package ar.utn.p2.tp2.ejercicios.condicionales;

import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.util.Scanner;

public class VerificarAnioBisiesto implements Exercise {
    @Override
    public void execute() {
        boolean anioBisiesto = false;
        Scanner scanner = new Scanner(System.in);
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese un año: ", 'n');
        int anio = scanner.nextInt();

        anioBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        UtilsColor.imprimirEncabezado();
        System.out.println("Año ingresado: "+ anio);
        if (anioBisiesto) {
            UtilsColor.imprimirBloque(ContextColor.INFO, "El año es bisiesto");
        } else  {
            UtilsColor.imprimirBloque(ContextColor.ERROR, "El año no es bisiesto");}
    }
}
