package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void cyclesForRangeWithOriginBorder() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.cyclesForRange(200, 300);
        assertEquals(expected, actual);

    }

    @Test
    public void cyclesForRangeWithLittleBorder() {
        SQRService sqrService = new SQRService();
        int expected = 1;
        int actual = sqrService.cyclesForRange(10, 100);
        assertEquals(expected, actual);

    }

    @Test
    public void cyclesForRangeWithOverBigBorder() {
        SQRService sqrService = new SQRService();
        int expected = 22;
        int actual = sqrService.cyclesForRange(100, 1000);
        assertEquals(expected, actual);

    }
}