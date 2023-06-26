#función que pide los números
def pideNums():
    #lista en la que se guardan los números
    x = []
    #ciclo para llenar la lista
    i = 0
    while i <= 6:
        x.append(int(input(f"Introduce la calificación {i+1}: ")))
        i+=1
    return x
#función que determina si la calificación es mayor o menor a 70
def ops():
    cal = pideNums()
    i = 0
    x = 0
    y = 0
    #ciclo que recorre la lista
    while i <= 6:
        if cal[i] >= 70 and cal[i] <= 100:
            x+=1
            i+=1
        elif cal[i] <= 70 and cal[i] >= 0:
            y+=1
            i+=1
        else:
            print("Las calificaciones ingresadas no son validas")
    print(f"El número de calificaciones aprobatorias es: {x}")
    print(f"El número de calificaciones reprobatorias es: {y}")

ops()