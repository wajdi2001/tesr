package Examen2k22;

import java.util.concurrent.Semaphore;

public class Imprimante extends Materiel implements Role{
    public Semaphore lock=new Semaphore(3);

    public Imprimante(String numSerie, String libelle)  {
        super(numSerie, libelle);
    }

    @Override
    public String defineRole() {
        return "imprimente";
    }


    public void imprimer(String doc){
        try {
            lock.acquire();
            System.out.println("impression du document "+doc);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.release();
        }
    }
}
