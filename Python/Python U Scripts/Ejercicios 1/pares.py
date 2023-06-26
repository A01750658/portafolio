
#función que hace la operación
def potNum(x, y):
    while x <= y:
        if (x%2 == 0):
            print(x)
        x+=1

#función que pide los números
def pideNum():
    a = int(input("Ingresa el límite inferior: "))
    b = int(input("Ingresa el límite superior: "))
    potNum(a, b)


    
pideNum()