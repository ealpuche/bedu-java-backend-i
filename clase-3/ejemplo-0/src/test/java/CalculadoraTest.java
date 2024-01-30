import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    public void sumaTest() {
        int resultado = calculadora.suma(2, 3);
        assertEquals(5, resultado);
    }
}