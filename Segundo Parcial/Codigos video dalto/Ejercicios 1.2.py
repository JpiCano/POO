class Estudiante:
    def __init__(self, nombre, edad, grado):
        self.nombre = nombre
        self.edad = edad
        self.grado = grado

    def estudiar(self):
        print("Estudiando...")

nombre = input("Escriba su nombre:")
edad = input("Escriba su edad: ")
grado = input("Escriba el grado que cursa: ")

estudiante = Estudiante(nombre, edad, grado) 

print(f"""
      DATOS DEL ESTUDIANTE: \n"
      Nombre: {estudiante.nombre}\n
      Edad: {estudiante.edad}\n 
      Grado: {estudiante.grado}"
      """)

estudiar = input()
if (estudiar.lower() == "estudiar"):
    estudiante.estudiar()
    