
print("--- CALCULADORA ---")

num1 = float(input("Ingresa el primer numero: "))
num2 = float(input("Ingresa el segundo numero: "))

print("\\nSelecciona una operacion:")
print("1. Sumar")
print("2. Restar")
print("3. Multiplicar")
print("4. Dividir")

opcion = int(input("Opcion: "))

# match-case selecciona la operacion solicitada.
match opcion:
    case 1:
        resultado = num1 + num2
        print("Resultado:", resultado)

    case 2:
        resultado = num1 - num2
        print("Resultado:", resultado)

    case 3:
        resultado = num1 * num2
        print("Resultado:", resultado)

    case 4:
        # Evita realizar una division entre cero.
        if num2 != 0:
            resultado = num1 / num2
            print("Resultado:", resultado)
        else:
            print("No se puede dividir entre cero.")

    case _:
        print("Opcion no valida.")
