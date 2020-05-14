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
public class main {
     public static void main(String[] args) {
        Pomieszczenia[] mojePomieszczenia = {
            new Pomieszczenia() {
                {
                    szerokosc = 3;
                    dlugosc = 2;
                    nazwa = "pokoj";
                }
            },
            new Pomieszczenia() {
                {
                    szerokosc = 2;
                    dlugosc = 2;
                    nazwa = "lazienka";
                }
            }
        };

        Mieszkanie mojeMieszkanie = new Mieszkanie() {
            {
                pomieszczenia = mojePomieszczenia;
                wizytowka = "Kowalscy";

            }
        };
        ElementPietra[] mojeElementyParteru = {
            mojeMieszkanie, new Pomieszczenia() {
                {
                    szerokosc = 2;
                    dlugosc = 2;
                    nazwa = "suszarnia";
                }
            }
        };
        Pietro[] mojePietra = {
            new Pietro() {
                {
                    elementy = mojeElementyParteru;
                    numerPietra = 0;

                }
            }
        };
        Garaz[] mojeGaraze = {
            new Garaz() {
                {
                    szerokoscBramy = 3;
                    dlugoscBramy = 2;
                    szerokosc = 5;
                    dlugosc = 5;
                }
            }
        };
        Budynek mojBudynek = new Budynek() {
            {
                powierzchniaDzialki = 20;
                pietra = mojePietra;
                garaze = mojeGaraze;
            }
        };
        System.out.println(mojBudynek.policzPole());
    }
}
