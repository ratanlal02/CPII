/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rlal
 */
public class Knight extends Player{

    @Override
    public String getSpecialMove() {
        return "Slash with Sword";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("Slash with Sword!");
    }
    
    @Override
    public String toString(){
        return "\n Health Point:"+ getHealthPoint() +
                "\n Score Point:"+ getScorePoint()+
                "\n Special Move:"+ getSpecialMove();
    }
}
