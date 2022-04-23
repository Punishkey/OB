'''
Escribe una función que pueda decirte si un año (número entero) es bisiesto o no.
'''


def bisiesto(anio):
    if anio % 4 == 0 and (anio % 100 != 0 or anio % 400 == 0):
        return "Es bisiesto"
    else:
        return "No es bisiesto"


anio =print(bisiesto(int(input("Introduce un año: "))))