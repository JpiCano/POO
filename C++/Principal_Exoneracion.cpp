#include <iostream>
#include <string>

class Visitante {
public:
    std::string Nombre;
    int Edad;
    std::string cedula;
    std::string Numerocarnet;

    Visitante(std::string nombre, int edad, std::string cedula, std::string Numerocarnet)
        : Nombre(nombre), Edad(edad), cedula(cedula), Numerocarnet(Numerocarnet) {}
};

class Cuidador {
public:
    std::string Nombre;
    int Edad;
    std::string cedula;
    std::string Numerocarnet;

    Cuidador(std::string nombre, int edad, std::string cedula, std::string Numerocarnet)
        : Nombre(nombre), Edad(edad), cedula(cedula), Numerocarnet(Numerocarnet) {}
};

class Leon {
public:
    std::string Nombre;
    int Edad;
    std::string Numeroregistro;
    std::string vacuna;

    Leon(std::string nombre, int edad, std::string Numeroregistro, std::string vacuna)
        : Nombre(nombre), Edad(edad), Numeroregistro(Numeroregistro), vacuna(vacuna) {}
};

class Pinguino {
public:
    std::string Nombre;
    int Edad;
    std::string Numeroregistro;
    std::string Numerocarnet;

    Pinguino(std::string nombre, int edad, std::string Numeroregistro, std::string Numerocarnet)
        : Nombre(nombre), Edad(edad), Numeroregistro(Numeroregistro), Numerocarnet(Numerocarnet) {}
};

int main() {
    std::string nombre, cedula, Numeroregistro, vacuna, Numerocarnet;
    int edad;

    bool datosCorrectos = false;
    do {
        try {
            std::cout << "Ingrese el nombre del visitante: " << std::endl;
            std::getline(std::cin, nombre);
            std::cout << "Ingrese la edad del visitante: " << std::endl;
            std::cin >> edad;
            std::cin.ignore();
            std::cout << "Ingrese la cédula del visitante: " << std::endl;
            std::getline(std::cin, cedula);
            std::cout << "Ingrese el número de carnet del visitante: " << std::endl;
            std::getline(std::cin, Numerocarnet);

            Visitante visitante1(nombre, edad, cedula, Numerocarnet);
            datosCorrectos = true;
        } catch (...) {
            std::cout << "Error: Ingrese un número válido para la edad." << std::endl;
        }
    } while (!datosCorrectos);

    datosCorrectos = false;
    std::cout << "Se registró el visitante" << std::endl;


    return 0;
}
