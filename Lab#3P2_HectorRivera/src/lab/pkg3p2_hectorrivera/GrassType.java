/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3p2_hectorrivera;

/**
 *
 * @author hrolriverav
 */
public class GrassType extends Pokemon{
    private String habitat;
    private int Dominio;

    public GrassType() {
    }

    public GrassType(String habitat, int Dominio, String name, int numEntry, String nature) {
        super(name, numEntry, nature);
        this.habitat = habitat;
        this.Dominio = Dominio;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDominio() {
        return Dominio;
    }

    public void setDominio(int Dominio) {
        this.Dominio = Dominio;
    }

    @Override
    public String toString() {
        return super.toString()+"GrassType{" + "habitat=" + habitat + ", Dominio=" + Dominio + '}';
    }
    
    
}
