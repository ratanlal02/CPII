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
public class Selection {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a first number:");
        int firstNumber = scan.nextInt();
        System.out.print("Enter a second number:");
        int secondNumber = scan.nextInt();
        System.out.print("Enter A/S/M/D or +/-/*// for add/substract/muliply/division:");
        String op = scan.next();
        switch(op){
            case "A":
            case "+":
                System.out.println("Result:"+(firstNumber+secondNumber));
                break;
            case "S":
            case "-":
                System.out.println("Result:"+(firstNumber-secondNumber));
                break;
            case "M":
            case "*":
                System.out.println("Result:"+(firstNumber*secondNumber));
                break;
            default:
                System.out.println("Wrong operator");
            case "D":
            case "/":
                System.out.println("Result:"+((double)firstNumber/secondNumber));
                break;
            
        }
     
        
    }
}
