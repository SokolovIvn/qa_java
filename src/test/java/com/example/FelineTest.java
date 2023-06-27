package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {

    @Spy
    private Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> ex = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(ex, feline.eatMeat());
    }

    @Test
    public void testGetFamily() {

        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(2, feline.getKittens(2));
    }

    @Test
    public void testTestGetKittens() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
}