import math

#función que hace la operación
def potNum(x, y):
    while x <= y:
        print(math.pow(x, 3))
        x+=1

#función que pide los números
def pideNum():
    a = int(input("Ingresa el límite inferior: "))
    b = int(input("Ingresa el límite superior: "))
    potNum(a, b)


    
pideNum()