import random 
from tkinter import *
time_to_die = 0
state = True

def death():
    endscreen = Tk()
    endscreen.geometry("300x300")
    endscreen.configure(bg="black")
    death_message = Label(endscreen,width=10,height=10,text="Has muerto",bg="black",fg="red",font=("TimesNewRoman",20))
    death_message.place(x=80,y=0)
    endscreen.mainloop()

def choice_1():
    if random.randint(1,6)==1:
        death()
def choice_2():
    if random.randint(1,6)==2:
        death()
def choice_3():
    if random.randint(1,6)==3:
        death()
def choice_4():
    if random.randint(1,6)==4:
        death()
def choice_5():
    if random.randint(1,6)==5:
        death()
def choice_6():
    if random.randint(1,6)==6:
        death()

window = Tk()
window.geometry("500x500")
window.configure(bg="black")
label_1 = Label(window, width=60,height=3,text="LA RULETA RUSA")
label_1.place(x=22,y=0)
button_1 = Button(window,width=20,height=5,text="Caja 1", command = lambda m="F":choice_1())
button_1.place(x=0,y=200)
button_2 = Button(window,width=20,height=5,text="Caja 2", command = lambda m="F":choice_2())
button_2.place(x=170,y=200)
button_3 = Button(window,width=20,height=5,text="Caja 3", command = lambda m="F":choice_3())
button_3.place(x=340,y=200)
button_4 = Button(window,width=20,height=5,text="Caja 4", command = lambda m="F":choice_4())
button_4.place(x=0,y=400)
button_5 = Button(window,width=20,height=5,text="Caja 5", command = lambda m="F":choice_5())
button_5.place(x=170,y=400)
button_6 = Button(window,width=20,height=5,text="Caja 6", command = lambda m="F":choice_6())
button_6.place(x=340,y=400)
window.mainloop()