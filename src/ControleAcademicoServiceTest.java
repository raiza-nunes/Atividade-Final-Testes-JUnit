import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ControleAcademicoServiceTest {

    private ControleAcademicoService service;

    @BeforeEach
   public void setUp() {
        service = new ControleAcademicoService();
    }

    @Test
    public void testVerificarSituacaoAprovadoExato() {
        assertEquals("Aprovado", service.verificarSituacao(7.0, 75));
    }

    @Test
    public void testCalcularMedia() {
        assertEquals(8.0, service.calcularMedia(7.0, 9.0));
    }

    @Test
    public void testFrequenciaValidaLimites() {
        assertTrue(service.frequenciaValida(100));
        assertTrue(service.frequenciaValida(0));
    }

    @Test
    public void testVerificarSituacaoMediaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.verificarSituacao(-1.0, 80);
        });
    }
}