#función que pide los números
def pideNum():
    x = []
    i = 0
    #ciclo for para llenar la lista de números
    for i in range (7):
        x.append(int(input("Introduzca el número de insectos capturados hoy: ")))
        i += 1
    return x

def countBugs():
    y = pideNum()
    z = 0
    #ciclo for para recorrer y sumar los números
    for i in range (7):
        z = z + y[i]
        i += 1
    
    print(f"El total de insectos es: {z}")

countBugs()