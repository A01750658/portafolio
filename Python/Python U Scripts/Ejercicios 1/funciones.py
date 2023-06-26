import math
import sys


def circulo():
    x = float(input("Introduzca el radio del círculo: "))
    x2 = math.pow(x, 2)
    p = math.pi
    a = x2*p
    print(f"El área del círculo es: {a}")

def triangulo(x, y):
    a = (x*y)/2
    print(f"El área del triángulo es: {a}")

def cuadrado():
    x = float(input("Introduzca el lado: "))
    a = math.pow(x, 2)
    return a

def operaciones(opcion):
    if (opcion == "círculo" or opcion == "circulo"):
        circulo()
    elif (opcion == "triángulo" or opcion == "triángulo"):
        b = float(input("Introduzca la base: "))
        a = float(input("Introduzca la altura: "))
        triangulo(b, a)
    elif (opcion == "cuadrado"):
        print(f"El área del cuadrado es: {cuadrado()}")
    else:
        print("ACTIVASTE MI CARRRTA TRRRRAMPA,perry el ornitorrinco ")
        sys.exit()


def menu():
    seleccion  = input("Introduzca la ooperacion que quiere hacer\n (las operaciones disponibles son áreas del triángulo, círculo y cuadrado): ")
    return seleccion



operaciones(menu())
