#función que realiza la operación
def ops(a, b):
    neg = 0
    #for para recorrer la lista de números
    for i in range (a):
        if b[i] < 0:
            neg += 1
            i += 1
        else:
            i += 1
    print(f"Ha ingresado {neg} valores negativos")
def pideNum():
    x = int(input("¿Cuántos valores va a introducir?: "))
    z = []
    if x < 0:
        print("Ese no es un número válido!")
    else:
        #for para llenar la lista de números
        for i in range (x):
            z.append(int(input(f"Escriba el número {i + 1}: ")))
            i += 1
    ops(x, z)
   
pideNum()