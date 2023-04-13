import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarCorretamente() {
        // Given
        Calculadora calculadora = new Calculadora();

        // When
        int a = 10;
        int b = 5;
        int resultado = calculadora.somar(a, b);

        //Then
        Assertions.assertEquals(15, resultado);
    }

    @Test
    public void deveSubtrairCorretamente() throws Exception {
        // Given
        Calculadora calculadora = new Calculadora();

        // When
        int a = 10;
        int b = 5;
        int resultado = calculadora.subtrair(a, b);

        // Then
        Assertions.assertEquals(5, resultado);
    }

    @Test
    public void deveMultiplicarCorretamente() {
        // Given
        Calculadora calculadora = new Calculadora();

        // When
        int a = 10;
        int b = 5;
        int resultado = calculadora.multiplicar(a, b);

        // Then
        Assertions.assertEquals(50, resultado);
    }

    @Test
    public void deveDividirPorZeroRetornaException() throws Exception{
        // Given
        Calculadora calculadora = new Calculadora();

        // When
        int a = 10;
        int b = 0;

        // Then
        Assertions.assertThrows(Exception.class, () -> calculadora.dividir(a, b));

    }

    @Test
    public void deveDividirCorretamente() throws Exception {
        // Given
        Calculadora calculadora = new Calculadora();

        // When
        int a = 10;
        int b = 5;
        int resultado = calculadora.dividir(a, b);

        // Then
        Assertions.assertEquals(2, resultado);
    }

}