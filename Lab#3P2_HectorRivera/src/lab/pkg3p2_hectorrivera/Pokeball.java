/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3p2_hectorrivera;

/**
 *
 * @author hrolriverav
 */
public class Pokeball {
    private String color;
    private int serie;
    private int efective;

    public Pokeball() {
    }
    
    public Pokeball(String color, int serie, int efective) {
        this.color = color;
        this.serie = serie;
        this.efective = efective;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getEfective() {
        return efective;
    }

    public void setEfective(int efective) {
        this.efective = efective;
    }

    @Override
    public String toString() {
        return "Pokeball{" + "color=" + color + ", serie=" + serie + ", efective=" + efective + '}';
    }
}
