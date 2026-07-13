package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class FelineTest {

    @Test
    public void eatMeatReturnsMeatSources() throws Exception {
        Feline feline = new Feline();
        List<String> meatSources = List.of("Животные", "Птицы", "Рыба");

        assertEquals(meatSources, feline.eatMeat());
    }

    @Test
    public void getCorrectFamilyForFeline() {
        Feline feline = new Feline();

        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithNoInput() {
        Feline feline = new Feline();

        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithInput() {
        Feline feline = new Feline();

        assertEquals(2, feline.getKittens(2));
    }
}
