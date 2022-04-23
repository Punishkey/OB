'''
Para este ejercicio tenéis que crear en la consola de python variables que representen los siguientes datos de un contacto:

Nombre

Apellidos

Edad

Email

Teléfono

Casado (verdadero o falso)

Con Hijos (verdadero o falso)

Lista de amigos

Películas vistas (diccionario con clave y valor. El valor será el título de la película)

Una vez hayas creado todas las variables, muéstralas por consola haciendo uso de la función print().
'''

nombre = input("Introduce el nombre del contacto: ")

apellidos = input("Introduce los apellidos del contacto: ")

edad = input("Introduce la edad del contacto: ")

mail = input("Introduce el mail del contacto: ")

telefono = input("Introduce el telefono del contacto: ")

casado = input("introduce SI, si está casado o NO, si no lo está")

while True:
    if casado == "si":
        casado = True
        break
    elif casado == "no":
        casado = False
        break
    else:
        casado = input("Error, introduce SI, si está casado o NO, si no lo está")

hijos = input("Introduce SI, si tiene hijos, o NO, si no los tiene: ")

while True:
    if hijos == "si":
        hijos = True
        break
    elif hijos == "no":
        hijos = False
        break
    else:
        hijos = input("Error, introduce SI, si tiene hijos, o NO, si no los tiene: ")

listaAmigos = []

valores = input("Ingrese el nombre de un amigo, si no quiere incluir mas, escriba salir: ")

while valores != "salir":
    listaAmigos.append(valores)
    valores = input("Ingrese el nombre de un amigo, si no quiere incluir mas, escriba salir: ")

listaPeliculas = {}
peliculas = input("Ingrese el nombre de la pelicula, si no quiere incluir mas, escriba salir: ")

clave = 1
while peliculas != "salir":
    listaPeliculas.setdefault(clave, peliculas)
    clave += 1
    peliculas = input("Ingrese el nombre de la pelicula, si no quiere incluir mas, escriba salir: ")

print("El nombre del contacto es: " + nombre)
print("Los apellidos del contacto son: " + apellidos)
print("La edad del contacto es: " + edad)
print("El mail del contacto es: " + mail)
print("El telefono del contacto es: " + telefono)
print("Está casado?: " + str(casado))
print("Tiene hijos?: " + str(hijos))
for element in listaAmigos:
    print(element)
for clave, valor in listaPeliculas.items():
    print(clave, valor)
