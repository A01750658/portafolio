import math

x1 = (int(input("Introduzca x1: ")))
x2 = (int(input("Introduzca x2: ")))
y1 = (int(input("Introduzca y1: ")))
y2 = (int(input("Introduzca y2: ")))

x = x2-x1
y = y2-y1

dist = math.sqrt(math.pow(x,2)+math.pow(y,2))

print("La distancia entre los dos puntos es: " + str(dist))