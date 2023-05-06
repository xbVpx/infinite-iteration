package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected final int min, max;
    protected Random random = new Random();

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            public boolean hasNext() {
                // бесконечный итератор
                return true;
            }

            public Integer next() {
                // случайное число в диапазоне min - max
                return random.nextInt(max - min + 1) + min;
            }
        };
    }
}
