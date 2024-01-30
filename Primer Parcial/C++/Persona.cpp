#include <iostream>
#include <string>

class Persona {
public:
    std::string Nombre;
    int Edad;

private:
    std::string cedula;

public:
    Persona(std::string Nombre, int edad, std::string cedula)
        : Nombre(Nombre), Edad(edad), cedula(cedula) {}

    void setCedula(std::string nuevaCedula) {
        this->cedula = nuevaCedula;
    }

    virtual void comer() = 0;
    virtual void Dormir() = 0;
};
