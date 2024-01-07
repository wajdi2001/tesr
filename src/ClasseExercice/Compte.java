package ClasseExercice;

public class Compte {
    private final Object lock =new Object();
    private int solde;

    public Compte(int solde) {
        this.solde = solde;
    }

    public int getSolde() {
        return solde;
    }

    public void ajout(int montant){
        synchronized (lock){
            solde+=montant;
            lock.notifyAll();
        }
    }

    public void retirer(int montant){
        synchronized (lock){
            while (getSolde()<=0){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            solde -= montant;
            lock.notifyAll();
        }
    }
}
