import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar() {
        // Primer escenario     
        int a = 1002;
        int b = 2;
        int resultadoEsperado = 1004;
        int resultado = calculadora.sumar(a, b);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testRestar() {
        int a = 2;
        int b = 2;
        int resultadoEsperado = 0;
        int resultado = calculadora.restar(a, b);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testMultiplicar() {
        int a = 2;
        int b = 2;
        int resultadoEsperado = 4;
        int resultado = calculadora.multiplicar(a, b);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testDividir() {
        int a = 2;
        int b = 2;
        double resultadoEsperado = 1;
        double resultado = calculadora.dividir(a, b);
        assertEquals(resultadoEsperado, resultado);
    }

    
}
