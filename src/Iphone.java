import LigaDesliga.LigaDesliga;
import NavegadorDeInternet.NavegadorDeInternet;
import ReprodutorMusical.ReprodutorMusical;
import Telefone.Telefone;

public class Iphone {

    public static void main(String[] args) {
        LigaDesliga ligaDesliga = new LigaDesliga();
        Telefone telefone = new Telefone();
        ReprodutorMusical listaMusica = new ReprodutorMusical();
        NavegadorDeInternet navegador = new NavegadorDeInternet();

        ligaDesliga.ligar();

        if (ligaDesliga.ligado){

            telefone.adiciocarContato(1L, "Pietra", 123456789);
            telefone.adiciocarContato(2L, "Matheus", 987654321);
            telefone.adiciocarContato(3L, "Ana", 567891431);

            telefone.exibirContatos();

            telefone.removerContato("Ana");
            telefone.exibirContatos();

            telefone.selecionarContato("Matheus");
            telefone.call();
            telefone.listarCaixaPostal();

            telefone.selecionarContato("Pietra");
            telefone.call();
            telefone.listarCaixaPostal();

            telefone.receberChamadaDeContatoAleatorio();

            System.out.println("------------------------------");

            navegador.exibirPagina();

            navegador.adicionarNovaAba("www.google.com");
            navegador.exibirPagina();

            navegador.atualizarPagina();

            navegador.adicionarNovaAba("www.youtube.com");
            navegador.exibirPagina();

            navegador.adicionarNovaAba("www.netflix.com");
            navegador.exibirPagina();

            navegador.exibirAbas();

            navegador.fecharAba("www.netflix.com");
            navegador.exibirPagina();
            navegador.exibirAbas();

            navegador.exibirAbas();

            System.out.println("------------------------------");

            listaMusica.adicionarMusica(1L, "Love Story", "Taylor Swift");
            listaMusica.adicionarMusica(2L, "Blank Space", "Taylor Swift");
            listaMusica.adicionarMusica(3L, "ET", "Katy Perry");

            listaMusica.exibirPlaylist();

            listaMusica.selecionarMusica("Blank Space");

            listaMusica.tocarMusica();

            listaMusica.pausarMusica();

            listaMusica.removerMusica("Blank Space");
            listaMusica.tocarMusica();

            listaMusica.exibirPlaylist();

            System.out.println("------------------------------");

        }

        ligaDesliga.desligar();


    }


}
