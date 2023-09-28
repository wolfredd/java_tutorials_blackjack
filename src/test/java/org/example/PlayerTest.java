package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player player;

    //Setup
    @BeforeEach
    void setUp(){

        NewCard card1 = new NewCard(CardSuit.DIAMONDS, CardValue.ACE);
        NewCard card2 = new NewCard(CardSuit.DIAMONDS, CardValue.JACK);
        player = new Player("player");
        player.newCardList.add(card1);
    }

    //verify
    @Test
    void getPlayerName() {
        assertEquals("player", player.getPlayerName());
    }

    @Test
    void getDisqualified() {
        assertEquals(false, player.getDisqualified());
    }


    @Test
    void getStuck() {
        assertEquals(false, player.getStuck());
    }



    @Test
    void getNewCardList() {
        assertEquals(null, player.getNewCardList());
    }



    @Test
    void totalNewCardValue() {
    }

    @Test
    void getWon() {
    }

    @Test
    void setWon() {
    }
}