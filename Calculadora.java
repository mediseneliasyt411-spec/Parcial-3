/*
 * PROGRAMA: Calculadora
 * LENGUAJE: Java
 * OBJETIVO: Realizar operaciones matematicas basicas
 * utilizando la estructura switch.
 */

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2, resultado;
        int opcion;

        System.out.println("--- CALCULADORA ---");

        System.out.print("Ingresa el primer numero: ");
        num1 = entrada.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        num2 = entrada.nextDouble();

        System.out.println("\\nSelecciona una operacion:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Opcion: ");
        opcion = entrada.nextInt();

        // Selecciona la operacion segun la opcion ingresada.
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                // Evita realizar una division entre cero.
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;

            default:
                System.out.println("Opcion no valida.");
        }

        entrada.close();
    }
}
