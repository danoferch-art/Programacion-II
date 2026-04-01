import math
class MiPunto:
    def __init__(self, x=0, y=0):
        self.__x = x
        self.__y = y
    def get_x(self):
        return self.__x
    def get_y(self):
        return self.__y
    def distancia(self, otro_punto):
        return math.sqrt((self.__x - otro_punto.get_x())**2 + (self.__y - otro_punto.get_y())**2)
    def distancia_xy(self, x, y):
        return math.sqrt((self.__x - x)**2 + (self.__y - y)**2)
p1 = MiPunto()
p2 = MiPunto(10, 30.5)
dist = p1.distancia(p2)
print("Punto 1:", (p1.get_x(), p1.get_y()))
print("Punto 2:", (p2.get_x(), p2.get_y()))
print("Distancia entre los puntos:", dist)