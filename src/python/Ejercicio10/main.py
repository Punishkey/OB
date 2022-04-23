'''
Escribe una función que calcule el área de un triángulo, recibiendo la altura y la base como parámetros
y otra función que calcule el área de un círculo recibiendo el radio del mismo.
'''
import math


def areaTriangulo():
    return float(base) * float(altura) / 2.0


def areaCirculo():
    return float(math.pi * math.pow(radio, 2))


altura = input("Introduce la altura")
base = input("Introduce la base")
radio = float(input("Introduce el radio"))

areaTriangulo = areaTriangulo()

print(areaTriangulo)

areaCirculo = areaCirculo()

print(areaCirculo)
