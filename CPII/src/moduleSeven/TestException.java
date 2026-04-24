/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleSeven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rlal
 */
public class TestException {
    public static void main(String[] args) throws FileNotFoundException
    {
        try{
            Scanner scan = new Scanner(new File("students.txt"));
            while(scan.hasNextInt()){
                int grade = scan.nextInt();
                if(grade <= 0){
                    throw new GradeException("Invalid grade");
                }
            }
        }
        catch(InputMismatchException e){
            System.out.println("File does not exist");
        }
        catch(GradeException e){
            System.out.println("Grade is invalid");
        }
        catch(Exception e){
            System.out.println("File does not exist");
        }
       
        System.out.println("Program is ended");
    }
    
}
