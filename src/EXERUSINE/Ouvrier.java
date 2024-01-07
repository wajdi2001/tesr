package EXERUSINE;

public class Ouvrier extends Thread{
    int id;
    Product P;

    public Ouvrier(int id, Product P){
        this.id=id;
        this.P= P ;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            P.assemblage(id);
        }
    }
}
