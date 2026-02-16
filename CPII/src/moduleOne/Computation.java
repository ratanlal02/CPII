/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleOne;

import java.util.Random;

/**
 *
 * @author rlal
 */
public class Computation {
    public static void main(String[] args){
        /*
        int x = 5;
        int y = x++ + ++x;
        System.out.println(y+","+x);
        int z = x-- + --x;
        System.out.println(z+","+x);
        int w = x++ + ++x + x-- + --x;
        System.out.println(z+","+x);
        */
        // Compute 3.5^4
        System.out.println(Math.pow(2.5, 4));
        // Round of 4.49
        System.out.println(Math.round(4.5));
        // Use random function between 1 and 6 (both included)
        System.out.println((int)(Math.random()*6)+1);
        // Random class
        Random r = new Random();
        System.out.println(r.nextInt(6)+1);
        // Random number between 4 and 24 (both included)
        System.out.println(r.nextInt(20)+4);
       
        
        
        
        
    }
}
