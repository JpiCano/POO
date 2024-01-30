#include <iostream>

class Compania {
public:

};

int main() {
    int opcion1;
    int opcion2;
    std::cout << "MENU EMPRESA" << std::endl;
    std::cout << "1. SUCURSAL 1" << std::endl;
    std::cout << "2. SUCURSAL 2" << std::endl;
    std::cout << "3. SUCURSAL 3" << std::endl;
    std::cout << "4. Salir" << std::endl;

    do {
        std::cout << "Ingrese una opcion: ";
        std::cin >> opcion1;

        switch (opcion1) {
            case 1:
            case 2:
            case 3:
                Compania sucursal;
                std::cout << "ELIGA UN PRODUCTO" << std::endl;
                std::cout << "1. PAPAS" << std::endl;
                std::cout << "2. QUESO" << std::endl;
                std::cout << "3. LECHE" << std::endl;
                std::cin >> opcion2;

                switch (opcion2) {
                    case 1:
                        std::cout << "" << std::endl;
                        break;

                    case 2:
                        std::cout << "" << std::endl;
                        break;

                    case 3:
                        std::cout << "" << std::endl;
                        break;
                }
                break;

            case 4:
                std::cout << "Saliendo..." << std::endl;
                break;

            default:
                std::cout << "Opción inválida, ingrese nuevamente." << std::endl;
                break;
        }
    } while (opcion1 != 4);

    return 0;
}
