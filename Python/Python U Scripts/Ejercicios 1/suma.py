
from tkinter import *


window = Tk()
window.geometry("600x800")
window.configure(bg = "black")
order = Label(window, width = 25, height = 15, text = "Introduce tus valores", bg = "black", fg = "blue", font = ("Times New Roman", 20))
order.place(x = 150, y = 100)
t1 = Entry()
t1.place(x = 200, y = 500)
t2 = Entry()
t2.place (x = 200, y = 550)


def operacion():
    a = int(t1.get())
    b = int(t2.get())
    return a+b

def show():
    result = Label(window, width = 18, height = 10, text = "El resultado\n de tu suma es: \n" + str(operacion()))
    result.place(x = 400, y = 600)


b1 = Button(window, width = 18, height = 10, text = "Sumar", command = lambda m ="REEEE": show())
b1.place (x = 100, y = 600)


window.mainloop()
