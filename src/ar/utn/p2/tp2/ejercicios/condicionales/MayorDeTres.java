package ar.utn.p2.tp2.ejercicios.condicionales;

import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.util.Scanner;

public class MayorDeTres implements Exercise {
    @Override
    public void execute() {
        int mayor;
        Scanner scanner = new Scanner(System.in);
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese un número ", 'n');
        int numero = scanner.nextInt();
        mayor = numero;

        // Siguiendo la guía se propone una implementación mediante condicionales
        // Es posible realizarlo con un ciclo For ya que se sabe de ante mano las iteraciones

        // Lectura y validación segundo número
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese un número ", 'n');
        numero = scanner.nextInt();
        if (numero > mayor) {
            mayor = numero;
        }
        // Lectura y validación tercer número
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese un número ", 'n');
        numero = scanner.nextInt();
        if (numero > mayor) {
            mayor = numero;
        }

        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Número mayor ingresado "+mayor);
    }
}
