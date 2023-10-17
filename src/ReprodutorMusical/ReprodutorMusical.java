package ReprodutorMusical;


import Telefone.Contato;

import java.util.HashMap;
import java.util.Map;


public class ReprodutorMusical {

    private Map<Long,Musica> listaMusica;

    private Musica musicaSelecionada = null;

    private boolean tocando = false;



    public ReprodutorMusical(){
        this.listaMusica = new HashMap();
    }

    public void adicionarMusica(Long id, String nome, String cantor){
        listaMusica.put(id, new Musica(nome,cantor));
    }

    public Long pegarIdPorNome(String nome) {
        for (Map.Entry<Long, Musica> entry : listaMusica.entrySet()) {
            if (entry.getValue().getNome().equals(nome)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void removerMusica(String nome) {
        Long idPorNome = pegarIdPorNome(nome);
        if (idPorNome != null) {
            listaMusica.remove(idPorNome);

            if (musicaSelecionada != null && musicaSelecionada.getNome().equals(nome)) {
                musicaSelecionada = null;
                tocando = false;
            }
            System.out.println("Música removida: " + nome);
        } else {
            System.out.println("Música não encontrada: " + nome);
        }
    }


    public void exibirPlaylist(){
        System.out.println(listaMusica);
    }




    public Musica selecionarMusica(String nome){
             if (!listaMusica.isEmpty()) {
                 for (Musica m : listaMusica.values()) {
                     if (m.getNome().equals(nome)) {
                          musicaSelecionada = m;
                    }

                 }
             }

        System.out.println(musicaSelecionada);
        return musicaSelecionada;
    }


    public void tocarMusica(){
        if (musicaSelecionada != null){
            if (!tocando){
                System.out.println("Tocando " + musicaSelecionada);
                tocando = true;
            }
        } else{
            System.out.println("Selecione uma musica");
        }
    }

    public void pausarMusica(){
        if (musicaSelecionada != null){
            if (tocando){
                System.out.println("Musica pausada");
                tocando = false;
            }
        }
    }
}
