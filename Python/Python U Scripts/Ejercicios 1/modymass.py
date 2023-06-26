import math
def modyMass():
    m = float(input ("Introduce tu masa: "))
    h = float(input("Introduce tu altura: "))
    h2 = math.pow(h, 2)
    b = h / h2
    print (f"Tu BMI es: {b}" )
    
modyMass()