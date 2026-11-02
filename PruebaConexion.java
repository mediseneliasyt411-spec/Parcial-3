/*
 * PROGRAMA: PruebaConexion
 * LENGUAJE: Java
 * OBJETIVO: Simular la conexion de un usuario con un servidor
 * mediante un menu y un ciclo do-while.
 */

import java.util.Scanner;

public class PruebaConexion {

    // Devuelve true cuando el estado indica que no hay conexion.
    public static boolean sinConexion(int estado) {
        return estado == 0;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Estado inicial: 0 = desconectado, 1 = conectado.
        int estado = 0;
        int opcion;
        int nuevoEstado;

        // El menu se ejecuta al menos una vez.
        do {
            System.out.println("\\n--- PRUEBA DE CONEXION ---");
            System.out.println("1. Probar conexion");
            System.out.println("2. Ver estado");
            System.out.println("3. Cancelar");
            System.out.print("Selecciona una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nuevo estado (0 o 1): ");
                    nuevoEstado = entrada.nextInt();

                    // Solo se aceptan los estados 0 y 1.
                    if (nuevoEstado == 0 || nuevoEstado == 1) {
                        estado = nuevoEstado;
                    } else {
                        System.out.println("Estado no valido.");
                    }
                    break;

                case 2:
                    if (estado == 0) {
                        System.out.println("Estado: Desconectado");
                    } else {
                        System.out.println("Estado: Conectado");
                    }
                    break;

                case 3:
                    System.out.println("Prueba cancelada.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        // Se repite mientras no haya conexion y no se haya cancelado.
        } while (sinConexion(estado) && opcion != 3);

        if (estado == 1) {
            System.out.println("Servidor conectado.");
        }

        entrada.close();
    }
}
