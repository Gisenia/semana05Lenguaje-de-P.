package CSemana04;

import java.util.Scanner;

public class CActividad01 {

    public static void main(String[] args) {
        float num1, num2, num3;
        num1 = LeerNumero();
        num2 = LeerNumero();
        num3 = LeerNumero();
        identificarMayorMenor(num1, num2, num3);
    }

    static float LeerNumero() {
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.print("Ingrese un numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }

    static void identificarMayorMenor(float num1, float num2, float num3) {
        float mayor = num1;
        float menor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num2 < menor) {
            menor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
