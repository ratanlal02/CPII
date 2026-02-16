/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleTwo;

/**
 *
 * @author rlal
 */
public class Calculator {
    public static double squareRoot(double x){
        return Math.sqrt(x);
    }
    
    public static double sqrtMultiplyPow2(double x){
        return Math.sqrt(x)*Math.pow(x,2);
    }
    
    public static double sqrtMultiplyPow2Ofsqrt(double x){
        return sqrtMultiplyPow2(squareRoot(x));
    }
}
