package ru.netology.sqr;

public class SQRService {
    public int cyclesForRange(int borderStart, int endOfBorder) {
        int count = 0;
        int numberToBeSquaredStart = 10;
        int numberToBeSquaredEnd = 99;
        for (int i = numberToBeSquaredStart; i <= numberToBeSquaredEnd; i++) {
            if (i * i >= borderStart && i * i <= endOfBorder) {
                count++;

            }

        }
        return count;
    }
}
