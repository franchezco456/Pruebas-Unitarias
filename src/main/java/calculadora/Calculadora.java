package calculadora;

public class Calculadora {

    public int sumar(int a, int b) {
<<<<<<< HEAD

            return a + b;
    }

    public int dividir (int a, int b) {
=======
        return a + b;
    }

    public int dividir(int a, int b) {
>>>>>>> 39e6c5ddf8b1e6484dfe106f893b3cdbe015baf5
        if (b == 0) throw new IllegalArgumentException("No se puede dividir por cero");
        return a / b;
    }

    public int restar(int a, int b) {
<<<<<<< HEAD
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
=======
        try {
            int resultado = a - b;


            if ((b > 0 && resultado > a) || (b < 0 && resultado < a)) {
                throw new ArithmeticException("Overflow/Underflow en resta");
            }

            return resultado;

        } catch (ArithmeticException e) {
            System.err.println("Error aritmético: " + e.getMessage());
            return 0;
        }
    }

    public int multiplicar(int a, int b) {
        try {
            return Math.multiplyExact(a, b);

        } catch (ArithmeticException e) {
            System.err.println("Error en multiplicación: " + e.getMessage());
            return 0; 
        }
>>>>>>> 39e6c5ddf8b1e6484dfe106f893b3cdbe015baf5
    }
}