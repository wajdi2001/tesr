package Examen2k24;

public class Producteur extends Thread{
    private final Object lock =new Object();
    private Pile pile;
    private int entier;

    public Producteur(Pile pile,int entier){
        this.pile=pile;
        this.entier=entier;
    }

    @Override
    public void run() {
        while (true){
        synchronized (lock){
            while(pile.getSizeTab()>=pile.getTaille()){
                try {
                    System.out.println("pile plein");
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            pile.empiler(entier);
            lock.notifyAll();
        }

    }}
}
