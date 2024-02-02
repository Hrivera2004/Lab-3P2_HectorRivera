/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3p2_hectorrivera;

/**
 *
 * @author hrolriverav
 */
public class WaterType extends Pokemon{
    private boolean outOfWater;
    private int speed;

    public WaterType(boolean outOfWater, int speed, String name, int numEntry, String nature) {
        super(name, numEntry, nature);
        this.outOfWater = outOfWater;
        this.speed = speed;
    }

    public WaterType() {
    }

    public boolean isOutOfWater() {
        return outOfWater;
    }

    public void setOutOfWater(boolean outOfWater) {
        this.outOfWater = outOfWater;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString()+"WaterType{" + "outOfWater=" + outOfWater + ", speed=" + speed + '}';
    }
    
    
}
