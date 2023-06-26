def pideNumero():
    x = int(input("Ingresa un número entre 1 y 10: "))
    return x

def escribeRomano():
    y = pideNumero()

    if y == 1:
        print ("El número en romano es I")
    elif y == 2:
        print ("El número en romano es II")
    elif y == 3:
        print ("El número en romano es III")
    elif y == 4:
        print ("El número en romano es IV")
    elif y == 5:
        print ("El número en romano es V")
    elif y == 6:
        print ("El número en romano es VI")
    elif y == 7:
        print ("El número en romano es VII")
    elif y == 8:
        print ("El número en romano es VIII")
    elif y == 9:
        print ("El número en romano es IX")
    elif y == 10:
        print ("El número en romano es X")
    else:
        print("Ingrese un número válido")

escribeRomano()



