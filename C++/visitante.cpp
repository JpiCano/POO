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

class Visitante : public Persona {
public:
    std::string Numerocarnet;

    Visitante(std::string nombre, int edad, std::string cedula, std::string Numerocarnet)
        : Persona(nombre, edad, cedula), Numerocarnet(Numerocarnet) {}

    void comer() override {
        std::cout << "El visitante " << this->Nombre << " esta comiendo" << std::endl;
    }

    void Dormir() override {
        std::cout << "El visitante " << this->Nombre << " esta dormiendo" << std::endl;
    }

    void comprar() {
        std::cout << "El visitante " << this->Nombre << " esta comprando" << std::endl;
    }
};
