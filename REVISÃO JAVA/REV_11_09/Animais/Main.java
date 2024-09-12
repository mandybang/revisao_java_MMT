/**Crie um programa em Java que siga os seguintes passos:
Crie uma classe abstrata chamada Animal que tenha os seguintes métodos:
void fazerSom() (método abstrato).
void dormir() (método concreto que imprime "O animal está dormindo").
Crie uma interface chamada Domestico com o método:
void brincar().
Crie duas classes:
Cachorro, que herda de Animal e implementa Domestico.
Gato, que herda de Animal e implementa Domestico.
Crie uma classe estática chamada AnimalUtils com um método:
void verificarDomestico(Animal animal) que verifica se o animal é doméstico (usando o operador instanceof).
Na classe Principal, crie instâncias de Cachorro e Gato, chame os métodos definidos e utilize a classe AnimalUtils.
 */

 package REV_11_09.Animais;
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando instâncias de Cachorro e Gato
        System.out.println("Qual é o seu animal? (Cachorro/Gato)");
        String animalTipo = scanner.nextLine();

        System.out.println("Qual é o nome dele?");
        String nome = scanner.nextLine();

        System.out.println("Qual é sua raça?");
        String raca = scanner.nextLine();

        Animais animal = null;
        scanner.close();

        if (animalTipo.equalsIgnoreCase("Cachorro")) {
            animal = new Cachorro(nome, raca);
        } else if (animalTipo.equalsIgnoreCase("Gato")) {
            animal = new Gato(nome, raca);
        } 

        // Chamando métodos
        animal.fazerSom();
        animal.dormir();

        if (animal instanceof Domestico) {
            ((Domestico) animal).brincar();
        }

        // Verificando se o animal é doméstico
        AnimalUtils.verificarDomestico(animal);
    }
}