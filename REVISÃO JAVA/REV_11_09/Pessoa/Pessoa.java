package REV_11_09.Pessoa;

public class Pessoa {
    private String nome;
    protected String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String getEmail() {
        return this.email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }
}
