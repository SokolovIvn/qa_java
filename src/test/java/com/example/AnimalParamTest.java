package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalParamTest {

    private final String animalKind;

    public AnimalParamTest(String animalKind) {
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Травоядное"},
                {"Хищник"},
                {"человечище"}
        };
    }

    @Test
    public void testDoesHaveManeReturnFalse() throws Exception {

        switch (animalKind) {
            case  ("Травоядное"):
                assertEquals(List.of("Трава", "Различные растения"), new Animal().getFood(animalKind));
                break;
            case ("Хищник"):
                assertEquals(List.of("Животные", "Птицы", "Рыба"), new Animal().getFood(animalKind));
                break;
            default:
                try {
                    new Animal().getFood(animalKind);
                    Assert.fail("Expected exception was not thrown.");
                } catch (Exception e) {
                    Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
                }
                break;
        }
    }


}