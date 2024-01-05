package Examen2k22;


public class Materiel {
    private String numSerie;
    private String libelle;
    public Materiel(String numSerie, String libelle) throws NullInfoException{
        if(numSerie==null || libelle==null){
            throw new NullInfoException("les informations sont null");
        }
        this.numSerie = numSerie;
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
