package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private String name;
    //List<Card> cardList = new ArrayList<>();
    List<NewCard> newCardList = new ArrayList<>();


    public Deck(String name) {
        this.name = name;
        //this.cardList = cardList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Card> getCardList() {
//        return this.cardList;
//    }

//    public void setCardList(List<Card> cardList) {
//        this.cardList = cardList;
//    }


    public List<NewCard> getNewCardList() {
        return this.newCardList;
    }

    public void setNewCardList(List<NewCard> cardList) {
        this.newCardList = cardList;
    }

//    public void shuf(List<Card> cardList){
//        Collections.shuffle(cardList);
//    }

    public void shuff(List<NewCard> newCardList){
         Collections.shuffle(newCardList);
    }






    public List<NewCard> shareCards(Player player) {
        if (player.getDisqualified() == false) {

            int n = 0;
            //n = (int)(Math.random()*52) + 1;
            player.setNewCardList(this.getNewCardList().get(n));
            newCardList.remove(n);

            int m = 0;
            //m = (int)(Math.random()*52) + 1;
            player.setNewCardList(this.getNewCardList().get(m));
            newCardList.remove(m);
        }else{
            System.out.println(player.getPlayerName() + " is disqualified");
        }
        return null;
    }


    public void oneCard(Player player){

        if (player.getDisqualified() == false) {

            int n = 0;
            //n = (int)(Math.random()*52) + 1;
            player.setNewCardList(this.getNewCardList().get(n));
            //System.out.println(this.getCardList().get(n).getName());
            newCardList.remove(n);
        }else{
            System.out.println(player.getPlayerName() + " is disqualified");
        }
    }


    List<NewCard> generateCards(List<NewCard> deck) {

        for(var suit: CardSuit.values()) {

            for(var cardValue: CardValue.values()) {

                NewCard card = new NewCard(suit,cardValue);

                deck.add(card);

            }

        }
        return deck;

    }



}
