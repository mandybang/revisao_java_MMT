package REV_11_09.Animais;

public class Gato extends Animais implements Domestico{
    public String nome;
    public String raca;

    public Gato(String nome, String raca) {
       this.nome = nome;
       this.raca = raca;
    }
    
    @Override
    public String fazerSom() {
       return "Miau";
    }
    @Override
    public void brincar() {
       System.out.println("O gato está brincando");
    }
}