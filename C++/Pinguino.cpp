#include <iostream>
#include <string>

class ZOO {
public:
    std::string Nombre;
    int edad;
    std::string Numeroregistro;

    ZOO(std::string Nombre, int edad, std::string Numeroregistro)
        : Nombre(Nombre), edad(edad), Numeroregistro(Numeroregistro) {}

    virtual void comer() = 0;
    virtual void Dormir() = 0;
};

class Pinguino : public ZOO {
public:
    Pinguino(std::string Nombre, int edad, std::string Numeroregistro)
        : ZOO(Nombre, edad, Numeroregistro) {}

    void comer() override {
        std::cout << this->Nombre << " esta comiendo" << std::endl;
    }

    void Dormir() override {
        std::cout << this->Nombre << " esta durmiendo" << std::endl;
    }

    void nadar() {
        std::cout << this->Nombre << " esta nadando" << std::endl;
    }

    void pescar() {
        std::cout << this->Nombre << " esta pescando" << std::endl;
    }
};

