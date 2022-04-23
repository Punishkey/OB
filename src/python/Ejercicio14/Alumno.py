class Alumno:
    nombre = ""
    nota = ""

    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota

    def getDatos(self):
        return "El alumno se llama " + self.nombre + " y tiene una nota de " + str(self.nota)

    def calcularNota(self):
        if self.nota < 5:
            return ", por tanto, suspenso, no has aprobado"
        else:
            return ", por tanto aprobado, eres un@ maquina"
