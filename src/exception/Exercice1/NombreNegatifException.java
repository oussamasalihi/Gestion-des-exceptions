package exception.Exercice1;

public class NombreNegatifException extends Exception {
    private int erroneousValue;

    public NombreNegatifException(int value) {
        super("Valeur négative non autorisée: " + value);
        this.erroneousValue = value;
    }

    public int getErroneousValue() {
        return erroneousValue;
    }
}
