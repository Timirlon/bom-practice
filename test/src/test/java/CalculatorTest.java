import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void BeforeEach() {
        calculator = new Calculator();
    }

    @Test
    public void methodAddShouldReturnSumOfParameters() {
        int result = calculator.add(1, 2);

        assertEquals(3, result);
    }

    @Test
    public void methodSubtractShouldReturnDifferenceOfParameters() {
        int result = calculator.subtract(5, 3);

        assertEquals(2, result);
    }

    @Test
    public void methodMultiplyShouldReturnMultiplicationOfParameters() {
        int result = calculator.multiply(2, 3);

        assertEquals(6, result);
    }

    @Test
    public void methodDivideShouldThrowExceptionIfSecondParameterIsZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }

    @Test
    public void methodDivideShouldDivideNumbersIfAllConditionsMet() {
        int result = calculator.divide(4, 2);

        assertEquals(2, result);
    }
}
