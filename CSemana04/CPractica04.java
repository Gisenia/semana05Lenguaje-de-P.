//Realizar una programa para determinar la cantidad de dinero que recibirá un 
//trabajador por concepto de las horas extras trabajadas en una empresa, sabiendo
//que cuando las horas de trabajo exceden de 40, el resto se consideran horas 
//extras y que éstas se pagan al doble de una hora normal cuando no exceden de 8; 
//si las horas extras exceden de 8 se pagan las primeras 8 al doble de lo que 
//se paga por una hora normal y el resto al triple.
package CSemana04;

import java.util.Scanner;

public class CPractica04 {

    public static void main(String[] args) {
        float horasTrabajadas = obtenerHorasTrabajadas();
        float pagoPorHora = obtenerPagoPorHora();

        float pagoTotal = calcularPagoTotal(horasTrabajadas, pagoPorHora);

        System.out.println("El pago total es: S/." + pagoTotal);
    }

    static float obtenerHorasTrabajadas() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas: ");
        return Float.parseFloat(teclado.nextLine());
    }

    static float obtenerPagoPorHora() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el pago por hora: S/. ");
        return Float.parseFloat(teclado.nextLine());
    }

    static float calcularPagoTotal(float horasTrabajadas, float pagoPorHora) {
        float pagoTotal;
        float horasNormales = Math.min(horasTrabajadas, 40); // Hasta 40 horas son normales
        float horasExtras = Math.max(horasTrabajadas - 40, 0); // Horas extras (máximo 8)
        float horasExtrasDobles = Math.min(horasExtras, 8); // Hasta 8 horas extras dobles
        float horasExtrasTriples = Math.max(horasExtras - 8, 0); // Resto de horas extras (triple)

        pagoTotal = horasNormales * pagoPorHora; // Pago por horas normales

        // Pago por horas extras dobles
        pagoTotal += horasExtrasDobles * (pagoPorHora * 2);

        // Pago por horas extras triples
        pagoTotal += horasExtrasTriples * (pagoPorHora * 3);

        return pagoTotal;
    }
}
