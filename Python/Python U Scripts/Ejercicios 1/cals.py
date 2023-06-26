
def calsMin():
    x = 3.9
    print("Minutos\t Calorías Quemadas \n")
    print("--------------------------------")
    return x

def printCals():
    y = calsMin()
    i = 10
    for i in range (10, 30, 5):
        print(f"{i}\t{i*y}")

printCals()