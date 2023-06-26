from tkinter import *

window = Tk()
window.geometry("600x800")
window.configure(bg = "black")

order = Label(window, width = 25, height = 15, text = "Introduce la cantidad en dólares \n (sin signo)", bg = "black", fg = "blue", font = ("Times New Roman", 20))
order.place (x = 150, y = 100)
t1 = Entry()
t1.place(x = 200, y = 500)

def operacion():
    a = float(t1.get())
    b = a*13.73
    return b

def show():
    result = Label(window, width = 18, height = 10, text = "El valor en pesos es: \n" + str(operacion()))
    result.place (x = 400, y = 600)

b1 = Button(window, width = 18, height = 10, text = "Generar valor en pesos", command = lambda m = "REEEEEEE": show())
b1. place (x = 100, y = 600)

window.mainloop()