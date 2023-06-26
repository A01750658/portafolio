#función que pide la logitud de la lista
def pedirCuantos():
    x = int(input("Cuántas edades ingresarás?: "))
    pedirNombres(x)

#función que pide los nombres para poder llenar la lista con un for
def pedirNombres(a):
    y = []
    i = 0
    for i in range (a):
        y.append(int(input(f"Dame la edad del animal {i + 1}: ")))
        i += 1
    imprimir(y)

#función que imprime la lista
def imprimir(lista):
    print(f"las edades con: {lista}")
    contenidoCasilla(lista)

#función que imprime el contenido de la casilla que introduzca el usuario
def contenidoCasilla(lista):
    x = int(input("El contenido de que casilla que desas saber: "))
    print(f"El contenido de la casilla {x} es: {lista[x]}")
    promedioEdades(lista)

#función que suma todos los valores de la lista e imprime el promedio de los valores
def promedioEdades(lista):
    i = 0
    x = 0
    for i in range (len(lista)):
        x = x + lista[i]
        i+=1
    prom = x/len(lista)
    print(f"El promedio de las edades es: {prom}")
    informacion(lista)

#función que muestra las veces que los valores aparecen en una lista, imprime el máximo, el mínimo y el último valor de la lista
def informacion(lista):
    x = int(input("Qué edad deseas encontrar?: "))
    i = 0
    count = 0
    for i in range(len(lista)):
        if (lista[i] == x):
            count += 1
            i += 1
        else:
            i += 1
    
    print(f" la edad {x} aparece {count} veces en la lista")
    print(f"La edad máxima de la lista es: {max(lista)}")
    print(f"La edad mínima de la lista es: {min(lista)}")
    print(f"El úlitmo valor de la lista es: {lista[-1]}")
    
pedirCuantos()