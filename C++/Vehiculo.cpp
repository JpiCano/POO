#include <iostream>
#include <string>

class Vehiculo {
private:
    std::string marca;
    int velocidad;

public:
    // Constructor
    Vehiculo() : marca(""), velocidad(0) {}

    // Método para ingresar la velocidad del vehículo
    void ingresarVelocidad() {
        std::cout << "Ingrese la velocidad del vehiculo: ";
        std::cin >> velocidad;
    }

    // Método para ingresar la marca del vehículo
    void ingresarMarca() {
        std::cout << "Ingrese la marca del vehiculo: ";
        std::getline(std::cin, marca);
    }

    // Método para mostrar la velocidad del vehículo
    void mostrarVelocidad() {
        std::cout << "La velocidad del vehiculo es: " << velocidad << std::endl;
    }

    // Método para mostrar la marca del vehículo
    void mostrarMarca() {
        std::cout << "La marca del vehiculo es: " << marca << std::endl;
    }

    // Método para determinar el exceso de velocidad y si va a ser multado o no
    void excesoVelocidad() {
        if (velocidad > 50) {
            std::cout << "El vehiculo sera multado" << std::endl;
        } else {
            std::cout << "El vehiculo no sera multado" << std::endl;
        }
    }
};

int main() {
    Vehiculo vehiculo;
    vehiculo.ingresarMarca();
    vehiculo.ingresarVelocidad();
    vehiculo.mostrarMarca();
    vehiculo.mostrarVelocidad();
    vehiculo.excesoVelocidad();

    return 0;
}
