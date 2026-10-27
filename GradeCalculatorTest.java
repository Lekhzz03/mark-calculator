package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {

    private final GradeCalculator calculator = new GradeCalculator();

    @Test
    void totalIsCorrect() {
        assertEquals(240, calculator.total(80, 80, 80));
    }

    @Test
    void averageIsCorrect() {
        assertEquals(80.0, calculator.average(70, 80, 90), 0.001);
    }

    @Test
    void gradeAIsAssigned() {
        assertEquals("A", calculator.grade(95, 90, 92));
    }

    @Test
    void lowMarksFail() {
        assertEquals("Fail", calculator.grade(20, 30, 25));
    }

    @Test
    void invalidMarkIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> calculator.total(50, 101, 60));
    }
}
