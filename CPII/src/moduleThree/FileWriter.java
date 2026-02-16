/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleThree;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author rlal
 */
public class FileWriter {
    public static void main(String[] args) throws FileNotFoundException{
        // false is used for replacing and true is used for appending
        FileOutputStream fos = new 
        FileOutputStream("students.txt", false);
        PrintWriter pw = new PrintWriter(fos);
        // For just writing to a file 
        //PrintWriter pw = new PrintWriter("students.txt");
//        pw.println("James");
//        pw.println("Ratan");
//        pw.println("Sasi");
//        pw.println("Steven");
//        pw.println(45);
//        pw.println(56);
//        pw.println(67);
        pw.println("James, 660-562-3455, james@gmail.com");
        pw.println("Ratan, 660-562-1555, ratan@gmail.com");
        pw.println("Sasi, 660-562-3444, sasi@nwmissouri.edu");
        pw.println("Steven, 660-562-4555, steven@nwmissouri.edu");
        pw.close();
    }
    
}
