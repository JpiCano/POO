#include <iostream>
#include <string>

class Perro {
private:
    std::string nombre;
    int edad;
    std::string raza;

public:
    Perro(std::string nombre, int edad, std::string raza) : nombre(nombre), edad(edad), raza(raza) {}

    void comer() {
        std::cout << nombre << " empezo a comer" << std::endl;
    }

    void saltar() {
        std::cout << nombre << " empezo a saltar" << std::endl;
    }

    void ladrar() {
        std::cout << nombre << " empezo a ladrar" << std::endl;
    }
};

int main() {
    // Ejemplo de uso
    Perro miPerro("Buddy", 5, "Golden Retriever");
    miPerro.comer();
    miPerro.saltar();
    miPerro.ladrar();

    return 0;
}
