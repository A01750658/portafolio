def pideColores():
    x = [(input("Ingresa el primer color primario: ")), (input("Ingresa el segundo color primario: "))]
    return x

def mezclaColores():
    x = pideColores()
    if x[0] == "rojo" and x[1] == "amarillo":
        print ("La mezcla del color es naranja")
    elif x[0] == "rojo" and x[1] == "azul" :
        print ("La mezcla del color es morado")
    elif x[0] == "azul" and x[1] == "amarillo" :
        print ("La mezcla del color es verde")
    else:
        print("No son colores primarios")
mezclaColores()