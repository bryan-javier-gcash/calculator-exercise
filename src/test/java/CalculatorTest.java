import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.springtrack.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void isCalculatorOn() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.isOn());
    }

    @Test
    public void shouldTurnOn() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.turnOn());
    }

    @Test
    public void shouldAdd() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), 0.00);
    }

    @Test
    public void shouldSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(1,1), 0.00);
    }

    @Test
    public void shouldMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.multiply(1,1), 0.00);
    }

    @Test
    public void shouldDivide(){
        Calculator calculator = new Calculator();
        assertEquals("1", calculator.divide(1, 1));
        assertEquals("Undefined", calculator.divide(1, 0));
    }

    @Test
    public void shouldPower() {
        Calculator calculator = new Calculator();
        assertEquals(125.00, calculator.power(5, 3), 0.00);
    }

    @Test
    public void shouldModulo() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.modulo(26, 5), 0.00);
    }
}
