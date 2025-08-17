package calculadora;

public class Calculadora {

    public int sumar(int a, int b) {
        try {
            return a + b;
        }catch(ArithmeticException e) {
            throw new ArithmeticException("Error al ejecutar la suma");
        }

    }

    public int dividir(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir por cero");
        try{
            return a / b;
        }catch(ArithmeticException e) {
            throw new ArithmeticException("Error al ejecutar la division");
        }
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
}