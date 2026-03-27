/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleFive;

import java.util.ArrayList;

/**
 *
 * @author rlal
 */
public class TestArrayList {
    
    public static void main(String[] agrs){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add 5 in the list
        list.add(5);
        list.add(10);
        list.add(15);
        // add 7 at index 1
        list.add(1, 7);
        // display element at index 1
        System.out.println(list.get(1));
        // remove element at index 1
        list.remove(1);
        // Write code to display the list
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        list.set(0, 7);
        for(Integer x : list){
            System.out.print(x +" ");
        }
        
        
        
    }
}
