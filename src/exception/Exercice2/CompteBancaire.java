package exception.Exercice2;

public class CompteBancaire {
    protected String numeroCompte;
    protected double solde;
    protected String nomTitulaire;

    public CompteBancaire(String numeroCompte, double solde, String nomTitulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) throws FondsInsuffisantsException {
        if (solde < montant) {
            throw new FondsInsuffisantsException();
        }
        solde -= montant;
    }

    public double afficherSolde() {
        return solde;
    }

    public void transferer(CompteBancaire destinataire, double montant) throws FondsInsuffisantsException, CompteInexistantException {
        if (destinataire == null) {
            throw new CompteInexistantException();
        }
        this.retirer(montant);
        destinataire.deposer(montant);
    }
}
