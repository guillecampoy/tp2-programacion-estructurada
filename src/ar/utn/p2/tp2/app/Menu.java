package ar.utn.p2.tp2.app;
import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.ejercicios.arrays.ModificacionArrayPrecios;
import ar.utn.p2.tp2.ejercicios.condicionales.CalculoDescuentoCategoria;
import ar.utn.p2.tp2.ejercicios.condicionales.ClasificacioEdad;
import ar.utn.p2.tp2.ejercicios.condicionales.MayorDeTres;
import ar.utn.p2.tp2.ejercicios.condicionales.VerificarAnioBisiesto;
import ar.utn.p2.tp2.ejercicios.funciones.ActualizaStock;
import ar.utn.p2.tp2.ejercicios.funciones.CalculoDescuentoEspecial;
import ar.utn.p2.tp2.ejercicios.funciones.CalculoImpuestoYDescuento;
import ar.utn.p2.tp2.ejercicios.funciones.CostoEnvioYCompra;
import ar.utn.p2.tp2.ejercicios.recursividad.ImpresionRecursivaArray;
import ar.utn.p2.tp2.ejercicios.repeticion.ContadorPosNegCero;
import ar.utn.p2.tp2.ejercicios.repeticion.SumaPares;
import ar.utn.p2.tp2.ejercicios.repeticion.ValidacionNota;

import java.util.Scanner;

public class Menu {
    public static class Main {
        private static final Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            int opcion;
            do {
                mostrarMenu();
                opcion = leerOpcion();
                Exercise ejercicio = obtenerEjercicio(opcion);
                if (ejercicio != null) {
                    ejercicio.execute();
                } else if (opcion != 0) {
                    System.out.println("Opción no válida");
                }
                if (opcion != 0) {
                    System.out.println("Presiona Enter para continuar...");
                    scanner.nextLine();
                }

            }
            while (opcion != 0);
            System.out.println("Chau!");
            scanner.close();
        }

        private static void mostrarMenu() {
            System.out.println("\n===============================================");
            System.out.println("   Trabajo Práctico 2 - Programación estructurada");
            System.out.println("=================================================");
            System.out.println("1. Verificación de Año Bisiesto");
            System.out.println("2. Determinar el Mayor de Tres Números");
            System.out.println("3. Clasificación de Edad");
            System.out.println("4. Calculadora de Descuento según categoría");
            System.out.println("5. Suma de Números Pares (while)");
            System.out.println("6. Contador de Positivos, Negativos y Ceros (for)");
            System.out.println("7. Validación de Nota entre 0 y 10 (do-while)");
            System.out.println("8. Cálculo del Precio Final con impuesto y descuento");
            System.out.println("9. Composición de funciones para calcular costo de envío y total de compra");
            System.out.println("10.Actualización de stock a partir de venta y recepción de productos");
            System.out.println("11.Cálculo de descuento especial usando variable global");
            System.out.println("12.Modificación de un array de precios y visualización de resultados");
            System.out.println("13.Impresión recursiva de arrays antes y después de modificar un elemento");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
        }

        private static int leerOpcion () {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                return -1;
            }
        }

        private static Exercise obtenerEjercicio(int opcion) {
            return switch (opcion) {
                case 1  -> new VerificarAnioBisiesto();
                case 2  -> new MayorDeTres();
                case 3  -> new ClasificacioEdad();
                case 4  -> new CalculoDescuentoCategoria();
                case 5  -> new SumaPares();
                case 6  -> new ContadorPosNegCero();
                case 7  -> new ValidacionNota();
                case 8  -> new CalculoImpuestoYDescuento();
                case 9  -> new CostoEnvioYCompra();
                case 10 -> new ActualizaStock();
                case 11 -> new CalculoDescuentoEspecial();
                case 12 -> new ModificacionArrayPrecios();
                case 13 -> new ImpresionRecursivaArray();
                default -> null;
            };
        }
    }
}
