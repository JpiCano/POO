import tkinter as tk
from tkinter import messagebox
from pymongo import MongoClient

def iniciar_sesion():
    usuario = entry_usuario.get()
    contrasena = entry_contrasena.get()

    # Guardar los datos en MongoDB
    guardar_datos_mongo(usuario, contrasena)

    messagebox.showinfo("Iniciar Sesión", "Sesión iniciada con éxito")

def guardar_datos_mongo(usuario, contrasena):
    # Conectar a la base de datos MongoDB local en el puerto 27017
    client = MongoClient('localhost', 27017)

    # Seleccionar la base de datos 'Login'
    db = client['Login']

    # Seleccionar la colección 'Datos'
    collection = db['Datos']

    # Insertar los datos en la colección
    data = {"Usuario": usuario, "Contraseña": contrasena}
    collection.insert_one(data)

# Crear la ventana principal
ventana = tk.Tk()
ventana.title("Iniciar Sesión")

# Crear etiquetas y campos de entrada
label_usuario = tk.Label(ventana, text="Usuario:")
label_usuario.pack()

entry_usuario = tk.Entry(ventana)
entry_usuario.pack()

label_contrasena = tk.Label(ventana, text="Contraseña:")
label_contrasena.pack()

entry_contrasena = tk.Entry(ventana, show="*")  # Para ocultar la contraseña
entry_contrasena.pack()

# Crear el botón de inicio de sesión
boton_iniciar_sesion = tk.Button(ventana, text="Iniciar Sesión", command=iniciar_sesion)
boton_iniciar_sesion.pack()

# Iniciar el bucle principal de la interfaz gráfica
ventana.mainloop()
