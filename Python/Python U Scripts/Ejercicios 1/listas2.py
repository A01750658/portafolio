def imprimeList(x):
    print("La lista al revés es: ")
    for i in range(len(x)-1, -1, -1):
        print(x[i])

def llenaList(a):
    i = 0
    j = []
    for i in range (a):
        j.append(int(input(f"Dame el número {i+1}: ")))
        i+=1
    imprimeList(j)

def pideLen():
    x = int(input("Cuántos números quieres que tenga la lista?: "))
    llenaList(x)

pideLen()