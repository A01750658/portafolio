import random, os

def limpia():
    '''Función que limpia a pantalla sin importar el sistema operativo
      de la máquina donde esté corriendo'''
    if os.name == 'nt': #Windows
        os.system('cls') 
    else:  #'posix'
        os.system('clear') #Mac/linux

def llena_tablero():
  '''Llena el tablero con las "cartas volteadas"'''
  matriz=[]
  for r in range(5):
      renglon=[]
      for c in range(5):
          # Agrega un emoji de flor en con el código unicode
          renglon.append('\U0001F4AE')
      matriz.append(renglon)
  return matriz

def despliega_tablero(tablero):
  '''Despliega a pantalla la matriz que recibe en forma de tabla
  desplegando una cuadricula'''
  print("--------"*len(tablero))
  for renglon in tablero:
    print("|", end="")
    for elemento in renglon:
        # Centra el elemento en un espacio de 5
        print(f'{elemento}'.center(5), end="")
        print("|", end="")
    print('\n'+"--------"*len(renglon))

def llena_escondida():
  '''Llena una matriz de números 0 y 1s, 0 representa un hoyo
   y esta matriz es el valor de las cartas al derecho'''
  matriz=[]
  for r in range(5):
      renglon=[]
      for c in range(5):
          # Agrega un 0 a 1 de manera aleatoria
          renglon.append(random.randint(0,1))
      matriz.append(renglon)
  return matriz

def verifica_cambia(r,c, tablero, escondida):
  #Verifico si r y c son valores válidos entre 1 y 5
  if 1<=r<=5:
    if 1<=c<=5:
      # Si son válidos les resto 1, el usuario dará posiciones desde 1.
      r-=1
      c-=1
      #Cambio el dato de la carta destapada en el tablero
      # Si en la matriz escondida tengo un 0 es un hoyo
      if escondida[r][c]==0:
        print('C A I S T E  en un agujero!!!')
        # Esa posición del tablero la cambio por una calaquita
        tablero[r][c] = '\U0001F480'
        # devuelvo 1 porque caí en un agujero
        return 1
      else:
        print('M U Y   B I E N!!')
        # Si no es hoyo, en esa posición del tablero le pongo una estrella
        tablero[r][c] = '\U00002B50'
        return 0
    else:
      print('Columna inválida')
      return 0
  else:
    print('Renglón inválido')
    return 0
    

def main():
  # Llamamos a las funciones que llenan las matrices
  tablero = llena_tablero()
  escondidas =llena_escondida()
  #iniciamos el número de caidas y de oportunidades
  caidas = 0
  oportunidades = 0
  while caidas<3 and oportunidades < 7:
    limpia()
    despliega_tablero(tablero)
    print('Escribe la posición del que quieres destapar')
    renglon=int(input('Renglón: '))
    columna=int(input('Columna: '))
    # Acumulo en caidas el resultado de verifica
    caidas+=verifica_cambia(renglon,columna, tablero, escondidas)
    oportunidades+=1;
    input('Enter para continuar')
  # Se acaba el ciclo verifico el resultado
  limpia()
  if caidas == 3:
    print("\n\nPERDISTE TUS 3 VIDAS!!")
  else:
    print('\n\n\nGANASTE pudiste completar tu turno sin perder!!! FELICIDADES!!')
  despliega_tablero(tablero)

main()