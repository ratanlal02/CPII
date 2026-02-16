/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleThree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author rlal
 */
public class FileReader {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("students.txt");
        Scanner scan = new Scanner(file);
        int total = 0;
//        while(scan.hasNext()){
//            if (scan.hasNextInt()){
//                total += scan.nextInt();
//            }
//            else{
//            System.out.println(scan.next());
//            }
//        }
//        System.out.println("Total:"+ total);
         while(scan.hasNextLine()){
            String custInfo = scan.nextLine();
            Scanner input = new Scanner(custInfo);
            input.useDelimiter(",");
            input.next();
            //input.next();
             System.out.println(input.next());
        }
        
    }
}
