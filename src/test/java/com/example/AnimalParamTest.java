package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalParamTest {

    private final List<String> expected;
    private final String animalKind;

    public AnimalParamTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"человечище", List.of("Неизвестный вид животного, используйте значение Травоядное или Хищник")}
        };
    }

    @Test
    public void testDoesHaveManeReturnFalse() {

        try {
            assertEquals(expected ,new Animal().getFood(animalKind));
        } catch (Exception e) {
            e.getMessage().contains(expected.toString());
        }
    }


}