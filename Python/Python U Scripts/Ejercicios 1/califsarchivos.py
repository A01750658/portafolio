def leerArchivo():
    arch = open("califs.txt", "r")
    contenido = arch.readlines()
    
    for i in range (len(contenido)):
        contenido[i] = int(contenido[i])
        i += 1
    
    print(contenido)
    promedio(contenido)
def promedio(contenido):
    sum = 0
    promedio = 0
    
    for i in range (len(contenido)):
        sum = sum +contenido[i]
        i+=1
    promedio = sum/len(contenido)
    print(f"El promedio de las {i+1} calificaciones es: {promedio}")

leerArchivo()