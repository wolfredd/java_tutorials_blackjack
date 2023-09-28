package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

class DeckTest {


    //Setup
    private Deck deck1;

    @Mock
    private Player player;

    @Mock
    private Deck deck;

    List<NewCard> deckOfCards;

    @BeforeEach
    void setUp(){
        deck1 = new Deck("deck1");
        player = mock(Player.class);
        deckOfCards = new ArrayList<>();
        deck1.generateCards(deckOfCards);
        deck1.shuff(deckOfCards);
    }

    //Action


    @Test
    void getNewCardList() {
        var geen = deck1.generateCards(deckOfCards);
        assertEquals(104, geen.size());
        assertNotNull(geen);
    }


    @Test
    void shuff() {

        var geen = deck1.generateCards(deckOfCards);
        Deck deck2 = new Deck("deck2");
        deck2.shuff(geen);

        assertEquals(104, geen.size());
        assertNotNull(geen);
        assertNotEquals(geen, deck1);


//        Deck newdeck = (Deck) deck1.getNewCardList();
//        List<NewCard> newnewdeck = new ArrayList<>();
//        newnewdeck = newdeck.getNewCardList();
//        newdeck.shuff(newnewdeck);
//        assertNotEquals(newdeck, deck1);
    }

//    @Test
//    void shareCards() {
//        when(player.getDisqualified()).thenReturn(false);
//        deck1.shareCards(player);
//
//        verify(player,times(2)).setNewCardList();
//
//        var shared = player.getNewCardList();
//        assertEquals(6, shared.size());
//    }

    @Test
    void shareCards() {
        Deck deck1 = new Deck("deck1");
        List<NewCard> deckOfCards = new ArrayList<>();
        System.out.println(deck1.generateCards(deckOfCards));
        deck1.setNewCardList(deckOfCards);
        deck1.shuff(deckOfCards);
        Player player5 = new Player("player5");

        deck1.shareCards(player5);
        assertNotNull(player5.getNewCardList());
//        when(player.getDisqualified()).thenReturn(false);
//        deck1.shareCards(player);
//
//        verify(player,times(2)).setNewCardList();
//
//        var shared = player.getNewCardList();
//        assertEquals(6, shared.size());
    }

    @Test
    void oneCard() {
        List<NewCard> deckOfCards = new ArrayList<>();

        System.out.println(deck.generateCards(deckOfCards));
        deck.setNewCardList(deckOfCards);
        deck.shuff(deckOfCards);
        deck.oneCard(player);
//        verify(deck).oneCard(new Player("player2"));
        assertNotNull(player.getNewCardList());
        assertNotNull(player.getNewCardList());
    }

    @Test
    void generateCards() {

        var genCard = deck1.generateCards(deckOfCards);
        assertEquals(104, genCard.size());
    }
}