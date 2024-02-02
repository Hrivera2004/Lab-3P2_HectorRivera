/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3p2_hectorrivera;

/**
 *
 * @author hrolriverav
 */
public class FireType extends Pokemon{
    private int power;

    public FireType() {
    }
    public FireType(int power, String name, int numEntry, String nature) {
        super(name, numEntry, nature);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "FireType{" + "Fire power=" + power + '}';
    }
    
    
    
}
