# Parcial 3 - Programación en Java y Python

Repositorio con cuatro ejercicios desarrollados en dos lenguajes: Java y Python.

## Contenido

### 1. Prueba de conexión (DO-WHILE / WHILE)
- `java/PruebaConexion.java`
- `python/prueba_conexion.py`

Simula la conexión con un servidor. El estado inicial es `0` (desconectado) y el estado `1` significa conectado. Incluye las opciones para probar conexión, consultar estado y cancelar.

**Nota:** Java utiliza `do-while`. Python no cuenta con una estructura `do-while` nativa, por lo que se utiliza `while` para reproducir el comportamiento solicitado.

### 2. Calculadora (SWITCH / MATCH-CASE)
- `java/Calculadora.java`
- `python/calculadora.py`

Realiza suma, resta, multiplicación y división. En Python se utiliza `match-case`, disponible desde Python 3.10.

### 3. Librería matemática
- `java/LibreriaMatematica.java`
- `python/libreria_matematica.py`

Ejemplos de raíz cuadrada, potencia, redondeo y constante PI. Java utiliza la clase integrada `Math`; Python utiliza el módulo estándar `math`.

### 4. Abstracción en programación orientada a objetos
- `java/Abstraccion.java`
- `python/abstraccion.py`

Ejemplo de clase abstracta `Animal` y clases derivadas `Perro` y `Gato`.

## Requisitos

- Java: JDK 8 o superior.
- Python: Python 3.10 o superior (por el uso de `match-case` en la calculadora).

## Cómo ejecutar

### Java

Abre una terminal en la carpeta `java` y ejecuta:

```bash
javac PruebaConexion.java
java PruebaConexion

javac Calculadora.java
java Calculadora

javac LibreriaMatematica.java
java LibreriaMatematica

javac Abstraccion.java
java Abstraccion
```

### Python

Abre una terminal en la carpeta `python` y ejecuta:

```bash
python prueba_conexion.py
python calculadora.py
python libreria_matematica.py
python abstraccion.py
```

En algunos equipos el comando puede ser `python3` en lugar de `python`.

## Documentación

Los códigos incluyen comentarios en español que explican las clases, funciones, variables, estructuras de control y operaciones principales.
