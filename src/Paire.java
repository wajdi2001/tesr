import java.util.ArrayList;

public class Paire <T,V>{
    private ArrayList<T> premier;
    private ArrayList<V> deuxieme;


    public Paire(ArrayList<T> premier, ArrayList<V> deuxieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
    }

    public void ajouter(T element)
    {
        premier.add(element);
    }

    public T getElement(int i) {
        return premier.get(i);
    }

    public int tailleTab() {
        return premier.size();
    }









    public void ajouter1(V element)
    {
        deuxieme.add(element);

    }
    public V getElement1(int i) {
        return deuxieme.get(i);
    }
    public int tailleTab1() {
        return deuxieme.size();
    }

}
