package ReprodutorMusical;


import java.util.HashMap;

import java.util.Map;

public class ReprodutorMusical {

    private Map<Long,Musica> listaMusica;

    public ReprodutorMusical(){
        this.listaMusica = new HashMap();
    }

    public void adicionarMusica(Long id, String nome, String cantor){
        listaMusica.put(id, new Musica(nome,cantor));
    }

    public void removerMusica(String nome){
       if (!listaMusica.isEmpty()){
           listaMusica.remove(nome);
       }
    }

    public void exibirPlaylist(){
        System.out.println(listaMusica);
    }




    public void pesquisarMusica(String nome){
         Musica musicaSelecionada = null;
        if (!listaMusica.isEmpty()){
            for (Musica m: listaMusica.values()){
                if (m.getNome().equals(nome)){
                    musicaSelecionada = m;
                }

            }
        }
        System.out.println(musicaSelecionada);
    }


    public static void main(String[] args) {
        ReprodutorMusical listaMusica = new ReprodutorMusical ();

        listaMusica.adicionarMusica(1L,"Love Story", "Taylor Swift");
        listaMusica.adicionarMusica(2L,"Blank Space", "Taylor Swift");
        listaMusica.adicionarMusica(3L,"ET", "Katy Perry");

        listaMusica.exibirPlaylist();

        listaMusica.pesquisarMusica("ET");

    }
}
