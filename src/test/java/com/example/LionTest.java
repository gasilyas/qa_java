package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittensWithNoInput() throws Exception {
        Lion lion = new Lion(feline, "Самец");

        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodReturnsMeatSources () throws Exception {
        Lion lion = new Lion(feline, "Самка");
        List<String> meatSources = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline.getFood("Хищник")).thenReturn(meatSources);
        assertEquals(meatSources, lion.getFood());
    }

    @Test
    public void checkExceptionThrownWhenUnknownSex () {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion(feline, "Трансгендер");
        });

        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}
