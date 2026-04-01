import math
class Vector3D:
    def __init__(self, x=0, y=0, z=0):
        self.x = x
        self.y = y
        self.z = z
    # a)
    def __add__(self, other):
        return Vector3D(self.x + other.x,
                        self.y + other.y,
                        self.z + other.z)
    # b)
    def __mul__(self, scalar):
        return Vector3D(self.x * scalar,
                        self.y * scalar,
                        self.z * scalar)
    # Permite r * a
    def __rmul__(self, scalar):
        return self.__mul__(scalar)
    # c)
    def magnitud(self):
        return math.sqrt(self.x**2 + self.y**2 + self.z**2)
    # d)
    def normal(self):
        mag = self.magnitud()
        if mag == 0:
            raise ValueError("No se puede normalizar un vector cero")
        return Vector3D(self.x/mag, self.y/mag, self.z/mag)
    # e)
    def producto_punto(self, v):
        return self.x*v.x + self.y*v.y + self.z*v.z
    # f)
    def producto_cruz(self, v):
        return Vector3D(
            self.y*v.z - self.z*v.y,
            self.z*v.x - self.x*v.z,
            self.x*v.y - self.y*v.x
        )
    def __str__(self):
        return f"({self.x}, {self.y}, {self.z})"

a = Vector3D(1, 2, 3)
b = Vector3D(4, 5, 6)
print("Vector a:", a)
print("Vector b:", b)
# Suma
print("a + b =", a + b)
# Escalar
print("2a =", 2 * a)
# Magnitud
print("|a| =", a.magnitud())
# Normal
print("Normal de a =", a.normal())
# Producto punto
print("a · b =", a.producto_punto(b))
# Producto cruz
print("a × b =", a.producto_cruz(b))