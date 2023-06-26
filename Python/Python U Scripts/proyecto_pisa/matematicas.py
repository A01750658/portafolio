import random
import time

'''
\nFunción que contiene el examen de matemáticas
'''

def matematicas():

'''
\nEn esta sección se lee el archivo de preguntas y se adjuntan en una lista
'''
    p = open ("matepreg.txt")
    data1 = p.read()
    p.close()
    data1 = data1.split('\n')
    preguntasread = []
    tablero = []
    for row in data1:
        preguntasread.append(row)

'''
\nEn esta scción se llena el tablero de signos de interrogación
'''

    tablero = []
    
    for i in range (5):
        renglon = []
        for j in range (5):
            renglon.append(str('?'))
            
        tablero.append(renglon)
        
            
'''
En esta sección se lee el archivo de respuestas y se adjuntan en una lista
'''
    
    r = open("materes.txt")
    data2 = r.read()
    r.close()
    data2 = data2.split('\n')
    respuestasread = []
    for row in data2:
        respuestasread.append(row)
'''
\n En esta sección se crean dos matrices, una con las preguntas y otra con las respuestas con el fin de poder sincronizarlas
entre ellas para determinar si la respuesta es correcta o incorrecta y con el tablero para poder actualizar el tablero
'''
    
    preguntasefect = []
    respuestasefect = []
 
    i = 0
    
    while i <= 5:
        respuestasrenglon = []
        preguntasrenglon = []
        for j in range (5):
            x = random.randint(0, len(preguntasread))
            preguntasrenglon.append(preguntasread[x-1])
            respuestasrenglon.append(respuestasread[x-1])
        preguntasefect.append(preguntasrenglon)
        respuestasefect.append(respuestasrenglon)
        i += 1
    
    #prueba = True
    
'''
\n En esta sección se encuentra el ciclo de juego en si, aquí el programa imprime en pantalla las preguntas y el jugador
introduce por teclado una respuesta, después, mediante 2 ciclos for se imprime y actualiza el tablero con la respuesta correcta
también aquí se utiliza la función time para guardar el tiempo de inicio en una variable
'''
    
    x = 0

    count = 0
    start = time.time()
    while x <= 5:
        for i in range(5):
            mostrartab=[]
            for j in range(5):
                mostrartab.append(tablero[i][j])
            print(mostrartab, "\n")
        for a in range(5):
            for b in range(5):
                print(preguntasefect[a][b])

                res = input("Introduce la opcion de respuesta: ")
                if (res.lower() == respuestasefect[a][b]):
                    count += 1
                    print(f"Respuesta correcta {count}/25")
                    x += 1
                    tablero[a][b] = respuestasefect[a][b]
                    for i in range(5):
                        mostrartab=[]
                        for j in range(5):
                            mostrartab.append(tablero[i][j])
                        print(mostrartab, "\n")
                else:
                    print(f"Respuesta incorrecta {count}/25")
                    x += 1
                    tablero[a][b] = respuestasefect[a][b]
                    for i in range(5):
                        mostrartab=[]
                        for j in range(5):
                            mostrartab.append(tablero[i][j])
                        print(mostrartab, "\n")
'''
\n En esta sección se imprimen los resultados del examen, también se crea una segunda variable con el tiempo para poder restarle la
primera variable y poder dar el tiempo que ha tomado el alumno en hacer su examen, el tiempo se muestra con toda la exactitud posible
para que los alumnos compitan con sus tiempos
'''


    end = time.time()
    print (f"Tu puntaje final ha sido {count}/25")
    print (f"Tu tiempo ha sido {end-start}, intenta mejorarlo")
        
    
    

    

##matematicas()