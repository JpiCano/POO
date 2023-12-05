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

class Leon : public ZOO {
public:
    std::string vacuna;

    Leon(std::string Nombre, int edad, std::string Numeroregistro, std::string vacuna)
        : ZOO(Nombre, edad, Numeroregistro), vacuna(vacuna) {}

    void comer() override {
        std::cout << this->Nombre << " esta comiendo" << std::endl;
    }

    void Dormir() override {
        std::cout << this->Nombre << " esta durmiendo" << std::endl;
    }

    void rugir() {
        std::cout << this->Nombre << " esta rugiendo" << std::endl;
    }

    void cazar() {
        std::cout << this->Nombre << " esta cazando" << std::endl;
    }
};
