"""
PROGRAMA: Abstraccion
LENGUAJE: Python
OBJETIVO: Demostrar abstraccion, herencia y sobrescritura
de metodos mediante las clases Animal, Perro y Gato.
"""

# ABC y abstractmethod permiten definir clases y metodos abstractos.
from abc import ABC, abstractmethod


# Clase abstracta que funciona como modelo general.
class Animal(ABC):

    # Metodo abstracto que las clases hijas deben implementar.
    @abstractmethod
    def hacer_sonido(self):
        pass

    # Metodo concreto que pueden heredar las clases hijas.
    def dormir(self):
        print("El animal esta durmiendo.")


# Perro hereda de Animal.
class Perro(Animal):

    # Implementacion del metodo abstracto.
    def hacer_sonido(self):
        print("El perro dice: Guau guau")


# Gato hereda de Animal.
class Gato(Animal):

    # Implementacion del metodo abstracto.
    def hacer_sonido(self):
        print("El gato dice: Miau miau")


print("--- EJEMPLO DE ABSTRACCION ---")

# Creacion de objetos de las clases hijas.
perro = Perro()
gato = Gato()

# Cada objeto ejecuta su propia implementacion.
perro.hacer_sonido()
perro.dormir()

print()

gato.hacer_sonido()
gato.dormir()
