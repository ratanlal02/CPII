/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleOne;

import java.util.Scanner;

/**
 *
 * @author rlal
 */
public class InputReading {
    public static void main(String[] args){
        // Create an object of the Scanner class
        // Declaration of Scanner reference variable
        Scanner scan;
        // Instantiate Scanner reference variable
        scan = new Scanner(System.in);
        System.out.print("Enter your name:");
        String firstName = scan.next();
        String lastName = scan.next();
        System.out.print("Enter your description:");
        scan.nextLine();
        String desc = scan.nextLine();
        
        System.out.print("Enter your age:");
        int age = scan.nextInt();
        System.out.println(lastName+","+firstName+","+
                age+"\n"+ desc);
    }
    
}
