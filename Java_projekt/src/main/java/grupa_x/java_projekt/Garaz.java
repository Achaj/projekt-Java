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
public class Garaz extends Pomieszczenia {

    int dlugoscBramy;
    int szerokoscBramy;

    /*
        aby obliczyć pole garażu wywołujemy metode dziedzczoną nastenie od tej wartości odejmijemy pole bramy
     */
    @Override
    public int policzPole() {
        return super.policzPole() - (szerokoscBramy * dlugoscBramy);
    }

}
