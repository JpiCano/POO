#include <iostream>
#include <string>

class ZOO {
public:
    std::string Nombre;
    int Edad;
    std::string Numeroregistro;

    ZOO(std::string Nombre, int edad, std::string Numeroregistro)
        : Nombre(Nombre), Edad(edad), Numeroregistro(Numeroregistro) {}

    void setNumeroregistro(std::string Numeroregistro) {
        this->Numeroregistro = Numeroregistro;
    }

    virtual void comer() = 0;
    virtual void Dormir() = 0;
};
