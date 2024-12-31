package exception.Exercice2;

public class CompteInexistantException extends Exception{
    public CompteInexistantException() {
        super("Account does not exist.");
    }
}
