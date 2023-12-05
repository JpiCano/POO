#include <iostream>
#include <string>

class Persona {
public:
    std::string Nombre;
    int Edad;
    std::string cedula;

    Persona(std::string nombre, int edad, std::string cedula)
        : Nombre(nombre), Edad(edad), cedula(cedula) {}

    virtual void comer() = 0;
    virtual void Dormir() = 0;
};

class Cuidador : public Persona {
public:
    std::string NumeroId;

    Cuidador(std::string nombre, int edad, std::string cedula, std::string NumeroId)
        : Persona(nombre, edad, cedula), NumeroId(NumeroId) {}

    void comer() override {
        std::cout << "El cuidador " << this->Nombre << " esta comiendo" << std::endl;
    }

    void Dormir() override {
        std::cout << "El cuidador " << this->Nombre << " esta dormiendo" << std::endl;
    }

    void Alimentar_Animales() {
        std::cout << "El cuidador " << this->Nombre << " esta alimentando a los animales" << std::endl;
    }
};
