package ru.job4j.generics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleArrayTest {

    private SimpleArray<Object> simpleArray;

    @Before
    public void setUp() throws Exception {
        simpleArray = new SimpleArray<>();
        for (int i = 0; i < 10; i++) {
            simpleArray.add(i);
        }
    }

    @Test
    public void whenAdd10thenSize10() {
        assertEquals(10, simpleArray.size());
    }

    @Test
    public void whenDeleteSizeMustDecrease() {
        simpleArray.remove(3);
        assertEquals(9, simpleArray.size());
    }

    @Test
    public void whenGetWhenReturn() {
        assertEquals(6, simpleArray.get(6));
    }

    @Test
    public void whetSetWhenReplace() {
        simpleArray.set(5, 55);
        assertEquals(55, simpleArray.get(5));
    }
}
