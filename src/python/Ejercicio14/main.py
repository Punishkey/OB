'''
En este segundo ejercicio, tendréis que crear un programa que tenga una clase llamada Alumno que tenga como atributos su
nombre y su nota. Deberéis de definir los métodos para inicializar sus atributos, imprimirlos y mostrar un mensaje con el
resultado de la nota y si ha aprobado o no.
'''
from Ejercicio14.Alumno import Alumno

alumno1 = Alumno("Nuria", 9)

print(alumno1.getDatos() + alumno1.calcularNota())
