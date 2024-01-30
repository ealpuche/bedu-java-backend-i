import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelinosTest {
    
    @Test
    public void testGato() {
        Gato gato = new Gato();
        String resultadoEsperado = "Rawwwr!";
        String resultado = gato.maullar();
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testTigre() {
        Tigre tigre = new Tigre();
        String resultadoEsperado = "Grrr!";
        String resultado = tigre.maullar();
        assertEquals(resultadoEsperado, resultado);
    }
}
