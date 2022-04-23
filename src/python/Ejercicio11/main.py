'''
Escribe una función que pueda decirte si un número (número entero) es primo o no.
'''


def primo(num):
    for n in range(2, num):
        if num % n == 0:
            print("es primo")
            return True
    print("no es primo")
    return False


num = int(input("Introduce un numero entero: "))
result = primo(num)
