from tkinter import *
import sys
import random as r
bullet = 0
def reload():
    global bullet 
    bullet = r.randint(0,5)
def spin():
    if bullet == r.randint(0,5):
        sys.exit()

window = Tk()
window.geometry("600x600")
window.configure(bg="black")
B1 = Button(window,width=20,height=3,text="Load",command = lambda m="F":reload())
B2 = Button(window,width=20,height=3,text="SPIN AND SHOOT",bg="red",command = lambda m="F":spin())
B1.place(x=0,y=250)
B2.place(x=200,y=250)
window.mainloop()
