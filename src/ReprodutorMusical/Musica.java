package ReprodutorMusical;

public class Musica {

    private String nome;

    private String cantor;

    public Musica(String nome, String cantor) {
        this.nome = nome;
        this.cantor = cantor;
    }

    public String getNome() {
        return nome;
    }

    public String getCantor() {
        return cantor;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", cantor='" + cantor + '\'' +
                '}';
    }
}
