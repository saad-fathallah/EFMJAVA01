public class Agent extends Employe{
    private double primeResponsabilite;
    private double PrimeResponsabilite;


  public double  getprimeResponsabilite { return primeResponsabilite; }
   public void      setprimeResponsabilite { this.primeResponsabilite = primeResponsabilite; }


    public double Agent(String nom, DateTime dateNaissance, DateTime dateEmbauche, double salaireBase, double primeResponsabilite) {
        super(nom, dateNaissance, dateEmbauche, salaireBase);
        {
            this.primeResponsabilite = primeResponsabilite;
        }

        public double SalaireAPayer ()
        {
            return (salaireBase + primeResponsabilite) * (1 - IR.getIR(salaireBase * 12));
        }
    }
}

