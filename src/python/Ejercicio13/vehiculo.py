class Vehiculo:

    color = ""
    ruedas = ""
    puertas = ""

    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas

    def getDatos(self):
        return "Tiene un color " + self.color + ", con " + str(self.puertas) + " puertas y " + str(self.ruedas) + " ruedas"