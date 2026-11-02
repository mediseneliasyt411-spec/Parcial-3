"""
PROGRAMA: Prueba de conexion
LENGUAJE: Python
OBJETIVO: Simular la conexion con un servidor mediante
un menu, una funcion booleana y un ciclo while.
"""

# Devuelve True cuando el estado indica que no hay conexion.
def sin_conexion(estado):
    return estado == 0


# Estado inicial: 0 = desconectado, 1 = conectado.
estado = 0

# Python no tiene do-while nativo; while reproduce este ciclo.
while sin_conexion(estado):
    print("\\n--- PRUEBA DE CONEXION ---")
    print("1. Probar conexion")
    print("2. Ver estado")
    print("3. Cancelar")

    opcion = int(input("Selecciona una opcion: "))

    if opcion == 1:
        nuevo_estado = int(input("Ingresa el nuevo estado (0 o 1): "))

        # Solo se aceptan los estados 0 y 1.
        if nuevo_estado == 0 or nuevo_estado == 1:
            estado = nuevo_estado
        else:
            print("Estado no valido.")

    elif opcion == 2:
        if estado == 0:
            print("Estado: Desconectado")
        else:
            print("Estado: Conectado")

    elif opcion == 3:
        print("Prueba cancelada.")
        break

    else:
        print("Opcion no valida.")

if estado == 1:
    print("Servidor conectado.")
