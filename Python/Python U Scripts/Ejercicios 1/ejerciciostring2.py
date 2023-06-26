def entraParrafo():
    x = input("Introduzca su párrafo: ")
    
    buscaLetra(x)

def buscaLetra(parrafo):
    letra = input("Introduce la letra que quieres buscar: ")
    for i in range(len(parrafo)):
        if (parrafo[i] == letra):
            parrafo = parrafo.replace(letra, "*")
            i+=1
        else:
            i+=1

# def cambiaMayus():
    #for i in range(len(parrafo)):
        #if parrafo[i] == parrafo[i].isupper():
            #parrafo[i] == parrafo[i].lower
entraParrafo()