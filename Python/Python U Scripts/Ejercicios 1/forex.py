#importar librería math
import math
#función que pide número
def ingresaNum():
    x = int(input("Ingresa el número: "))
    return x

#función que hace los cuadrados
def potenciaNum():
    #llamada a la función ingresaNum (se suma 1 para que aparezca el número bien)
    x = ingresaNum() + 1
    i = 1
    for i in range (i, x):
        print(int(math.pow(i, 2)))
        i+=i
#llamada a la función potenciaNum()
potenciaNum()