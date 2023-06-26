#función que recibe el presupuesto y la lista con los precios
def showSpending(a, b):
    print(f"Presupuesto: {a}")
    i = 0
    suma = 0
    j = len(b)
    #ciclo for que suma los gastos
    for i in range (j):
        suma = suma + b[i]
        i += 1
    if (suma < a):
        print(f"Estás {a - suma} por debajo del presupuesto, felicidades")
    else:
        print(f"Estás {suma - a} por encima del presupuesto, debes planear mejor el siguiente mes")

#función qe pide el presupuesto y los gastos
def enterNums():
    x = float(input("Introduzca el preupuesto del mes: "))
    y = True
    z = []
    while y:
        i = float(input("Introduzca una cantidad (0 para salir): "))
        if (i > 0):
            z.append(i)
        else:
            y = False
    showSpending(x , z)

enterNums()