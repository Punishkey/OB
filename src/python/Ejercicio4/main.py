'''
Modifica la variable del anterior ejercicio en la consola de python y después muestrala
por consola para ver la modificación de la variable.
'''


from Ejercicio3.main import variable

print(variable)

variableModificada = input("Modifica la variable")

print("La variable " + str(variable) + " ha sido cambiado su valor a " + str(variableModificada))