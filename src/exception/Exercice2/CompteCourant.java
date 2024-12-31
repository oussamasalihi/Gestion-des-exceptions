package exception.Exercice2;

public class CompteCourant extends CompteBancaire{

    private double decouvertAutorise;

    public CompteCourant(String numeroCompte, double solde, String nomTitulaire, double decouvertAutorise) {
        super(numeroCompte, solde, nomTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) throws FondsInsuffisantsException {
        if (solde + decouvertAutorise < montant) {
            throw new FondsInsuffisantsException();
        }
        solde -= montant;
    }
}
