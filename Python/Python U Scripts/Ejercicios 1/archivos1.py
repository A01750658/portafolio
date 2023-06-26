def abrirArchivo():
    arch = open("yeet.txt", "w")
    
    parrafo = input("Dame párrafo a guardar: ")
    
    arch.write(parrafo)
    
    arch.close
    
    arch = open("yeet.txt", "r")
    
    contenido = arch.read()
    
    print(contenido)
abrirArchivo()