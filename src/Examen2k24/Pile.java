package Examen2k24;

import java.util.ArrayList;

public class Pile {
    private ArrayList<Integer> tab;
    private int taille;

    public Pile(ArrayList<Integer> tab, int taille) {
        this.tab = tab;
        this.taille = taille;
    }

    public boolean vide(){
        return tab.isEmpty();
    }

    public int getTaille() {
        return taille;
    }

    public void empiler(int entier){
        if(tab.size()==taille){
            System.out.println("tab plein");
        }else {
            tab.add(entier);
            System.out.println("ajout avec succées");
        }
    }

    public int getSizeTab() {
        return tab.size();
    }

    public void depiler(){
        if(tab.isEmpty()){
            System.out.println("Tableau vide");
        }else{
            System.out.println("l'element a depiler : "+sommet());
            tab.removeLast();
        }
    }

    public int sommet(){
        return tab.getLast();
    }



}
