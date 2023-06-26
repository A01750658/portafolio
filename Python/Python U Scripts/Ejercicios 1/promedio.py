def pidePromedio():
    x = float(input("Introduce el promedio del alumno: "))
    return x

def calificacion():
    cal = pidePromedio()
    if cal >= 90:
        print("Tu calificación es A")
    elif cal <= 90 and cal >= 80:
        print ("Tu calificación es B")
    elif cal <= 80 and cal >= 70:
        print ("Tu calificación es C")
    elif cal <= 70 and cal >= 60:
        print ("Tu calificación es D")
    else:
        print ("Tu calificación es F")

calificacion()