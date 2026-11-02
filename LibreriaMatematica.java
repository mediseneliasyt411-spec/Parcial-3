/*
 * PROGRAMA: LibreriaMatematica
 * LENGUAJE: Java
 * OBJETIVO: Mostrar operaciones de la clase Math.
 */

public class LibreriaMatematica {

    public static void main(String[] args) {
        System.out.println("--- LIBRERIA MATH EN JAVA ---");

        double numero = 25;
        System.out.println("Numero: " + numero);

        // sqrt calcula la raiz cuadrada.
        System.out.println("Raiz cuadrada: " + Math.sqrt(numero));

        // pow calcula una potencia: 5 elevado a 2.
        System.out.println("Potencia 5^2: " + Math.pow(5, 2));

        // ceil redondea hacia arriba.
        System.out.println("Redondeo hacia arriba: " + Math.ceil(4.3));

        // floor redondea hacia abajo.
        System.out.println("Redondeo hacia abajo: " + Math.floor(4.8));

        // PI es la constante matematica pi.
        System.out.println("Valor de PI: " + Math.PI);
    }
}
