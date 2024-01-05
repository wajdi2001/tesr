import ex5.Fornisseur;
import ex5.Produit;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> entier = new ArrayList<Integer>();
//        ArrayList<Double> doubless=new ArrayList<Double>();
//        ListeTableau<Integer> TabInt =new ListeTableau<Integer>(entier);
//        ListeTableau<Double> TabDouble =new ListeTableau<Double>(doubless);
//        TabInt.ajouter(5);
//        TabDouble.ajouter(5.2);
//        TabDouble.ajouter(7.1);
////        System.out.println(TabInt.getElement(0));
////        System.out.println(TabDouble.getElement(0));
////        System.out.println(TabDouble.tailleTab());
//        Paire<Integer,Double>paire=new Paire<Integer,Double>(entier,doubless);
//        System.out.println(paire.tailleTab());
//        System.out.println(paire.tailleTab1());
//        System.out.println(paire.getElement(0));
//        System.out.println(paire.getElement1(0));
//        paire.ajouter(5);
//        paire.ajouter1(5.258);
//        System.out.println(paire.tailleTab());
//        System.out.println(paire.tailleTab1());
        Produit<String> produit1 = new Produit<String>(1,"produit1");
        Produit<String> produit2 = new Produit<String>(2,"produit2");
        Produit<String> produit3 = new Produit<String>(3,"produit3");
        Produit<String> produit4 = new Produit<String>(4,"produit4");
        Produit<String> produit5 = new Produit<String>(5,"produit5");
        Produit<String> produit6 = new Produit<String>(5,"produit6");

        Fornisseur<String> fornisseur = new Fornisseur<String>(124587,"etteyb");
        fornisseur.ajouter(produit1);
        fornisseur.ajouter(produit2);
        fornisseur.ajouter(produit3);
        fornisseur.ajouter(produit4);
        fornisseur.ajouter(produit5);
        fornisseur.ajouter(produit6);
        fornisseur.affiche();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");

            }
        });
        thread.setDaemon(true);
        thread.start();

        System.out.println(thread.isDaemon());








    }
}