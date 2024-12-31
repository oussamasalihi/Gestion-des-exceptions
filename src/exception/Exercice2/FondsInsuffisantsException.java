package exception.Exercice2;

// Classe d'exception personnalisée
public class FondsInsuffisantsException extends Exception{
    public FondsInsuffisantsException() {
        super("Insufficient funds for the operation.");
    }
}
