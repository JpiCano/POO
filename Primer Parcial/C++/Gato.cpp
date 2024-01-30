#include <iostream>
#include <string>

class Gato {
private:
    std::string nombre;
    int edad;
    std::string raza;

public:
    Gato(std::string nombre, int edad, std::string raza) : nombre(nombre), edad(edad), raza(raza) {}

    void maullar() {
        std::cout << nombre << " empezo a maullar" << std::endl;
    }

    void comer() {
        std::cout << nombre << " empezo a comer" << std::endl;
    }

    void saltar() {
        std::cout << nombre << " empezo a saltar" << std::endl;
    }

    void correr() {
        std::cout << nombre << " empezo a correr" << std::endl;
    }
};

int main() {
    // Ejemplo de uso
    Gato miGato("Pelusa", 3, "Persa");
    miGato.maullar();
    miGato.comer();
    miGato.saltar();
    miGato.correr();

    return 0;
}
