def llena_mat():
    reng = int(input("Renglones: "))
    columnas = int(input("Columnas: "))
    
    matriz = []
    
    for ren in range (reng):
        lista = []
        for col in range (columnas):
            dato = int(input(f"Dame num {col}: "))
            lista.append(dato)
        
        matriz.append(lista)
        print(matriz)
    return matriz

def imprime_mat():
    mat = llena_mat()
    
    print("Así se llega: ", mat)
    for z in range (len(mat)):
        print(mat[z])

imprime_mat()