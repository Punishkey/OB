'''
En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:

Color

Ruedas

Puertas

Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:

Velocidad

Cilindrada

Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.
'''
from Ejercicio13.coche import Coche

coche1 = Coche("rojo", 4, 4, 120, 4000)

print(str("El coche " + coche1.getDatos()))



