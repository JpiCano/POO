#include <iostream>

class Calculadora {
private:
    int number1;
    int number2;

public:
    // Constructor
    Calculadora() : number1(0), number2(0) {}

    // Método para la suma
    void Suma() {
        int resultadoSuma;
        std::cout << "***SUMA***" << std::endl;
        std::cout << "Ingrese numero 1: ";
        std::cin >> number1;
        std::cout << "Ingrese numero 2: ";
        std::cin >> number2;

        resultadoSuma = number1 + number2;
        std::cout << "El resultado de la suma es: " << resultadoSuma << std::endl;
    }

    // Método para la resta
    void Resta() {
        int resultadoResta;
        std::cout << "\n***RESTA***" << std::endl;
        std::cout << "Ingrese numero 1: ";
        std::cin >> number1;
        std::cout << "Ingrese numero 2: ";
        std::cin >> number2;

        resultadoResta = number1 - number2;
        std::cout << "El resultado de la resta es: " << resultadoResta << std::endl;
    }

    // Método para la multiplicación
    void Multiplicacion() {
        int resultadoMultiplicacion;
        std::cout << "\n***MULTIPLICACION***" << std::endl;
        std::cout << "Ingrese numero 1: ";
        std::cin >> number1;
        std::cout << "Ingrese numero 2: ";
        std::cin >> number2;

        resultadoMultiplicacion = number1 * number2;
        std::cout << "El resultado de la multiplicacion es: " << resultadoMultiplicacion << std::endl;
    }

    // Método para la división
    void Division() {
        int resultadoDivision;
        bool errorDivision = false;

        do {
            std::cout << "\n***DIVISION***" << std::endl;
            std::cout << "Ingrese numero 1: ";
            std::cin >> number1;
            std::cout << "Ingrese numero 2: ";
            std::cin >> number2;

            if (number2 != 0) {
                resultadoDivision = number1 / number2;
                std::cout << "El resultado de la Division es: " << resultadoDivision << std::endl;
                errorDivision = false;
            } else {
                std::cout << "Error de division por cero, ingrese nuevamente un valor correcto." << std::endl;
                errorDivision = true;
            }
        } while (errorDivision);
    }
};

int main() {
    Calculadora calc;
    calc.Suma();
    calc.Resta();
    calc.Multiplicacion();
    calc.Division();

    return 0;
}
