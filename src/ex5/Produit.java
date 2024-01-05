package ex5;

public class Produit <T>{
    private int code ;
    private String nom;

    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public Produit(int code, String nom) {
        this.code = code;
        this.nom = nom;
    }
}
