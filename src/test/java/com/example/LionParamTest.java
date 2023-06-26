package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {

    private String sex;
    private boolean result;

    Feline feline;

    public LionParamTest(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
                {"asdfa", true}
        };
    }

    @Test
    public void testDoesHaveManeReturnFalse() throws Exception {

        try {
            assertEquals(new Lion(sex, feline).doesHaveMane(), result);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

}


//    @Test
//    public void testDoesHaveManeReturnFalse() throws Exception {
//
//        switch (sex) {
//            case  ("Самка"):
//                assertFalse(new Lion(sex,feline).doesHaveMane());
//                break;
//            case ("Самец"):
//                assertTrue(new Lion(sex, feline).doesHaveMane());
//                break;
//            default:
//                try {
//                    new Lion(sex, feline);
//                    Assert.fail("Expected exception was not thrown.");
//                } catch (Exception e) {
//                    Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
//                }
//                break;
//        }
//    }


