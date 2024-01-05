package ex5;

import java.util.ArrayList;

public class Fornisseur <T>{
    private int id;
    private String nom;
    private ArrayList<Produit<T>> produits;

    public Fornisseur(int id, String nom) {

        this.id = id;
        this.nom = nom;
        this.produits =new ArrayList<>();
    }

    public void ajouter(Produit<T> produit)
    {
        if(produits.size()==0){
            produits.add(produit);
        }
        else {
        int i=0;
        while(i<produits.size()&&produit.getCode() != produits.get(i).getCode() ){
            i++;
        }
        if(i>=produits.size()){
            produits.add(produit);
        }else{
            System.out.println("le produit"+produit.getNom()+" deja dans la liste");
        }
        }
    }

    public void affiche(){
        for(Produit<T> produit: produits){
            System.out.println("code : " + produit.getCode());
            System.out.println("\nnom: " + produit.getNom());
        }
    }

}
