package org.example;

public class Rechteck {
private final int laenge;
private final int breite;

    public Rechteck(int laenge, int breite){
            this.breite = breite;
            this.laenge = laenge;
        }
     public Rechteck(int seite){
        this.breite = seite;
        this.laenge = seite;
     }
    public void create(){
        System.out.println("länge: " + laenge + "\n" + "Breite: " + breite);
    }

}
