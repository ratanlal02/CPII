/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleThree;

/**
 *
 * @author RLAL
 */
public class OneDArray {
    
    public static void main(String[] args){
        // Create an array of int of length 10
        
        int[] numArray = new int[10];
        
        // Store integers from 1 to 10 in the above array
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = i + 1;
        }
        
        // Print all the elements of numArray
        for(int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i]+" ");
        }
        
        // Write code to find the maximum integer in numArray
        int max = numArray[0];
        for(int i = 1; i < numArray.length; i++){
            if(max < numArray[i]){
                max = numArray[i];
            }
        }
        System.out.println("Max:"+ max);
        
        // print the last element of numArray
        System.out.println(numArray[numArray.length-1]);
        
        
        
    }
    
}
