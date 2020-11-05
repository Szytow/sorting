package com.company.sorting;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class BubbleSort {

    private final int min = 10;
    private final int max = 50;

    public int xd = getRandomNumberInRange(min, max);

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
