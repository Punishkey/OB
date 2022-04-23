from Ejercicio13.vehiculo import Vehiculo


class Coche(Vehiculo):
    velocidad = ""
    cilindrada = ""

    def __init__(self, color, ruedas, puertas, velocidad, cilindrada):
        super().__init__(color, ruedas, puertas)

        self.velocidad = velocidad
        self.cilindrada = cilindrada

    def getDatos(self):
        return super().getDatos() + " Tiene una velocidad de " + str(self.velocidad) + " y una cilindrada de " + str(
            self.cilindrada)
