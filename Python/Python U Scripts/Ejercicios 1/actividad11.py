def pares():
    #límite inferior
    a = int(input("Introduce el valor de a: "))
    #límite superior
    b = int(input("Introduce el valor de b: "))
    #contador e iniciador
    i = a
    while (i>=a and i <= b):
        if i%2 == 0:
            print(i)
            i+=1
        else:
            i+=1
            
pares()