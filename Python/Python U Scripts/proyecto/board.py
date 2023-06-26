import pygame
from .constants import BLACK,ROWS,COLS

class Board:
    def __init__(self):
        self.board = []
        self.selected_piece = None
        self.pos = 0
        self.questans = 0
        self.questleft = 20
    
    def draw_squares(self, win):
        win.fill(BLACK)
        for row in range (ROWS):
            for col in range (row, ROWS, 2):
                