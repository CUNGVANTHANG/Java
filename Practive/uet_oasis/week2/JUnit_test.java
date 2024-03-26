package uet_oasis.week2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnit_test {
    @Test
    public void testMax2Int1() {
        assertEquals(4, JUnit.max2Int(2, 4));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(99, JUnit.max2Int(-2, 99));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(945454559, JUnit.max2Int(-21554545, 945454559));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(-2, JUnit.max2Int(-2, -45454));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(0, JUnit.max2Int(0, -999999));
    }

    @Test
    public void testMinArray1() {
        int[] array = { 1, 45, -233, 44, 88454 };
        assertEquals(-233, JUnit.minArray(array));
    }

    @Test
    public void testMinArray2() {
        int[] array = { 1, 2, 34, 54, 54, 56, 237283, -4734, 0 };
        assertEquals(-4734, JUnit.minArray(array));
    }

    @Test
    public void testMinArray3() {
        int[] array = { 0, 7234, 5, 3, 8 };
        assertEquals(0, JUnit.minArray(array));
    }

    @Test
    public void testMinArray4() {
        int[] array = { 12, 4744, 4545, 124, 1, 53, 45 };
        assertEquals(1, JUnit.minArray(array));
    }

    @Test
    public void testMinArray5() {
        int[] array = { 1, 2, 3, 45, 787, 545, 121, 5454, 111, 111, 3133, 45455454, 44444, 111, -3463 };
        assertEquals(-3463, JUnit.minArray(array));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Bình thường", JUnit.calculateBMI(59, 1.73));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Thiếu cân", JUnit.calculateBMI(53, 1.93));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Béo phì", JUnit.calculateBMI(100, 1.94));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Thừa cân", JUnit.calculateBMI(70, 1.7));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Invalid", JUnit.calculateBMI(-4, 1.7));
    }
} 