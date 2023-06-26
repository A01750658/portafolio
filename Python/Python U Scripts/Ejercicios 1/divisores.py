#función que pide un número
def pideNum():
    x = int(input("Introduzca un número mayor que 0: "))
    if x <= 0:
        print("Debe introducir un número mayor que 0: ")
    else:
        return x

#función que hace la operación
def divisor():
    #lista para poder tener los resultados
    z = []
    i = 1
    y = pideNum()
    #ciclo for para hacer todas las dividiones
    for i in range (y):
        i += 1
        if y%i == 0:
          z.append(i)
          
        else:
            i += 1
    #imprimir los resultados
    print(f"{y} es divisible por {z}")

divisor()