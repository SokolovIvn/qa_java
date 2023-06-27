package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void getFamily() {
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test
    public void testException() {

        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";

        try {
            assertEquals(expected, new Animal().getFood("animalKind"));
        } catch (Exception e) {
            assertEquals(expected, e.getMessage());
        }
    }


}