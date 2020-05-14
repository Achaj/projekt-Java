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
public class Pietro implements Powierzchnia {

    int podajiloscPomieszczen;
    ElementPietra[] elementy = new ElementPietra[2];
    int numerPietra;

     /*
        metoda  zwraca polę powierzchni mieszkania i dodaje do nie jeszcze pomieszczeni suszarnia
    */

    @Override
    public int policzPole() {
        return elementy[0].policzPole() + elementy[1].policzPole();
    }
    
}
