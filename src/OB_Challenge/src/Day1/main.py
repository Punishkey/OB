"""
El reto de hoy consiste en lo siguiente:
- Lenguaje: Python
- IDE recomendado: PyCharm
- Nivel: Inicial
- Enunciado: Dado un fichero excel con nombres y correos (columna nombre y columna email), realiza un script en Python que devuelva los mails únicos de la columna email.
- Consideraciones: Utiliza la librería pandas para procesar el fichero Excel (.xls).
"""

# import module

import pandas as pd

# directory file

file = 'correos.xlsx'

# read a excel document

document = pd.read_excel(file, usecols=['mail'])

print(document['mail'].unique)