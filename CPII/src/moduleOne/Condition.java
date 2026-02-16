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
public class Condition {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current temperature:");
        double temperature = scan.nextDouble();
        if (temperature < 0){
            System.out.println("Please wear approprite clothes");
        }
        else{
            System.out.println("Please wear usual clothes");
        }
        
        System.out.print("Enter your score:");
        double score = scan.nextDouble();
        if(score > 100){
            System.out.println("Invalid score");
        }
        else if(score >= 90){
            System.out.println("A");
        }
        else if (score >=80){
            System.out.println("B");
        }
        else if(score >=70){
            System.out.println("C");
        }
        else if(score >=60){
            System.out.println("D");
        }
        else if(score >=0){
            System.out.println("F");
        }
        // Else statement is not mandatory
        else{
            System.out.println("Invalid score");
        }
        
        
    }
    
}
