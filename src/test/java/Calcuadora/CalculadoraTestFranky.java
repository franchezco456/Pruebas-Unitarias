package Calcuadora;

import calculadora.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class CalculadoraTestFranky {
    Calculadora calc = new Calculadora();

    @Test
    void testSuma(){
        assertEquals(5, calc.sumar(2,3));
    }

    @Test
    void testSumaNegativos(){
        assertEquals(-7, calc.sumar(-4,-3));
    }

    @Test
    void testSumaCero(){
        assertEquals(3, calc.sumar(0,3));
    }

    @Test
    void testDivision(){
        assertEquals(2, calc.dividir(10, 5));
    }

    @Test
    void testDivisionNegativos(){
        assertEquals(-2, calc.dividir(-10, 5));
    }

    @Test
    void testDividirPorCero(){
        Exception ex =assertThrows(IllegalArgumentException.class, () -> calc.dividir(10,0));
    }
}
