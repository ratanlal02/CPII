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
        /*
        // This will be used when you know the data
        int[][] weightArray = {{87, 85, 83, 82},
                                {75, 74, 73, 71},
                                {65, 63, 61},
                                {100, 95, 90, 85, 80}
                                };
        */
        int[][] weightArray = new int[5][4];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < weightArray.length; i++){
            System.out.println("Weight for User "+ (i+1));
            for(int j = 0; j < weightArray[i].length; j++){
                System.out.print("    Enter weight after "
                        +j+" month");
                weightArray[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0; i < weightArray.length; i++){
            System.out.println(" ");
            for(int j = 0; j < weightArray[i].length; j++){
                System.out.print(weightArray[i][j] +" ");
            }
        }
    }
}