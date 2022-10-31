import java.text.DateFormat;

public class Employe implements IEmploye {


    private int _mtle;
    private String nom;
    private double salaireBase;
    private int dateNaissance, dateEmbauche;

    public int get_mtle() {
        return _mtle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void set_mtle(int _mtle) {
        this._mtle = _mtle;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public Employe() {
        this._mtle = 0;
        this.nom = "";
        this.salaireBase = 0;
        this.dateNaissance = 0;
        this.dateEmbauche = 0;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "_mtle=" + _mtle +
                ", nom='" + nom + '\'' +
                ", salaireBase=" + salaireBase +
                ", dateNaissance=" + dateNaissance +
                ", dateEmbauche=" + dateEmbauche +
                '}';
    }
    public boolean equals(Object o){
        Employe e = (Employe) o;
        if (e .get_mtle()==((Employe) o)._mtle){
        return false;

    }else {
            return true;
        }

}

    public int Age()
    {
        TimeSpan ts = DateTime.Now - _dateNaissance;
        return (int)ts.TotalDays / 365;
    }
    public int Anciennete()
    {
        TimeSpan ts = DateTime.Now - _dateEmbauche;
        return (int)ts.TotalDays / 365;
    }
    public DateTime DateRetraite(int ageRetraite)
    {
        TimeSpan ts = new TimeSpan(ageRetraite*365,0,0,0);
        DateTime dateRetraite = new DateTime(_dateNaissance.Year, _dateNaissance.Month, _dateNaissance.Day).Add(ts);
        return dateRetraite;
    }


    }




