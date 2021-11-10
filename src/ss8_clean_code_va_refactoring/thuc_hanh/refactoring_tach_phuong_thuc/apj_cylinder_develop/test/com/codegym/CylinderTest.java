package ss8_clean_code_va_refactoring.thuc_hanh.refactoring_tach_phuong_thuc.apj_cylinder_develop.test.com.codegym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ss8_clean_code_va_refactoring.thuc_hanh.refactoring_tach_phuong_thuc.apj_cylinder_develop.src.com.codegym.Cylinder;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    @DisplayName("Testing getVolume(0, 0)")
    void testGetVolume0And0() {
        int radius = 0;
        int height = 0;
        double expected = 0;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getVolume(1, 2)")
    void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }
}
