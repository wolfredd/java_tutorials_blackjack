package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewCardTest {

    //setup

    NewCard card;
    @BeforeEach
    void setUp(){
        card = new NewCard(CardSuit.DIAMONDS, CardValue.ACE);
    }


    //verify
    @Test
    void getValue() {
        assertEquals(11, card.getValue());
    }

    @Test
    void testToString() {
        assertEquals("ACE of DIAMONDS", card.toString());
    }
}