
defvalidaCal():
    float(input("Introduce calificación 1: ")), float(input("Introduce calificación 2: ")), float(input("Introduce calificación 3: "))

def generaProm():
    cals = []
    prom=0
    for i in range(3):
        prom += cals[i]
    return prom/len(cals)
        
        
def imprimeProm():
    prom = generaProm()
    if prom>0 and prom<100:
        if prom>=60:
            print(f"Aprobado  con un promedio de: {prom}")
        else:
            print(f"REEEEEE REEEEEEE nigga con un promedio de: {prom}")
    else:
        print("Introduzca un valor válido")
imprimeProm()
