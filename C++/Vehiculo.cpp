#include <iostream>
#include <string>

class Vehiculo {
private:
    std::string marca;
    int velocidad;

public:
    // Constructor
    Vehiculo() : marca(""), velocidad(0) {}

    // M�todo para ingresar la velocidad del veh�culo
    void ingresarVelocidad() {
        std::cout << "Ingrese la velocidad del vehiculo: ";
        std::cin >> velocidad;
    }

    // M�todo para ingresar la marca del veh�culo
    void ingresarMarca() {
        std::cout << "Ingrese la marca del vehiculo: ";
        std::getline(std::cin, marca);
    }

    // M�todo para mostrar la velocidad del veh�culo
    void mostrarVelocidad() {
        std::cout << "La velocidad del vehiculo es: " << velocidad << std::endl;
    }

    // M�todo para mostrar la marca del veh�culo
    void mostrarMarca() {
        std::cout << "La marca del vehiculo es: " << marca << std::endl;
    }

    // M�todo para determinar el exceso de velocidad y si va a ser multado o no
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
