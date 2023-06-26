def pideNums():
    #lista en la que se guardan los números
    x = []
    #ciclo para llenar la lista
    i = 0
    while i < 20:
        x.append(int(input(f"Introduce el número {i+1}: ")))
        i+=1
    return x

def ops():
    cal = pideNums()
    i = 0
    x = 0
    y = 0
    z = 0
    #ciclo que recorre la lista
    while i < 20:
        if cal[i] > 0:
            x+=1
            i+=1
        elif cal[i] < 0:
            y+=1
            i+=1
        else:
            z+=1
            i+=1
    print(f"El número de números negativos es: {x}")
    print(f"El número de números positivos es: {y}")
    print(f"El número de números neutros es: {z}")

ops()