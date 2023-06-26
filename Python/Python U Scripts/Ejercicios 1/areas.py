import math

def menu():
    x = int(input(" (1) Área del Triángulo \n (2) Área del Círculo \n (3) Área del Cuadrado \n (4) Área del Rectángulo\n Introduce el área que quieres calcular: "))
    return x

def operaciones():
    y = menu()
    if y == 2:
        r = float(input("Introduce el radio del círculo: "))
        a = math.pi * math.pow(r, 2)
        print(f"El área del círculo es: {a}")
    elif y == 1:
        b = float(input("Introduce la base: "))
        h = float(input("Introduce la altura: "))
        a = (b*h)/2
        print(f"El área del triángulo es: {a}")
    elif y == 3:
        l = float(input("Introduce el lado del cuadrado: "))
        a = math.pow(l, 2)
        print(f"El área del cuadrado es: {a}")
    elif y == 4:
        b = float(input("Introduce la base: "))
        h = float(input("Introduce la altura: "))
        a = b*h
        print(f"El área el rectángulo es: {a}")
    else:
        print("La opción no existe")
operaciones()
print("ADIOS")