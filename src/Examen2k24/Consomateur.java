package Examen2k24;

public class Consomateur extends Thread{
    private final Object lock =new Object();
    private Pile pile;

    public Consomateur(Pile pile){
        this.pile=pile;
    }

    @Override
    public void run() {
        while (true){
            synchronized (lock){
                while(pile.vide()){
                    try {
                        System.out.println("pile vide");
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                pile.depiler();
                lock.notifyAll();
            }

        }

    }
}
