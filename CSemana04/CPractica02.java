//En la casa de cambio “Cambio Rápido”, desea una aplicación que permita 
//cambiar de soles a dólares, marcos, euros y yenes respectivamente, considere 
//los siguientes tipos de cambio.
//1 dólar = 3.30 soles
//1 euro = 3.57 soles
//1 marco = 1.83 soles.
//1 yen = 0.03 soles
package CSemana04;

import java.util.Scanner;

public class CPractica02 {

    public static void main(String[] args) {
        float soles;
        soles = LeerSoles();
        convertirMonedas(soles);
    }

    static float LeerSoles() {
        Scanner teclado = new Scanner(System.in);
        float soles;
        System.out.print("Ingrese la cantidad en soles: ");
        soles = Float.parseFloat(teclado.next());
        return soles;
    }

    static void convertirMonedas(float soles) {
        float dolares, euros, marcos, yenes;
        dolares = soles / 3.30f;
        euros = soles / 3.57f;
        marcos = soles / 1.83f;
        yenes = soles / 0.03f;

        System.out.println("Cantidad en dólares: " + dolares);
        System.out.println("Cantidad en euros: " + euros);
        System.out.println("Cantidad en marcos: " + marcos);
        System.out.println("Cantidad en yenes: " + yenes);
    }
}
