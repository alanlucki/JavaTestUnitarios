package com.platzi.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void looses_when_dice_number_is_too_low() {

        Dice dice00 = new Dice(6);
        dice00.roll();

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice,2);
        assertFalse(player.play());

    }
    @Test
    public void wins_when_dice_number_is_big() {

        //Dice dice = new Dice(6);
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(3);


        Player player = new Player(dice,2);
        assertTrue(player.play());

    }
}