import matematicas
import espanol
import ciencias

'''
\n Función main, tiene una variable llamada x que recibe la elección de materia del jugador, después mediante un if
el código determina que función usar, cada función tiene un examen
'''

def main():
    x = input("Introduce qué modalidad quieres (favor de no usar acentos): ")
    if (x.lower() == "matematicas"):
        matematicas.matematicas()
        print(matematicas.___doc___)
    elif (x.lower() == "español"):
        espanol.espanol()
        print(espanol.___doc___)
    elif (x.lower() == "ciencias"):
        ciencias.ciencias()
        print(ciencias.___doc___)
    else:
        print("Materia no válida!!!")


main()
print(main.___doc___)