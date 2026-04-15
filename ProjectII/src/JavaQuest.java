
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author  rlal
 */
public class JavaQuest {
    
    public static void main(String[] args){
        // Create an array of String named foes 
        //and store three foes
        String[] foes = {"Zombie", "Bandit", "Lobbyist"};
        // Create an array of String named scene
        // and store four scenes
        String[] scenes = {"Nothing here...", "Nice Trees around here...",
            "Interesting cottage there...", "Potty Break..."};
        
        // Create a Player object with Knight as a default character
        Player p = new Knight();
        System.out.println("Welcome to JavaQuest!");
        System.out.println("Stay alive and increase your score!");
        System.out.println("\nChoose a character...");
        System.out.println("{k}Knight || {h}Healer || {w}Wizard || {t}Thief");
        System.out.print(">>");
        
        // Create an object of the Scaner class
        Scanner scan = new Scanner(System.in);
        
        // Read your character choice from the console
        String chr = scan.next().toLowerCase();
        // Use switch case  for creating an object of appropriate
        // character class and print a welcome message
       switch(chr){
           case "k":
               p = new Knight();
               System.out.println("Welcome Knight!");
               break;
               
           case "h":
               
           case "w":
               
           case "t":
               
           default:
                p = new Knight();
               System.out.println("Welcome Knight!");
               
       }
        
        System.out.println("\nWhat would you like to do?");
        System.out.println("{?}Status Report || {n}{s}{e}{w} Move 1 Space North, "
                        + "South, East, or West || {q}Quit ");
        System.out.print(">>");
        // Use the Scanner object created above for reading
        // actitivies that the selected player wish to do
        String choice = scan.next().toLowerCase();
        
        // Create an object of the Random class
        Random rand = new Random();
        // Use while loop to contiue the game
        // Write termination condition in the loop
        while(!(choice.equals("q") || p.getHealthPoint()<=0)){
            // Validate for the correct activity choice
            // If the activity choice is invalid, give the 
            // player chance to enter valid one
            if (!(choice.equals("n") || choice.equals("s") || 
                    choice.equals("e")|| choice.equals("w") || choice.equals("?"))){
                System.out.println("You have selected a wrong choice please select a correct choice");
                choice = scan.next().toLowerCase();
                continue;
            }
            
            // if choice is for status, display status and ask
            // for the next activity
            if(choice.equals("?")){
                System.out.println(p);
                System.out.println("\nWhat would you like to do?");
                System.out.println("{?}Status Report || {n}{s}{e}{w} Move 1 Space North, "
                        + "South, East, or West || {q}Quit ");
                System.out.print(">>");
                choice = scan.next().toLowerCase();
                continue;
            }
            
           
            // 20% of the time attack is chosen 
            //(5th move is attacked if the random number is 4)
             int move = rand.nextInt(5);
             
            // Use selection, to print scene for the move
            // and increase score of the player
            // otherwise the player is attacked
            if (move <4){
                System.out.println("Player is chosen to move "+ scenes[move]);
                p.incScorePoint();
            }
            else{
                System.out.println("Oh no! You are being attacked by a "+foes[rand.nextInt(3)]+"!");
                System.out.println("How would you like to handle this?");
                System.out.println("{s}Special Move || {r}Run!");
                System.out.print(">>");
                // Read handle option from the console 
                String what = scan.next().toLowerCase();
                // If run option is chosen, run will be successful 
                // 50% times, 
                // if it is successful, increase the score and continue 
                // the game, otherwise flee attempt unsuccessful
                
                
                System.out.println("Prepare for battle!");
                System.out.println("Press any letter then ENTER to continue...");
                // Read entered letter from the console
                
                // Player is in the battle field and use special move
                // In the battle field, the player wins 60% times
                // and lose 40% times
                // If player wins, increase two score points and player win.
                // Otherwise, player lose, decrease 1 health point.
                
                // If the player has no health point, display 
                // "sorry, you ran out of health!" and come out of the loop
                
            } 
            System.out.println("\nWhat would you like to do?");
            System.out.println("{?}Status Report || {n}{s}{e}{w} Move 1 Space North, "
                    + "South, East, or West || {q}Quit ");
            System.out.print(">>");
            // Use the Scanner object created above for reading
            // actitivies that the selected player wish to do     
        }
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println("The game has come to an end! Your final stats: ");
        System.out.println(p);
        System.out.println("Thanks for playing!");
    }
}
