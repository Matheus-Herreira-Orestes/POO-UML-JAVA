package ReprodutorMusical;


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

    public void removerMusica(String nome){
        if (!listaMusica.isEmpty()){
           listaMusica.remove(nome);
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


    public static void main(String[] args) {


    }
}
