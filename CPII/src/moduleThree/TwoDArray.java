/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleThree;

import java.util.Scanner;

/**
 *
 * @author RLAL
 */
public class TwoDArray {
    
    public static void main(String[] args){
        
        // This will be used when you know the data
        int[][] weightArray = {{87, 85, 83, 82},
                                {75, 74, 73, 71},
                                {65, 63, 61},
                                {100, 95, 90, 85, 80}
                                };
        /*
        int[][] weightArray = new int[5][4];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < weightArray.length; i++){
            System.out.println("Weight for User "+ (i+1));
            for(int j = 0; j < weightArray[i].length; j++){
                System.out.print("    Enter weight after "
                        +j+" month: ");
                weightArray[i][j] = scan.nextInt();
            }
        }
        */
        
        for(int i = 0; i < weightArray.length; i++){
            System.out.println(" ");
            for(int j = 0; j < weightArray[i].length; j++){
                System.out.print(weightArray[i][j] +" ");
            }
        }
        System.out.println("");
        // print average for 0th index row of weightArray
        int sum = 0;
        for(int k=0; k < weightArray[0].length; k++){
            sum += weightArray[0][k];
        }
        System.out.println("Average:"+ 
                (double)sum/weightArray[0].length);
        
        // print average for 2nd index column of weightArray
        sum = 0;
        for(int k=0; k < weightArray.length; k++){
            if (3 < weightArray[k].length)
                sum += weightArray[k][3];
        }
        System.out.println("Average:"+ 
                (double)sum/weightArray.length);      
    }
}