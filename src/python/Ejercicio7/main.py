'''
Escribe un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no.
'''

edad = int(input("Introduce tu edad: "))

if 17 > edad > 0:
    print("Eres menor de edad")
elif 17 < edad < 100:
    print("Eres mayor de edad")
else:
    print("Error, no has puesto una edad comprendida entre 0 y 100")
