package Calcuadora;

import calculadora.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTestRafa {

    private final Calculadora calc = new Calculadora();


    @Test
    void restarNormal() {
        assertEquals(10, calc.restar(15, 5));
    }

    @Test
    void restarNegativos() {
        assertEquals(0, calc.restar(-5, -5));

    }


    @Test
    void restarZero() {
        assertEquals(0, calc.restar(0, 0));
    }


    @Test
    void restarZeroNegativos() {
        assertEquals(0, calc.restar(-0, -0));
    }


    @Test
    void multiplicarNormal() {
        assertEquals(100, calc.multiplicar(10, 10));
    }

    @Test
    void multiplicarNegativos() {
        assertEquals(100, calc.multiplicar(-10,-10 ));
    }

    @Test
    void multiplicarZero() {
        assertEquals(0, calc.multiplicar(0, 1000000));
    }
}


