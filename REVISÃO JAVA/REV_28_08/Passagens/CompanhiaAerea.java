package REV_28_08.Passagens JAVA.Passagens;

import java.util.ArrayList;
import java.util.List;

public class CompanhiaAerea {
    private List<Voo> voos;

    public CompanhiaAerea() {
        this.voos = new ArrayList<>();
    }

    public void adicionarVoo(Voo voo) {
        voos.add(voo);
    }

    public Voo buscarVooPorNumero(int numero) {
        for (Voo voo : voos) {
            if (voo.getNumero() == numero) {
                return voo;
            }
        }
        return null;
    }

    public List<Voo> buscarVoosPorOrigem(String origem) {
        List<Voo> resultado = new ArrayList<>();
        for (Voo voo : voos) {
            if (voo.getOrigem().equalsIgnoreCase(origem)) {
                resultado.add(voo);
            }
        }
        return resultado;
    }

    public List<Voo> buscarVoosPorDestino(String destino) {
        List<Voo> resultado = new ArrayList<>();
        for (Voo voo : voos) {
            if (voo.getDestino().equalsIgnoreCase(destino)) {
                resultado.add(voo);
            }
        }
        return resultado;
    }

    public void listarVoos() {
        for (Voo voo : voos) {
            System.out.println(voo);
        }
    }
}
