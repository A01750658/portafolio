import sys
import random as r

print ("Bienvenido a la ruleta rusa xD")
name = input("ingrese su nombre: ")
color = input ("ingrese su color de piel: ")
muerto = "False"
count = 0

if (color.lower() in ["negro", "moreno", "nigga", "nigger", "amarillo", "asiatico", "indio", "rojo", "africano"]):
    print("Lo siento, para jugar ruleta rusa tienes que dar en el blanco, no puedes jugar")
    sys.exit()

if (name.lower() in ["Iker", "Xtreme", "Ikers Mind 87"]):
    print("La pistola explota en tu mano en el momento en el que aprietas el gatillo y mueres xD")
    sys.exit()
else:
    while (muerto == "False"): 
        num = int(input("ingrese un número del 1 al 6"))
        bullet =r.randint(1, 6)
        print(bullet)
        print(num)
        if (num == bullet):
            print("La pistola dispara y perfora tu cabeza, has muerto")
            print ("Has sobrevivido ", count, " veces")
            muerto = "True"
            sys.exit()
            
        else:
            print("Escuchas el martillo accionarse pero nada pasa, vuelve a jugar:")
            muerto = "False"
            count += 1
        
