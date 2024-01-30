import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculadoraTest {  
    @Test
    public void testSumar() {
        Calculadora calculadora = mock(Calculadora.class);
        when(calculadora.sumar(2, 2)).thenReturn(4);
        when(calculadora.sumar(5, 5)).thenReturn(10);

        int resultadoEsperado = 4;
        assertEquals(resultadoEsperado, calculadora.sumar(2, 2));

        verify(calculadora).sumar(2, 2);
    }
    
}
