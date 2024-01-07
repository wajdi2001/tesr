package Examen2k24;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>(10);
        Pile pile = new Pile(tab,10);
        Producteur producteur = new Producteur(pile,10);
        Producteur producteur1 = new Producteur(pile,20);
        Consomateur consomateur = new Consomateur(pile);

        producteur.start();
        consomateur.start();

        try {
            producteur.join();
            consomateur.join();
            producteur1.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
