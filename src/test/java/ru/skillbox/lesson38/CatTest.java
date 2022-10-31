package ru.skillbox.lesson38;

import java.util.Objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    void testDeepCopy() {
        Cat cat = new Cat();
        Cat copy = cat.fullCopyCat();
        assertNotSame(copy, cat);
        assertTrue(Objects.equals(copy, cat));
    }
}