package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Deck deck1 = new Deck("deck1");


        List<NewCard> deckOfCards = new ArrayList<>();


        System.out.println(deck1.generateCards(deckOfCards));


        deck1.shuff(deckOfCards);


        deck1.setNewCardList(deckOfCards);



        System.out.println("Enter Player Number: ");

        Scanner input = new Scanner(System.in);

        int numberOfPlayers = input.nextInt();
        List<Player> players = new ArrayList<>();


        if(numberOfPlayers > 0 && numberOfPlayers <=6){
            for(int i = 1; i <= numberOfPlayers; i++){
                //new Player("player"+ i);
                deck1.shareCards(new Player("player"+ i));

                players.add(new Player("player"+ i));
            }
        }else{
            System.out.println("Invalid Number Of Players");
        }


        for(int i = 0; i < players.size(); i++ ){
            while(players.get(i).totalNewCardValue() < 17){
                deck1.oneCard(players.get(i));
            }
        }

        for(int i = 0; i < players.size(); i++ ){
            for (int j = 0; j < players.get(i).getNewCardList().size(); j++){
                System.out.println(players.get(i).getPlayerName() + " " + players.get(i).getNewCardList().get(j) );
            }

        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


        for(int i = 0; i < players.size(); i++ ){
            System.out.println(players.get(i).getPlayerName() + " CARD VALUE = " + players.get(i).totalNewCardValue());
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        for(int i = 0; i < players.size(); i++ ){
            if(players.get(i).totalNewCardValue() == 21){
                System.out.println(players.get(i).getPlayerName() + " " + players.get(i).totalNewCardValue());
                System.out.println(players.get(i).getPlayerName() + " won");
                players.get(i).setWon(true);
            } else if (players.get(i).totalNewCardValue() >= 17 && players.get(i).totalNewCardValue() < 21) {
                players.get(i).setStuck(true);

            }

        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        boolean allStuckTrue = true;

        for(int i = 0; i < players.size(); i++ ){
            allStuckTrue = allStuckTrue  && players.get(i).getStuck();
        }

        for(int i = 0; i < players.size(); i++ ){
            if(allStuckTrue == true){
                System.out.println("EVERYBODY IS STUCK");
            }else if(players.get(i).totalNewCardValue() > 21){
                players.get(i).setDisqualified(true);
            }
        }
        System.out.println("Are all stuck " + allStuckTrue);

        System.out.println("");
        System.out.println("");
        System.out.println("");


        List<Player> stuckPlayers = new ArrayList<>();



        for(int i = 0; i < players.size(); i++ ) {
            if (players.get(i).getStuck() == true) {
                stuckPlayers.add(players.get(i));
            }
        }


        boolean allWonTrue = false;

        for(int i = 0; i < players.size(); i++ ){
            allWonTrue = allWonTrue  || players.get(i).getWon();
        }


        Player maxplayer = null;

        for(int i = 0; i < players.size(); i++ ){
            if(allWonTrue == true){
            }else{



                //create variable to hole current high score

                int currentHighscore  = 0;

                //create variiable to hold higes scoring player


                for(int a = 0; a < stuckPlayers.size(); a++) {

                    if (stuckPlayers.get(a).totalNewCardValue() > currentHighscore){
                        currentHighscore = stuckPlayers.get(a).totalNewCardValue();
                        maxplayer = stuckPlayers.get(a);

                    }


                }

            }

        }

        if(maxplayer == null){
        }else {
            System.out.println(maxplayer.totalNewCardValue());
            System.out.println("winner is " + maxplayer.getPlayerName());
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        for(int i = 0; i < stuckPlayers.size(); i++){
            System.out.println("Stuck Players: " + stuckPlayers.get(i).getPlayerName());
        }















//        Player player1 = new Player("Player 1");
//
//        deck1.shareCards(player1);
//
//        Player player2 = new Player("Player 2");
//
//        deck1.shareCards(player2);
//
//        Player player3 = new Player("Player 3");
//
//        deck1.shareCards(player3);
//
//
//        while(player1.totalNewCardValue() < 17) {
//            deck1.oneCard(player1);
//        }
//
//        while(player2.totalNewCardValue() < 17) {
//            deck1.oneCard(player2);
//        }
//
//        while(player3.totalNewCardValue() < 17) {
//            deck1.oneCard(player3);
//        }
//
//
//        for(int i = 0; i < player1.getNewCardList().size(); i++){
//
//            System.out.println("player 1: " + player1.getNewCardList().get(i));
//
//        }
//
//        System.out.println("Total CardValue of Player 1 = " + player1.totalNewCardValue());
//
//        System.out.println("");
//
//        for(int i = 0; i < player2.getNewCardList().size(); i++){
//
//            System.out.println("player 2: " + player2.getNewCardList().get(i));
//
//        }
//
//        System.out.println("Total CardValue of Player 2 = " +player2.totalNewCardValue());
//
//        System.out.println("");
//
//        for(int i = 0; i < player3.getNewCardList().size(); i++){
//
//            System.out.println("player 3: " + player3.getNewCardList().get(i));
//
//        }
//
//        System.out.println("Total CardValue of Player 3 = " +player3.totalNewCardValue());
//
//        System.out.println("");
//
//
//        if(player1.totalNewCardValue() == 21){
//            System.out.println("Player 1 won");
//            player1.setWon(true);
//        }else if(player1.totalNewCardValue() >= 17  && player1.totalNewCardValue() < 21){
//            player1.setStuck(true);
//        }
//
//        if(player2.totalNewCardValue() == 21){
//            System.out.println("Player 2 won");
//            player2.setWon(true);
//        }else if(player2.totalNewCardValue() >= 17  && player2.totalNewCardValue() < 21){
//            player2.setStuck(true);
//        }
//
//        if(player3.totalNewCardValue() == 21){
//            System.out.println("Player 3 won");
//            player3.setWon(true);
//        }else if(player3.totalNewCardValue() >= 17  && player3.totalNewCardValue() < 21){
//            player3.setStuck(true);
//        }
//
//
//        if(player1.getStuck() == true && player2.getStuck() == true && player3.getStuck() == true){
//            System.out.println("GAME ENDED");
//
//        }else{
//
//            if(player1.totalNewCardValue() > 21){
//                player1.setDisqualified(true);
//            }
//
//            if(player2.totalNewCardValue() > 21){
//                player2.setDisqualified(true);
//            }
//
//            if(player3.totalNewCardValue() > 21){
//                player3.setDisqualified(true);
//            }
//
//        }
//
//
//        List<Player> stuckPlayers = new ArrayList<>();
//
//
//
//
//
//        if(player1.getStuck() ==true){
//            stuckPlayers.add(player1);
//        }
//        if(player2.getStuck() ==true){
//            stuckPlayers.add(player2);
//        }
//        if(player3.getStuck() ==true){
//            stuckPlayers.add(player3);
//        }
//
//
//
//
//        if(player1.getWon() == true || player2.getWon() == true || player3.getWon() == true){
//
//        }else{
//
//            //create variable to hole current high score
//
//            int currentHighscore  = 0;
//
//            //create variiable to hold higes scoring player
//            Player maxplayer = null;
//
//            for(int i = 0; i < stuckPlayers.size(); i++) {
//
//                if (stuckPlayers.get(i).totalNewCardValue() > currentHighscore){
//                currentHighscore = stuckPlayers.get(i).totalNewCardValue();
//                maxplayer = stuckPlayers.get(i);
//
//                }
//
//
//            }
//            System.out.println(maxplayer.totalNewCardValue());
//            System.out.println("winner is " + maxplayer.getPlayerName());
//
//
//
//        }
//
//        for(int i = 0; i < stuckPlayers.size(); i++){
//            System.out.println("Stuck Players: " + stuckPlayers.get(i).getPlayerName());
//        }





    }

    private static List<NewCard> generateCards(List<NewCard> deck) {

        for(var suit: CardSuit.values()) {

            for(var cardValue: CardValue.values()) {

                NewCard card = new NewCard(suit,cardValue);

                deck.add(card);

            }



        }
        return deck;

    }



}