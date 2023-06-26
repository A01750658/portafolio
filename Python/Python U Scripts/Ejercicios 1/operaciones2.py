#Programa con funciones
#Librerias
import math

#Función que pide el radio al usuario e imprime el resultado del área del
#círculo
def area_circulo():
    rad = int(input("Dame el radio: "))
    area_cir = math.pi * math.pow(rad, 2)
    print(f"Su resultado es: {round(area_cir, 2)}\n")

#Función que recibe la altura y base de un triángulo e imprime el resultado
#del área del triángulo
def area_tria(alt, base):
    area_trian = base * alt / 2
    print(f"El área del triangulo es: {area_trian}")   

#Función que pide el lado del cuadrado y regresa el resultado del área del
#cuadrado
def area_cuad():
    lado = int(input("Dame el lado del cuadrado: "))
    area_cuadra = math.pow(lado, 2)
    
    return area_cuadra

#Función que despliega el menú

def menu():
    mensaje = '''Bienvenido al programa que raliza las diferentes áreas de
figuras geométricas
''' 
    print (mensaje)
    print("1) Área del triángulo")
    print("2) Área del círculo")
    print("3) Área del cuadrado")
    opc = int(input("¿Qué área deseas calcular?\n"))
    
    while opc == "triángulo" or "círculo" or "cuadrado":
        operaciones(opc)
        opc = input("¿Desea calcular otra área? ")
    
#Función que realiza las operaciones
def operaciones(opcion):
    if (opcion == 1 or opcion == 2 or opcion == 3):
        if  opcion == 1:
            alt_tria = int(input("Dame la altura del triángulo: "))
            bas_tria = int(input("Dame la base del triángulo: "))
            area_tria(alt_tria, bas_tria)
        
        elif opcion == 2:
            area_circulo()
            
        else:
            area = area_cuad()
            print("El área del cuadrado es ", area)
    
    else:
        print("Opción invalida")
    

#Llamando a las funciones
menu()