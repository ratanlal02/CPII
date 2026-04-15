/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RLAL
 */
public class Lal {
    // Q1
    public static String[] newDeck(){
        // Body
        String[] deck = new String[52];
        // Assign Club
        for(int i=0; i < 10; i++){
            deck[i] = "Clubs";
        }
        for(int i=40; i < 43; i++){
            deck[i] = "Clubs";
        }
        // Assign Diamond
        for(int i=10; i < 20; i++){
            deck[i] = "Diamonds";
        }
        for(int i=43; i < 46; i++){
            deck[i] = "Diamonds";
        }
        // Assign Hearts
        for(int i=20; i < 30; i++){
            deck[i] = "Hearts";
        }
        for(int i=46; i < 49; i++){
            deck[i] = "Hearts";
        }
        // Assign Spades
        for(int i=30; i < 40; i++){
            deck[i] = "Spades";
        }
        for(int i=49; i < 52; i++){
            deck[i] = "Spades";
        }
        return deck;
    }
    
    // Q2
    public static String draw(String[] deck, int index){
        String card = null;
        if (index%10==0 && index <= 30){
            card = "A of " + deck[index];
        }
        else if (index == 40 || index == 43 || index==46 || index == 49){
             card =  "J of " + deck[index];
        }
        
        deck[index] = "used";
        return card;
    }
    
    // Q3
    
    public static void printCard(String[] deck, int index){
        System.out.println(draw(deck, index));
    }
    // Q4
    public static void printDeck(String[] deck){
        for (int i = 0; i < deck.length; i++){
            printCard(deck, i);
        }
    }
            
}
