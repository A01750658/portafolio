def pedirParrafo():
    parrafo= input("Introduce el párrafo: ")
    
    lista_parrafo = list(parrafo)
    
    pedirLetra(lista_parrafo)

def pedirLetra(letras):
    letra = input("Dame la letra a cambiar: ")
    
    for i in range(len(letras)):
        if letras[i] == letra:
            letras[i] = "*"
    
    print(letras)

    guiones(letras)

def guiones(nums):
    for z in range (len(nums)):
        if nums[z] == "0" or nums[z] == "1" or nums[z] == "2" or nums[z] == "3" \
        or nums[z] == "4" or nums[z] == "5" or nums[z] == "6" or nums[z] == "7" \
        or nums[z] == "8" or nums[z] == "9":
            nums[z] = "-"
    print(nums)
    cadena(nums)

def cadena(newCadena):
    cades = "".join(newCadena)
    
    print(cades.swapcase)

pedirParrafo()