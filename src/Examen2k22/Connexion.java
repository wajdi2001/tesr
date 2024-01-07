package Examen2k22;

public class Connexion {
    private  Materiel materiel1;
    private Materiel materiel2;
    private String protocole;

    public Connexion(Materiel materiel1, Materiel materiel2, String protocole) throws  NullInfoException{
        if(materiel1==null || materiel2==null){
            throw new NullInfoException("les informations sont null");
        }

        this.materiel1 = materiel1;
        this.materiel2 = materiel2;
        this.protocole = protocole;
    }

public String getProtocole()  {

        return "la connexion est etablie entre "+materiel1.getLibelle()+" et "+materiel2.getLibelle()+" par le protocole "+protocole;
    }


}
