package REV_11_09.Animais;

public class Cachorro extends Animais implements Domestico { public String nome;
    public String raca;

    public Cachorro (String nome, String raca) {
       this.nome = nome;
       this.raca = raca;
    }
    
    @Override
    public String fazerSom() {
       return "Au Au";
    }
    @Override
    public void brincar() {
       System.out.println("O cachorro está brincando");
    }
    
}
