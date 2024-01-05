public class Calculateur {

    public static <T> double somme(T[] elements){
        double s = 0.0;
        int i=0;
        while (i<elements.length){
            if(elements[i] instanceof  Integer)
                s+=(Integer) elements[i];
            else if(elements[i] instanceof Double)
                s+=(double) elements[i];
            i++;
        }

        return s;
    }
}
