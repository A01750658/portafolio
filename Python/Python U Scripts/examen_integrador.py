def haciendoLista():
    #función que abre el archivo y regresa una lista
    r = open("GrupoExploradora.txt")
    lista=r.read()
    lista.split("\n")
    return(lista)

def promedio():
    #función que calculael promedio de la lista y la calificación menor
    print("Leyendo el archivo...")
    lista = haciendoLista()
    
    print("Calculando...")
    
    #variables en las qu se extraen los datos de la lista de manera manual
    
    valorDora = float(lista[0:3])
    valorBotas = float(lista[8:12])
    valorBeny = float(lista[18:22])
    valorIsa = float(lista[27:31])
    valorMochila = float(lista[35:39])
    valorDiego = float(lista[47:51])
    valorTico = float(lista[57:61])
    valorZorro = float(lista[67:71])
    valorAlicia = float(lista[77:81])
    valorTroll = float(lista[88:92])
    
    #lista que guarda todos los valores
    
    valores = [valorDora, valorBotas, valorBeny, valorIsa, valorMochila, valorDiego, valorTico, valorZorro, valorAlicia, valorTroll]
    promedio = 0.00
    valorMenor = 10.00
    i = 0
    #for que determina el número menor de la lista
    for i in range(len(valores)):
        if (valores[i] < valorMenor):
            valorMenor = valores[i]
    #for que determina el promedio de los valores de la lista
    for i in range(len(valores)):
        promedio = promedio+valores[i]
    promedio = promedio/len(valores)
    imprimir(promedio, valorMenor)

    
    
def imprimir(promedio, menor):
    #función que guarda los datos en el archivo promedios.txt
    print("Imprimiendo el archivo")
    w = open("promedios.txt", "w")
    w.write(f"El promedio del grupo es: {promedio}\n")
    w.write(f"La calificación menor es: {menor}")

promedio()
