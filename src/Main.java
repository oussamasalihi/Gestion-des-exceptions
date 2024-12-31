import exception.Exercice1.EntierNaturel;
import exception.Exercice1.NombreNegatifException;

// La methode Main de l'exercice 1
public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel entier = new EntierNaturel(5);
            System.out.println("Valeur : " + entier.getVal());

            entier.decrementer();
            System.out.println("Valeur après décrémentation : " + entier.getVal());

            entier.setVal(-3); // Cela générera une exception
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage());
            System.out.println("Valeur erronée : " + e.getErroneousValue());
        }
    }
}