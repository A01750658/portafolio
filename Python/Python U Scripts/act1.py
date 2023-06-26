import sys

#declarar precio y nombre
precioKilo = float(int(input("Ingrese el precio por kilo de naranjas xD ")))
name = input("Ingrese su nombre ")
#kickear a todos los Ikers xD
if(name in ["Iker", "Xtreme", "Ikers Mind 87"]):
    print("Pinche mamón ya deja de usar Anaconda, \nves a la profa ahí tranquilita con un etorno simple y tú sales con tus chingaderas \nfuera de mi programa xD ")
    sys.exit()
#hacer el proceso de las naranjas para todos los que no sean Iker
else:
    pesoBolsa = float(input("Ingrese el peso en kilos de la bolsa "))
    precio = float(pesoBolsa * precioKilo)
    print ("Felicidades", name, "vas a pagar: ", precio)
    