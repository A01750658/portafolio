import math

x = (int(input("Introduzca x1: ")), int(input("Introduzca x2: ")))
y = (int(input("Introduzca y1: ")), int(input("Introduzca y2: ")))



dist = math.dist(x, y)

print("La distancia entre los dos puntos es: " + str(dist))