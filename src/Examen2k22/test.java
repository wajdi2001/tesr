package Examen2k22;

public class test {
    public static void main(String[] args) {
        try {
            Ordinateur ordinateur1 = new Ordinateur("123", "ordi1","pcettyeb","lenovo","0.0.0.0");
            Ordinateur ordinateur2 = new Ordinateur("123h52c", "ordi1","pcAla","dell","0.0.0.1");
            Ordinateur ordinateur3 = new Ordinateur("12656dzc3", "ordi1","pcmonir","msi","0.0.0.2");
            Ordinateur ordinateur4 = new Ordinateur("12cz523", "ordi1","pcbelegcem","asus","0.0.0.3");
            Ordinateur ordinateur5 = new Ordinateur("122247zcz3", "ordi1","pcwajih","hp","0.0.0.4");
            Thread thread1 = new Thread(ordinateur1);
            Thread thread2 = new Thread(ordinateur2);
            Thread thread3 = new Thread(ordinateur3);
             Thread thread4 = new Thread(ordinateur4);
            Thread thread5 = new Thread(ordinateur5);
            Imprimante imprimante = new Imprimante("123", "imprimante1");
            ordinateur1.setImprimante(imprimante);
            ordinateur2.setImprimante(imprimante);
            ordinateur3.setImprimante(imprimante);
            ordinateur4.setImprimante(imprimante);
            ordinateur5.setImprimante(imprimante);
            ordinateur1.setCheminFile("doc1");
            ordinateur2.setCheminFile("doc2");
            ordinateur3.setCheminFile("doc3");
            ordinateur4.setCheminFile("doc4");
            ordinateur5.setCheminFile("doc5");
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();

            System.out.println("Ecxecution terminée");


        } catch (NullInfoException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
