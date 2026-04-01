import math
class AlgebraVectorial:    
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
    def get_vector(self):
        return (self.x, self.y)
    def producto_punto(self, v):
        return self.x * v.x + self.y * v.y
    def producto_cruz(self, v):
        return self.x * v.y - self.y * v.x
    def magnitud(self):
        return math.sqrt(self.x**2 + self.y**2)
    def es_perpendicular(self, v):
        return self.producto_punto(v) == 0
    def es_paralelo(self, v):
        return self.producto_cruz(v) == 0
    def proyeccion(self, v):
        escalar = self.producto_punto(v) / (v.magnitud()**2)
        return AlgebraVectorial(escalar * v.x, escalar * v.y)
    def componente(self, v):
        return self.producto_punto(v) / v.magnitud()
    
a = AlgebraVectorial(3, 4)
b = AlgebraVectorial(4, -3)
print("Vector a:", a.get_vector())
print("Vector b:", b.get_vector())
print("¿Perpendiculares?:", a.es_perpendicular(b))
print("¿Paralelos?:", a.es_paralelo(b))
proj = a.proyeccion(b)
print("Proyección de a sobre b:", proj.get_vector())
comp = a.componente(b)
print("Componente de a en b:", comp)