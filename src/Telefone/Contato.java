package Telefone;

import java.util.ArrayList;
import java.util.List;

public class Contato {

    private String nome;

    private Integer numero;

    private List<String> caixaPostal;


    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    public Integer getNumero() {
        return numero;
    }

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
        this.caixaPostal = new ArrayList<>();

    }

    public void adicionarMensagemDeVoz(String mensagem) {
        caixaPostal.add(mensagem);
    }

    public List<String> getCaixaPostal() {
        return caixaPostal;
    }
}
