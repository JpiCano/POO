def decorador(funcion):
    def funcion_modificada():
        print ("Antes de llamar a la funcion")
        funcion()
    return funcion_modificada

#def saludo():
#      print("Hola dalto como andas")

#saludo_modificado = decorador (saludo)
#saludo_modificado()

@decorador
def saludo():
    print("Hola dalto como andas")

saludo()