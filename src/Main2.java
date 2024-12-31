import exception.Exercice2.*;

import java.util.ArrayList;
// La methode Main de l'exercice 2
public class Main2 {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> comptes = new ArrayList<>();

        // Ajouter des comptes
        comptes.add(new CompteCourant("001", 500, "Alice", 100));
        comptes.add(new CompteEpargne("002", 1000, "Bob", 2));

        try {
            // Effectuer des opérations
            CompteBancaire aliceCompte = comptes.get(0);
            aliceCompte.deposer(200);
            System.out.println("Solde d'Alice : " + aliceCompte.afficherSolde());

            CompteBancaire bobCompte = comptes.get(1);
            aliceCompte.transferer(bobCompte, 300);
            System.out.println("Solde d'Alice après transfert : " + aliceCompte.afficherSolde());
            System.out.println("Solde de Bob après réception du transfert : " + bobCompte.afficherSolde());

            bobCompte.retirer(1500); // Cela générera une exception

        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.out.println(e.getMessage());
        }
    }
}

