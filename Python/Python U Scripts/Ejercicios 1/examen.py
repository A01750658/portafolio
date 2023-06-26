import math

#función que recibe el número ingresado por el usuario
def recibeNum():
    x = int(input("Ingresa el valor hasta el cuál quieres que se resuelva la ecuación: "))
    print(f"x\tf(x)\n")
    print("---------------")
    return x
#función que realiza la operación
def ops():
    x = recibeNum()
    #contador
    i = 0
    #ciclo
    while i <= x:
        if i%2 == 0:
            i+=1
        else:
            #ecuación
            y = (math.pow(i, 3)) + (3*i) + 2
            #imprimir el valor de x
            print(f"{i}\t{y}")
            #imprimir el resultado de la ecuación
            print
            i+=1
ops()