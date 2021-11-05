package ss8_clean_code_va_refactoring.thuc_hanh.refactoring;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {

        void testCalculateAdd () {
            int a = 1;
            int b = 1;
            char o = '+';
            int expected = 2;

            int result = Calculator.calculate(a, b, o);
            assert (expected, result);
        }


        void testCalculateSub () {
            int a = 2;
            int b = 1;
            char o = '-';
            int expected = 1;

            int result = Calculator.calculate(a, b, o);
            assertEquals(expected, result);
        }


        void testCalculateMul () {
            int a = 2;
            int b = 2;
            char o = '*';
            int expected = 4;

            int result = Calculator.calculate(a, b, o);
            assertEquals(expected, result);
        }


        void testCalculateDiv () {
            int a = 6;
            int b = 3;
            char o = '/';
            int expected = 2;

            int result = Calculator.calculate(a, b, o);
            assertEquals(expected, result);
        }


        void testCalculateDivByZero () {
            int a = 2;
            int b = 0;
            char o = '/';

            assertThrows(RuntimeException.class,
                    () -> {
                        Calculator.calculate(a, b, o);
                    });
        }


        void testCalculateWrongOperator () {
            int a = 2;
            int b = 0;
            char o = '=';

            assertThrows(RuntimeException.class,
                    () -> {
                        Calculator.calculate(a, b, o);
                    });
        }
    }
}
