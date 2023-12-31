import pygame 
import sys

clock = pygame.time.Clock()
#yeet
from pygame.locals import *
pygame.init()

pygame.display.set_caption('Magic is Heresy')

WINDOW_SIZE = (1280, 720)
screen = pygame.display.set_mode(WINDOW_SIZE, 0, 32)

display = pygame.Surface((300, 200))

player_image = pygame.image.load('sprites/player.png').convert()
player_image.set_colorkey((0, 0, 0))
grass_image = pygame.image.load('sprites/grass.png').convert()
TILE_SIZE = grass_image.get_width()
pick_image = pygame.image.load('sprites/pick.png').convert()
pick_image.set_colorkey((0, 0, 0))
dirt_image = pygame.image.load('sprites/dirt.png').convert()
dirt_image.set_colorkey(0, 0, 0)

background_object = [[0.25, [120, 10, 70, 400]], [0.25, [280, 30, 40, 400]], [0.5, [30, 40, 40, 400]], [0.5, [130, 90, 100, 400]], [0.5, [300, 80, 120, 400]]]

def collision_test(rect, tiles):
    hit_list = []
    for tile in tiles:
        if rect.colliderect(tile):
            hit_list.append(tile)
    return hit_list

def move(rect, movement, tiles):
    collision_types = {'top': False, 'bottom': False, 'right': False, 'left': False}
    rect.x += movement[0]
    hit_list = collision_test(rect, tiles)
    for tile in hit_list:
        if movement[0] > 0:
            rect.right = tile.left
            collision_types['right'] = True
        elif movement[0] < 0:
            rect.left = tile.right
            collision_types['left'] =True
    rect.y += movement[1]
    hit_list = collision_test(rect, tiles)
    for tile in hit_list:
        if movement[1] > 0:
            rect.bottom = tile.top
            collision_types['bottom'] = True
        elif movement[1] < 0:
            rect.top = tile.bottom
            collision_types['top'] = True
    return rect, collision_types

moving_right = False
moving_left = False
moving_up = False
moving_down = False
player_y_momentum = 0
air_timer = 0

true_scroll = [0, 0]

def load_map (path):
    f = open(path + '.txt', 'r')
    data = f.read()
    f.close()
    data = data.split('\n')
    game_map = []
    for row in data:
        game_map.append(list(row))
    return game_map

game_map = load_map('map')

player_rect = pygame.Rect(50, 50, player_image.get_width(), player_image.get_height())
while True:
    display.fill((150, 150, 250))
    
    true_scroll[0] += (player_rect.x -true_scroll[0] - 152)
    true_scroll[1] += (player_rect.y - true_scroll[1] -106)/10 
    scroll = true_scroll.copy()
    scroll[0] = int(scroll[0])
    scroll[1] = int(scroll[1])
    tile_rects = []
    y = 0
    for row in game_map:
        x = 0
        for tile in row:
            if tile == '1':
                display.blit(dirt_image, (x * TILE_SIZE - scroll[0], y * TILE_SIZE - scroll[1]))
            if tile == '2':
                display.blit(grass_image, (x * TILE_SIZE - scroll[0], y * TILE_SIZE - scroll[1]))
            if tile == '3':
                display.blit(pick_image, (x * TILE_SIZE - scroll[0], y * TILE_SIZE - scroll[1]))
            if tile != '0':
                tile_rects.append(pygame.Rect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE))
            x += 1
        y += 1
    
    player_movement = [0, 0]
    if moving_right:
        player_movement[0] += 2
    if moving_left:
        player_movement[0] -= 2
    if moving_up:
        player_movement[0,1] += 2
    if moving_down:
        player_movement[0,1] = 2
    
    player_rect, collisions = move(player_rect, player_movement, tile_rects)
    if collisions ['bottom']:
        player_y_momentum = 1
        air_timer = 0
    else:
        air_timer += 1

    display.blit(player_image, (player_rect.x - scroll[0], player_rect.y - scroll[1]))

    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            sys.exit()
        if event.type == KEYDOWN:
            if event.key == K_RIGHT:
                moving_right = True
            if event.key == K_LEFT:
                moving_left = True
            if event.key == K_UP:
                if air_timer < 6:    
                    player_y_momentum = -5
        if event.type == KEYUP:
            if event.key == K_RIGHT:
                moving_right = False
            if event.key == K_LEFT:
                moving_left = False
    
    surf = pygame.transform.scale(display, WINDOW_SIZE)
    screen.blit(surf, (0, 0))
    pygame.display.update()
    clock.tick(60)
