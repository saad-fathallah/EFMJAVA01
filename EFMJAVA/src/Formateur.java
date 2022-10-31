public class Formateur extends Employe{
    private int _heureSup;
    private  double remunerationHSup = 70.00;
    public  double RemunerationHSup;{
        get_remunerationHSup(){ return remunerationHSup;
        }
        set_remunerationHSup { this.RemunerationHSup=RemunerationHSup; }
    }
    public Formateur(String nom, DateTime dateNaissance, DateTime dateEmbauche, double salaireBase, int heureSup){
        super(  (nom, dateNaissance, dateEmbauche, salaireBase));

    }
    public static double SalaireAPayer() {
        int NbreHS = _heureSup;
        if (NbreHS >= 30)
            NbreHS = 30;
        return (salaireBase + NbreHS*remunerationHSup) * (1 - IR.getIR(salaireBase*12));
    }

    public String ToString()
    {
        return super.ToString()+"-"+_heureSup;
    }


}
