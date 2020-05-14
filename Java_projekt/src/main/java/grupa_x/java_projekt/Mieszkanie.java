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
public class Mieszkanie extends ElementPietra{

    String wizytowka;
    Pomieszczenia[] pomieszczenia = new Pomieszczenia[2];

    /*
       metoda zliczająca pole dwóch pomieszczeń
   */
    @Override
    public int policzPole() {
        return pomieszczenia[0].policzPole() + pomieszczenia[1].policzPole();
    }


}
