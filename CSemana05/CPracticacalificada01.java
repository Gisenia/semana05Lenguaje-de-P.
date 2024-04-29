package CSemana05;

import java.util.Scanner;

public class CPracticacalificada01 {
    public static void main(String[] args) {
        float precio, cantidad, importeCompra, descuento1, descuento2, descuentoTotal, importePagar;

        precio = LeerPrecioProducto();
        cantidad = LeerCantidadProductos();

        importeCompra = CalcularImporteCompra(precio, cantidad);
        descuento1 = CalcularDescuento1(importeCompra);
        descuento2 = CalcularDescuento2(importeCompra, descuento1);
        descuentoTotal = CalcularDescuentoTotal(descuento1, descuento2);
        importePagar = CalcularImportePagar(importeCompra, descuentoTotal);

        Imprimirventa(importeCompra, descuento1, descuento2, descuentoTotal, importePagar);
    }

    static float LeerPrecioProducto() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: $");
        return teclado.nextFloat();
    }

    static float LeerCantidadProductos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos adquiridos: ");
        return teclado.nextFloat();
    }

    static float CalcularImporteCompra(float precio, float cantidad) {
        return precio * cantidad;
    }

    static float CalcularDescuento1(float importeCompra) {
        return 0.07f * importeCompra;
    }

    static float CalcularDescuento2(float importeCompra, float descuento1) {
        return 0.07f *descuento1; 
    }

    static float CalcularDescuentoTotal(float descuento1, float descuento2) {
        return descuento1 + descuento2;
    }

    static float CalcularImportePagar(float importeCompra, float descuentoTotal) {
        return importeCompra - descuentoTotal;
    }

    static void Imprimirventa(float importeCompra, float descuento1, float descuento2, float descuentoTotal, float importePagar) {
        System.out.println("Resumen de la compra:");
        System.out.println("------------------------------");
        System.out.println("Importe de la compra: $" + importeCompra);
        System.out.println("Importe del primer descuento: $" + descuento1);
        System.out.println("Importe del segundo descuento: $" + descuento2);
        System.out.println("Importe del descuento total: $" + descuentoTotal);
        System.out.println("------------------------------");
        System.out.println("Importe a pagar: $" + importePagar);
    }
}
