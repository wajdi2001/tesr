package ClasseExercice;

public class Test {
    public static void main(String[] args) {
        Compte compte = new Compte(100);
        Operation operation = new Operation(compte,20,'A');
        Operation operation1 = new Operation(compte,10,'R');

        operation.start();
        operation1.start();

        try {
            operation.join();
            operation1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("solde final: "+compte.getSolde());
    }
}
