package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;

public class LionAlexTest {

    @Test
    public void getFriendsReturnsCorrectList() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        LionAlex alex = new LionAlex(feline);

        List<String> expectedFriends = List.of("Марти", "Мелман", "Глория");

        Assert.assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnsNewYorkZoo() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        LionAlex alex = new LionAlex(feline);

        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensReturnsZero() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        LionAlex alex = new LionAlex(feline);

        Assert.assertEquals(0, alex.getKittens());
    }
}