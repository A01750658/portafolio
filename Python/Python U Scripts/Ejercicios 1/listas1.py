def buscaList(z):
    b = int(input("Introduzca el valor que desea buscar: "))
    i = 0
    c = 0
    y = len(z)
    for i in range (len(z)):
        if (z[i] == b):
            c+=1
            i+=1
        else:
            i+=1
    print(f"El número de veces que el numero está en la lista es: {c}")

def llenaList(a):
    i = 0
    j = []
    for i in range (a):
        j.append(int(input(f"Dame el número {i+1}: ")))
        i+=1
    buscaList(j)

def pideLen():
    x = int(input("Cuántos números quieres que tenga la lista?: "))
    llenaList(x)

pideLen()