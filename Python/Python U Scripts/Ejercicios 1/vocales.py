def pide_nombre():
    name = input("Dime tu nombre: ")
    
    for i in range (len(name)):
        print(f"name[{i}] = {name[i]}")
    busca_vocal(name)

def busca_vocal(name):
    count = 0
    for i in range (len(name)):
        if name[i].lower() == "a" or name[i].lower() == "e" or name[i].lower() == "i" or name[i].lower() == "o" or name[i].lower() == "u":
            count += 1
            i += 1
        else:
            i += 1
    print(f"Tu nombre tiene {count} vocales")

pide_nombre()