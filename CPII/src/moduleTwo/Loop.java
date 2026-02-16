/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleTwo;

/**
 *
 * @author rlal
 */
public class Loop {
    public static void main(String[] args){
        /*
        int x =5;
        int y = 5;
        do{
            y = 2*x;
        }while(x<=5);
        System.out.println(y);
        */
        // Print all even numbers between 2 and 20 (included)
        for(int i=2; i<=20; i+=2){
            System.out.print(i+", ");
        }
        System.out.println("");
        int level = 1;
        int i = 1;
        while(level <=6){
            System.out.print(i+", ");
            i*=2;
            level += 1;
        }
        
    }
}
