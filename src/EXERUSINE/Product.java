package EXERUSINE;

import java.util.concurrent.Semaphore;

public class Product {
    Semaphore s ;

    public Product(int s) {
        this.s = new Semaphore(s, true);
    }
    public  void assemblage(int id){
        try {
            s.acquire();
            System.out.println("le produit est assemblé par l'ouvrier n:"+id);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            s.release();
            System.out.println("fin de l'assemblage");


    }
}
