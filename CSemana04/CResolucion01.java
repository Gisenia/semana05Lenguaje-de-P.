package CSemana04;

import java.util.Scanner;

public class CResolucion01 {

    public static void main(String[] args) {
        float num1, num2, num3, mayor;
        num1 = LeerNumero();
        num2 = LeerNumero();
        num3 = LeerNumero();
        mayor = hallarelmayor(num1, num2, num3);
        imprimir(mayor);
        
    }

    static float LeerNumero() {
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.print("Ingrese un numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }

    static float hallarelmayor(float num1, float num2, float num3) {
        float mayor;
        mayor = 0;
        if (mayor < num1) {
            mayor = num1;
        }
        if (mayor < num2) {
            mayor = num2;
        }
        if (mayor < num3) {
            mayor = num3;
        }
        return mayor;
    }

    static void imprimir(float mayor) {
        System.out.println("El numero mayor es: " + mayor);
    }
}
