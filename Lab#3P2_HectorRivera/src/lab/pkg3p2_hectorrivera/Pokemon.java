/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3p2_hectorrivera;

/**
 *
 * @author hrolriverav
 */
public class Pokemon {
    protected String name;
    protected int numEntry;
    protected String nature;
    protected boolean captured = false;
    protected Pokeball MiPokeball;

    public Pokemon() {
    }

    public Pokemon(String name, int numEntry, String nature, Pokeball MiPokeball) {
        this.name = name;
        this.numEntry = numEntry;
        this.nature = nature;
        this.MiPokeball = MiPokeball;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumEntry() {
        return numEntry;
    }

    public void setNumEntry(int numEntry) {
        this.numEntry = numEntry;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public boolean isCaptured() {
        return captured;
    }

    public void setCaptured(boolean captured) {
        this.captured = captured;
    }

    public Pokeball getMiPokeball() {
        return MiPokeball;
    }

    public void setMiPokeball(Pokeball MiPokeball) {
        this.MiPokeball = MiPokeball;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "name=" + name + ", numEntry=" + numEntry + ", nature=" + nature + ", captured=" + captured + ", MiPokeball=" + MiPokeball + '}';
    }
    
    
}
