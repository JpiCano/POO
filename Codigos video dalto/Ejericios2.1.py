class Animal:
    def comer(self):
        print("El animal esta comiendo")

class Ave(Animal):
    def volar(self):
        print("Este ave puede volar")   

class Mamifero(Animal):
    def amamantar(self):
        print("El animal esta amamantando")

class Murcielago(Mamifero,Ave):
    pass

ave = Ave()
ave.comer()
ave.volar()

print(Murcielago.mro())
    
