package Examen2k22;

public class Imprimante extends Materiel implements Role{
    final Object lock =new Object();

    public Imprimante(String numSerie, String libelle) throws NullInfoException {
        super(numSerie, libelle);
    }

    @Override
    public String defineRole() {
        return "imprimente";
    }


    public void imprimer(String doc){
        synchronized (lock){

            System.out.println("impression du document "+doc);
            lock.notifyAll();
        }
    }
}
