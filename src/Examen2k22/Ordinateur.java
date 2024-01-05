package Examen2k22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ordinateur extends Materiel implements Role,Runnable{
    private  String nom;
    private String marque;
    private String adresseIp;
    private Imprimante imprimante;
    private String cheminFile;
    private final int time=1000;


    public Ordinateur(String numSerie, String libelle, String nom, String marque, String adresseIp) throws NullInfoException {
        super(numSerie, libelle);

        this.nom = nom;
        this.marque = marque;
        this.adresseIp = adresseIp;
    }

    public  static  void sauvgarderOrdinateur(ArrayList<Ordinateur> ordinateurs, String nomFichier){
        try {
            ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(nomFichier));
            oos.writeObject(ordinateurs);
            oos.close();
            System.out.println("sauvgarde reussie");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void setImprimante(Imprimante imprimante) {
        this.imprimante = imprimante;
    }


    public void setCheminFile(String cheminFile) {
        this.cheminFile = cheminFile;
    }

    @Override
    public String defineRole() {
        return "PC";
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(imprimante!=null && cheminFile!=null) {
            
            this.imprimante.imprimer(this.cheminFile);
        }
    }
}
