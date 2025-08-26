package ar.utn.p2.tp2.app;
import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final Map<Integer, Exercise> registry = new LinkedHashMap<>();

    public static void main(String[] args) {
        // Si la terminal no soporta ANSI, descomentar la siguiete línea
        // ConsoleStyle.setEnabled(false);
        new Menu().run();
    }

    private void run() {
        initRegistry(); // registrar placeholders
        try (Scanner in = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                printHeader();
                printOptions();
                System.out.print("\nSeleccione una opción (0 para salir): ");
                String input = in.nextLine().trim();
                int option = parseIntOrMinusOne(input);

                if (option == 0) {
                    UtilsColor.imprimirResultados(ContextColor.INFO, "\n¡Hasta luego!");
                    running = false;
                } else if (registry.containsKey(option)) {
                    Exercise ex = registry.get(option);
                    UtilsColor.imprimirResultados(ContextColor.INFO, "Ejercicio " + option);
                    try {
                        ex.execute(); // acá, cuando implementes, ejecutará la lógica real
                    } catch (UnsupportedOperationException uoe) {
                        UtilsColor.imprimirResultados(ContextColor.WARNING, "Pendiente de implementar ejercicio " + option + ".");
                    } catch (Exception e) {
                        UtilsColor.imprimirResultados(ContextColor.ERROR,"Ocurrió un error ejecutando el ejercicio " + option + ": " + e.getMessage());
                    }
                    promptEnterToContinue(in);
                } else {
                    UtilsColor.imprimirResultados(ContextColor.WARNING,"Opción inválida: " + input);
                    promptEnterToContinue(in);
                }
            }
        }
    }

    /** Registra los 13 ejercicios con placeholders (a reemplazar cuando implementes). */
    private void initRegistry() {
        // Condicionales
        //registry.put(1, notImplemented("Verificación de año bisiesto"));
       // registry.put(2, notImplemented("Mayor de tres números"));
       // registry.put(3, notImplemented("Clasificación de edad"));
       // registry.put(4, notImplemented("Descuento por categoría (A/B/C)"));

        // Repetición
       // registry.put(5, notImplemented("Suma de números pares (while)"));
       // registry.put(6, notImplemented("Contador positivos/negativos/ceros (for)"));
       // registry.put(7, notImplemented("Validación de nota 0–10 (do-while)"));

        // Funciones
        //registry.put(8, notImplemented("Precio final (base + impuesto − descuento)"));
        //registry.put(9, notImplemented("Costo de envío + total de compra (composición)"));
        //registry.put(10, notImplemented("Actualización de stock"));
        //registry.put(11, notImplemented("Descuento especial con variable global"));

        // Arrays y Recursividad
        //registry.put(12, notImplemented("Array de precios (modificar y mostrar)"));
        //registry.put(13, notImplemented("Impresión recursiva de array antes/después"));
    }

    private void printHeader() {
        System.out.println("\n==============================================");
        System.out.println("   Programación II — TP2: Programación Estructurada");
        System.out.println("==============================================");
    }

    private void printOptions() {
        System.out.println("\nCondicionales");
        System.out.println("  1) Año bisiesto");
        System.out.println("  2) Mayor de tres números");
        System.out.println("  3) Clasificación de edad");
        System.out.println("  4) Descuento por categoría");

        System.out.println("\nRepetición");
        System.out.println("  5) Suma de pares (while)");
        System.out.println("  6) Contador +/-/0 (for)");
        System.out.println("  7) Validación de nota (do-while)");

        System.out.println("\nFunciones / Métodos");
        System.out.println("  8) Precio final");
        System.out.println("  9) Costo de envío + total");
        System.out.println(" 10) Actualizar stock");
        System.out.println(" 11) Descuento especial (global)");

        System.out.println("\nArrays y Recursividad");
        System.out.println(" 12) Array de precios (modificar)");
        System.out.println(" 13) Array de precios (recursivo)");
        System.out.println("\n  0) Salir");
    }
    private void promptEnterToContinue(Scanner in) {
        System.out.print("\nPresione ENTER para volver al menú...");
        in.nextLine();
    }

    private int parseIntOrMinusOne(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }
}
