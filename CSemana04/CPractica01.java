//Implementar una aplicación que lea tres números enteros y determine el mayor, 
//menor e intermedio de los números, utilizando la sentencia selectiva simple.
package CSemana04;

import java.util.Scanner;

public class CPractica01 {
    
    public static void main(String[] args) {
        float num1, num2, num3, mayor, menor, intermedio;
        num1 = LeerNumero();
        num2 = LeerNumero();
        num3 = LeerNumero();
        mayor = hallarelmayor(num1, num2, num3);
        menor = hallarelmenor(num1, num2, num3);
        intermedio = hallarintermedio(num1, num2, num3, mayor, menor);
        imprimir(mayor, menor, intermedio);
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
    
    static float hallarelmenor(float num1, float num2, float num3) {
        float menor;
        menor = 0;
        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else {
            if (num2 < num1 && num2 < num3) {
                menor = num2;
            } else {
                if (num3 < num1 && num3 < num2) {
                    menor = num3;
                }
            }
        }
        return menor;
    }

    static float hallarintermedio(float num1, float num2, float num3, float mayor, float menor) {
        float intermedio;
        intermedio = num1 + num2 + num3 - mayor - menor;
        return intermedio;
    }
    
    static void imprimir(float mayor, float menor, float intermedio) {
           System.out.println("------------------------------------");
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero intermedio es: " + intermedio);
    }
}
