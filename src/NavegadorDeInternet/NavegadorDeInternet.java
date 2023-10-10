package NavegadorDeInternet;

import java.util.ArrayList;
import java.util.List;

public class NavegadorDeInternet {
    private List<String> abasAbertas;
    private String paginaAtual;

    public NavegadorDeInternet() {
        abasAbertas = new ArrayList<>();
    }

    public void exibirPagina() {
        if (paginaAtual != null) {
            System.out.println("Página atual: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página aberta.");
        }
    }

    public void adicionarNovaAba(String pagina) {
        abasAbertas.add(pagina);
        System.out.println("Aba adicionada: " + pagina);
        paginaAtual = pagina;
    }

    public void fecharAba(String pagina) {
        if (abasAbertas.contains(pagina)) {
            abasAbertas.remove(pagina);
            if (pagina.equals(paginaAtual)) {
                if (!abasAbertas.isEmpty()) {
                    paginaAtual = abasAbertas.get(0);
                } else {
                    paginaAtual = null;
                }
            }
            System.out.println("Aba fechada: " + pagina);
        } else {
            System.out.println("Aba não encontrada: " + pagina);
        }
    }


    public void atualizarPagina() {
        if (paginaAtual != null) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página aberta para atualizar.");
        }
    }

    public void exibirAbas(){
        System.out.println(abasAbertas);
    }

    public static void main(String[] args) {

    }
}
