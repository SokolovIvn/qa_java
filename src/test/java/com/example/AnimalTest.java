package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class AnimalTest {

    @Test
    public void getFamily() {
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}