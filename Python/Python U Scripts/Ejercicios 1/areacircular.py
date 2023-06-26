import math
from tkinter import *

window = Tk()
window.geometry("600x800")
window.configure(bg = "black")

order = Label(window, width = 25, height = 15, text = "Introduce el radio del círculo", bg = "black", fg = "blue", font = ("Times New Roman", 20))
order.place (x = 150, y = 100)
t1 = Entry()
t1.place(x = 200, y = 500)

def operacion():
    a = float(t1.get())
    a2 = math.pow(a, 2)
    b = math.pi
    return a2*b

def show():
    result = Label(window, width = 15, height = 10, text = "El área del círculo es: \n" + str(operacion()))
    result.place (x = 400, y = 600)

b1 = Button(window, width = 15, height = 10, text = "Generar Area", command = lambda m = "REEEEEEE": show())
b1. place (x = 100, y = 600)

window.mainloop()