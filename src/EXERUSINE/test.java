package EXERUSINE;

public class test {
    public static void main(String[] args) {
        Product p = new Product(2);
        Ouvrier o1 = new Ouvrier(1, p);
        Ouvrier o2 = new Ouvrier(2, p);
        Ouvrier o3 = new Ouvrier(3, p);
        o1.start();
        o2.start();
        o3.start();
    }
}
