package REV_28_08.Passagens JAVA.Passagens;

public class Voo {
    private int numero;
    private String origem;
    private String destino;
    private int lugaresDisponiveis;

    public Voo(int numero, String origem, String destino, int lugaresDisponiveis) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.lugaresDisponiveis = lugaresDisponiveis;
    }

    public int getNumero() {
        return numero;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public int getLugaresDisponiveis() {
        return lugaresDisponiveis;
    }

    public boolean reservarLugar() {
        if (lugaresDisponiveis > 0) {
            lugaresDisponiveis--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Voo " + numero + " de " + origem + " para " + destino + " com " + lugaresDisponiveis + " lugares disponíveis.";
    }
}
