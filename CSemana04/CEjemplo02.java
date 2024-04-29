package CSemana04;

import java.util.Scanner;

public class CEjemplo02 {
    
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
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else {
            if (num2 > num1 && num2 > num3) {
                mayor = num2;
            } else {
                if (num3 > num1 && num3 > num2) {
                    mayor = num3;
                }
            }
        }
        return mayor;
    }

    
    static void imprimir(float mayor) {
           System.out.println("------------------------------------");
        System.out.println("El numero mayor es: " + mayor);
    }
}
