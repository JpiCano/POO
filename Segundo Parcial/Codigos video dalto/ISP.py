from abc import ABC, abstractmethod

class Trabajador(ABC):

    @abstractmethod
    def comer(self):
        pass

    @abstractmethod
    def trabajar(self):
        pass

    @abstractmethod
    def dormir(self):
        pass

class Humano(Trabajador):

    def comer(self):
        print("El humando esta comiendo")


    def trabajar(self):
        print("El humando esta trabajando")


    def dormir(self):
        print("El humando esta durmiendo")

class Robot(Trabajador):

    def trabajar(self):
        print("El humando esta trabajando")

robot = Robot()


