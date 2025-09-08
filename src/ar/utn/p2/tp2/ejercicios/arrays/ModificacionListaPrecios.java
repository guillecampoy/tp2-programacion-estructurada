package ar.utn.p2.tp2.ejercicios.arrays;

import ar.utn.p2.tp2.core.Exercise;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ModificacionListaPrecios implements Exercise {

    // Constantes utilizadas para inicializar los arreglos y definir montos minimos y máximos
    // Estos dos ultimos permiten de forma dinámica construir un set de pruebas
    private static final int MAX_POSITIONS = 10;
    private static final double MIN_PRICE = 1000.00;
    private static final double MAX_PRICE = 10000.00;

    @Override
    public void execute() {
        //Inicializar lista de precios aleatorios
        List<Double> precios = initRandomPrices(MAX_POSITIONS, MIN_PRICE, MAX_PRICE);

        //Copiar y aplicar modificaciones aleatorias sobre el listado original
        List<Double> preciosModificados = new ArrayList<>(precios);
        applyRandomModifications(preciosModificados, 3, 0.05, 0.20); // 3 posiciones, ±5% a ±20%

        //Listar ambas listas con for-each
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nLista original:");
        printList(precios);

        UtilsColor.imprimirBloque(ContextColor.SUCCESS,"\nLista modificada:");
        printList(preciosModificados);
    }

    /** Genera una lista de 'length' precios en [min, max], redondeados a 2 decimales. */
    static List<Double> initRandomPrices(int length, double min, double max) {
        List<Double> list = new ArrayList<>(length);
        ThreadLocalRandom r = ThreadLocalRandom.current();
        for (int i = 0; i < length; i++) {
            double val = min + r.nextDouble() * (max - min);
            list.add(round2(val));
        }
        return list;
    }

    /**
     * Modifica 'count' posiciones al azar de la lista 'prices' aplicando un ±% en [minPct, maxPct].
     * No devuelve nada (se modifica la lista in-place).
     */
    static void applyRandomModifications(List<Double> prices, int count, double minPct, double maxPct) {
        int n = prices.size();
        if (n == 0) return;

        // Elegimos índices al azar sin repetir
        List<Integer> indices = new ArrayList<>(n);
        for (int i = 0; i < n; i++) indices.add(i);
        Collections.shuffle(indices);
        count = Math.min(count, n);

        ThreadLocalRandom r = ThreadLocalRandom.current();
        for (int k = 0; k < count; k++) {
            int idx = indices.get(k);
            double base = prices.get(idx);
            double sign = r.nextBoolean() ? 1.0 : -1.0;
            double pct = minPct + r.nextDouble() * (maxPct - minPct);
            double nuevo = round2(base * (1.0 + sign * pct));
            prices.set(idx, nuevo);
        }
    }

    /** Imprime la lista con for-each (incluye índice calculado). */
    static void printList(List<Double> valores) {
        int i = 0;
        for (Double v : valores) {
            System.out.printf("[%d] %.2f%n", i++, v);
        }
    }

    private static double round2(double v) {
        return Math.round(v * 100.0) / 100.0;
    }
}