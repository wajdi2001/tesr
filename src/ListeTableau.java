import java.util.ArrayList;

public class ListeTableau<T> implements ListeGenerique<T>{
    ArrayList<T> tab;

    public ListeTableau(ArrayList<T> tab) {
        this.tab = tab;
    }

    @Override
    public void ajouter(T element)
    {
            tab.add(element);

    }

    @Override
    public T getElement(int i) {
        return tab.get(i);
    }

    @Override
    public int tailleTab() {
        return tab.size();
    }
}
