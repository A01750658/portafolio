def masa():
    m = float(input("Ingresa el valor de la masa: "))
    return m

def peso():
    m = masa()
    p = 9.81*m
    if (m >= 0 and m <= 2000):
        if (p >= 0  and p <= 1000):
            print(f"el peso es {p} por lo tanto es ligero")
        else:
            print(f"el peso es {p} por lo tanto es pesado")
    else:
        print ("Dato inválido")
peso()