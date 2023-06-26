#función en la que el usuario introduce los datos
def entraParrafo():
    x = input("Introduzca su párrafo: ")
    
    buscaLetra(x)

#función que busca y reemplaza la letra utilizando la sentencia replace
def buscaLetra(parrafo):
    letra = input("Introduzca la letra que desea buscar: ")
    parrafo = parrafo.replace(letra, "*")
    
    cambiaMayus(parrafo)

#función que utiliza la sentencia swapcase para cambiar de mayúsculas a minúsculas
def cambiaMayus(parrafo):
    parrafo = parrafo.swapcase()
    
    buscaNum(parrafo)

#función que utiliza replace para cambiar los números por un guión
def buscaNum(parrafo):
    nums = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
    p1 = parrafo
    for i in nums:
        p1 = p1.replace(i, "-")
    imprimeParrafo(p1)
#función que imprime el párrafo 
def imprimeParrafo(parrafo):
    print(parrafo)
    
entraParrafo()    