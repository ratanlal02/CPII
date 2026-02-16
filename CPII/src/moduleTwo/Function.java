/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleTwo;

/**
 *
 * @author rlal
 */
public class Function {
    public static int Max=5;
    // Write a static method for addition of two integers
    public static int add(int x, int y){
        return x+y;
    }
    
    // Write a static method for substraction of two integers
    public static int substract(int x, int y){
        return x-y;
    }
    
    // Write a static method for multiplication of two integers
    public static int multiply(int x, int y){
        return x*y;
    }
    
    // Write a static method for division of two integers
    public static double division(int x, int y){
        return (double)x/y;
    }
    
    public static void main(String[] args){
        int x = 5;
        int y = 3;
        System.out.println(add(x,y));
        System.out.println(substract(x,y));
        System.out.println(multiply(x,y));
        System.out.println(division(x,y));
        System.out.println(Calculator.squareRoot(x));
        System.out.println(Calculator.sqrtMultiplyPow2(x));
        System.out.println(Calculator.sqrtMultiplyPow2Ofsqrt(4));
        
    
    }
}
