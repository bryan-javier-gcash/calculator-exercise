import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.springtrack.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    static Calculator calculator = new Calculator();

    @Test
    public void isCalculatorOn() {
        assertFalse(calculator.isOn());
    }

    @Test
    public void shouldTurnOn() {
        assertTrue(calculator.turnOn());
    }

    @Test
    public void shouldAdd() {
        assertEquals(2, calculator.add(1, 1), 0.00);
    }

    @Test
    public void shouldSubtract() {
        assertEquals(0, calculator.subtract(1,1), 0.00);
    }

    @Test
    public void shouldMultiply() {
        assertEquals(1, calculator.multiply(1,1), 0.00);
    }

    @Test
    public void shouldDivide(){
        assertEquals("1", calculator.divide(1, 1));
        assertEquals("Undefined", calculator.divide(1, 0));
    }

    @Test
    public void shouldPower() {
        assertEquals(125.00, calculator.power(5, 3), 0.00);
    }

    @Test
    public void shouldModulo() {
        assertEquals(1, calculator.modulo(26, 5), 0.00);
    }
}
