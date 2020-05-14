/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupa_x.java_projekt;

/**
 *
 * @author Jan
 */
public class Budynek implements Powierzchnia{

    int powierzchniaDzialki;
    Pietro[] pietra = new Pietro[1];
    Garaz[] garaze = new Garaz[1];



    /*
        Zlicza pole garazu i pola piętra
        POLE DZIAŁKI NIE JEST WLICZANE DO POLA POWIERZCHNI BUDYNKU
    */
    @Override
    public int policzPole() {
        return pietra[0].policzPole() + garaze[0].policzPole();
    }
}
