package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParamTest {

    private final String sex;

    public LionParamTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Самка"},
                {"Самец"},
                {"sdfsdf"}
        };
    }

    @Test
    public void testDoesHaveManeReturnFalse() throws Exception {

        switch (sex) {
            case  ("Самка"):
                assertFalse(new Lion(sex).doesHaveMane());
                break;
            case ("Самец"):
                assertTrue(new Lion(sex).doesHaveMane());
                break;
            default:
                try {
                    new Lion(sex);
                    Assert.fail("Expected exception was not thrown.");
                } catch (Exception e) {
                    Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
                }
                break;
        }
    }


}