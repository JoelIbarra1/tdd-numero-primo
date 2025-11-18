import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorPrimoTest {
    @Test
    public void testUnoEsPrimo(){
        assertFalse(ValidadorPrimo.esPrimo(1));

    }
    @Test
    public void testDosEsPrimo(){
        assertTrue(ValidadorPrimo.esPrimo(2));
    }

    @Test
    public void testTresEsPrimo(){
        assertTrue(ValidadorPrimo.esPrimo(3));
    }

    @Test
    public void testCuatroNoEsPrimo(){
        assertFalse(ValidadorPrimo.esPrimo(4));
    }

    @Test
    public void testNegativoNoEsPrimo(){
        assertFalse(ValidadorPrimo.esPrimo(-7));
    }

    @Test
    public void testPrimoGrande(){
        assertTrue(ValidadorPrimo.esPrimo(7919));
    }

    @Test
    public void testCuadradoNoEsPrimo(){
        assertFalse(ValidadorPrimo.esPrimo(49));
    }



}