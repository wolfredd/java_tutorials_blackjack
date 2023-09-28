package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String playerName;
    private boolean isDisqualified;
    private boolean isStuck;
    private boolean won;

    //List<Card> cardList = new ArrayList<>();

    List<NewCard> newCardList = new ArrayList<>();


    public Player(String playerName) {
        this.playerName = playerName;
        this.isDisqualified = false;
        this.isStuck = false;
        this.won = false;
        //this.cardList = cardList;
    }

    public String getPlayerName() {
        return playerName;
    }

//    public void setPlayerName(String playerName) {
//        this.playerName = playerName;
//    }

    public boolean getDisqualified() {
        return this.isDisqualified;
    }

    public void setDisqualified(boolean disqualified) {
        this.isDisqualified = disqualified;
    }

    public boolean getStuck() {
        return this.isStuck;
    }

    public void setStuck(boolean stuck) {
        this.isStuck = stuck;
    }

//    public List<Card> getCardList() {
//        return cardList;
//    }

//    public void setCardList(Card card) {
//        cardList.add(card);
//    }

    public List<NewCard> getNewCardList() {
        return newCardList;
    }

    public void setNewCardList(NewCard card) {
        newCardList.add(card);
    }


//    public int totalCardValue(){
//        int total = 0;
//        for(int i = 0; i < cardList.size(); i++){
//            total = total + cardList.get(i).getNumber();
//        }
//        return total;
//    }




    public int totalNewCardValue(){
        int total = 0;
        for(int i = 0; i < newCardList.size(); i++){
            total = total + newCardList.get(i).getValue();
        }
        return total;
    }

    public boolean getWon() {
        return this.won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }
}
