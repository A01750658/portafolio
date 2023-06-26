#función que imprime las tablas
def tablas(x):
    #if con el número de tabla
    if x == 1:
        i = 1
        #ciclo que imprime la tabla
        while i <= 10:
            print(f"{x} * {i} = {x*i}")
            i+=1
    elif x == 2:
        i = 1
        while i <= 10:
            print(f"{x} * {i} = {x*i}")
            i+=1
    elif x == 3:
        i = 1
        while i <= 10:
            print(f"{x} * {i} = {x*i}")
            i+=1
    elif x == 4:
        i = 1
        while i <= 10:
            print(f"{x} * {i} = {x*i}")
            i+=1
    elif x == 5:
        i = 1
        while i <= 10:
            print(f"{x} * {i} = {x*i}")
            i+=1
    elif x == 6:
        i = 1
        while i <= 10:
            print(f"{x} * {i} = {x*i}")
            i+=1
    elif x == 7:
        i = 1
        while i <= 10:
            print(f"{x} * {i} = {x*i}")
            i+=1
    elif x == 8:
        i = 1
        while i <= 10:
            print(f"{x} * {i} = {x*i}")
            i+=1
    elif x == 9:
        i = 1
        while i <= 10:
            print(f"{x} * {i} = {x*i}")
            i+=1
    elif x == 10:
        i = 1
        while i <= 10:
            print(f"{x} * {i} = {x*i}")
            i+=1
#función que pide el número de tabla
def pideNum():
    a = int(input("Introduce la tabla que deseas ver: "))
    tablas(a)

pideNum()