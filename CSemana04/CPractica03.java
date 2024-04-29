package CSemana04;

import java.util.Scanner;

public class CPractica03 {

    public static void main(String[] args) {
        float opcion = seleccionarAuto();
        float distancia = obtenerDistancia();
        float tarifaBase;
        float tarifaPorKm;
        
        if (opcion == 1) {
            tarifaBase = 15.00f;
            tarifaPorKm = 0.20f;
        } else if (opcion == 2) {
            tarifaBase = 20.00f;
            tarifaPorKm = 0.30f;
        } else if (opcion == 3) {
            tarifaBase = 30.00f;
            tarifaPorKm = 0.40f;
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        float montoTotal = calcularMontoTotal(tarifaBase, tarifaPorKm, distancia);

        System.out.println("El monto a pagar es: S/." + montoTotal);
    }

    static int seleccionarAuto() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione el tipo de auto:");
        System.out.println("1. Pequeño");
        System.out.println("2. Mediano");
        System.out.println("3. Grande");
        System.out.print("Ingrese su opción: ");
        return Integer.parseInt(teclado.nextLine());
    }

    static float obtenerDistancia() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la distancia recorrida en kilómetros: ");
        return Float.parseFloat(teclado.nextLine());
    }

    static float calcularMontoTotal(float tarifaBase, float tarifaPorKm, float distancia) {
        float montoTotal = tarifaBase + (tarifaPorKm * distancia);

        // Aplicar aumento del 2.5% si la distancia supera los 10 km
        if (distancia > 10) {
            montoTotal *= 1.025;
        }

        return montoTotal;
    }
}
