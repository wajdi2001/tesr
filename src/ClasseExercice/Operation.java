package ClasseExercice;

public class Operation extends Thread{
    private Compte compte;
    private int montant;
    private char type;

    public Operation(Compte compte,int montant,char type){
        this.compte=compte;
        this.montant=montant;
        this.type=type;
    }


    @Override
    public void run() {
        if(type=='A'){
            for (int i=0;i<20;i++){
                compte.ajout(montant);
            }
        } else if (type=='R') {
            for (int i=0;i<20;i++){
                compte.retirer(montant);
            }
        }else {
            System.out.println("veuillez choisir votre type");
        }
    }
}
