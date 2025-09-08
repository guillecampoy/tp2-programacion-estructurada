# 🧩 Programación II — Trabajo Práctico 2: **Programación Estructurada**

> **Cátedra:** Programación II  
> **Alumno:** Guillermo Campoy  
> **Docente:** Giuliano Espejo  
> **Año/Cuat.**: 2025 / 2C  
> **Lenguaje:** Java (>= 21)
---

## 🎯 Objetivo
Implementar una serie de ejercicios de **programación estructurada** en Java (condicionales, bucles, funciones/métodos, arrays y recursividad), manteniendo **una organización clara por paquetes** y un **menú de consola** para ejecutar cada ejercicio.

---

## 🗂️ Estructura propuesta de paquetes

- **`core/Exercise.java`**: interfaz común con `void execute()` para cada ejercicio.
- **`utils/ConsoleStyle.java`**: utilitaria de **decorado** para imprimir títulos/éxitos/errores con ANSI (opcional pero recomendado).
- **`app/Menu.java`**: punto de entrada (`public static void main`), menú textual y registro de ejercicios.

---

## 📋 Guía de ejercicios

### Condicionales
1. Verificación de año bisiesto
2. Determinar el mayor de tres números
3. Clasificación de edad
4. Calculadora de descuento por categoría (A/B/C)

### Repetición
5. Suma de números pares (while) — termina con 0
6. Contador de positivos/negativos/ceros (for, 10 entradas)
7. Validación de nota 0–10 (do-while)

### Funciones / Métodos
8. Precio final (base + impuesto − descuento)
9. Costo de envío (zona/peso) + total de compra (composición)
10. Actualización de stock (vendida/recibida)
11. Descuento especial con variable global

### Arrays y Recursividad
12. Modificar un array de precios y mostrar antes/después
13. Impresión **recursiva** de array antes/después de modificar
