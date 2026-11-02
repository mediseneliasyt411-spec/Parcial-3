
// Clase abstracta: sirve como modelo para sus clases hijas.
abstract class Animal {

    // Metodo abstracto: las clases hijas deben implementarlo.
    abstract void hacerSonido();

    // Metodo concreto que pueden heredar las clases hijas.
    public void dormir() {
        System.out.println("El animal esta durmiendo.");
    }
}

// Perro hereda de Animal.
class Perro extends Animal {

    // Implementa el metodo abstracto de Animal.
    @Override
    void hacerSonido() {
        System.out.println("El perro dice: Guau guau");
    }
}

// Gato hereda de Animal.
class Gato extends Animal {

    // Implementa el metodo abstracto de Animal.
    @Override
    void hacerSonido() {
        System.out.println("El gato dice: Miau miau");
    }
}

// Clase principal.
public class Abstraccion {

    public static void main(String[] args) {

        // Se crean objetos de las clases hijas usando referencias Animal.
        Animal perro = new Perro();
        Animal gato = new Gato();

        System.out.println("--- EJEMPLO DE ABSTRACCION ---");

        // Cada objeto ejecuta su propia version del metodo.
        perro.hacerSonido();
        perro.dormir();

        System.out.println();

        gato.hacerSonido();
        gato.dormir();
    }
}
