/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rlal
 */
public abstract class Player {
    private int healthPoint = 10;
    private int scorePoint = 0;
    
    public abstract String getSpecialMove();
    
    public abstract void useSpecialMove();

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
    
    public void incHealthPoint(){
        
    }
    public void decHealthPoint(){
    
    }
    
    public void incScorePoint(){
    
    }
    
    public void decScorePoint(){
    
    }
    
}
