package REV_11_09.Pessoa;

import REV_11_09.Pessoa;

public class Fisica extends Pessoa { // A classe Fisica herda da classe Pessoa
    private String cpf;

    public Fisica(String cpf, String nome, String email) {
        super(nome, email); // Chama o construtor da superclasse Pessoa
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimir() {
        super.getNome();
        super.getEmail();
    }
}
