package REV_11_09.Animais;

public class AnimalUtils {
    public static void verificarDomestico(Animais animal) {
        if (animal instanceof Domestico) {
            System.out.println("O animal é doméstico.");
        } else {
            System.out.println("O animal não é doméstico.");
        }
    }
}