package Telefone;

import java.util.*;


public class Telefone {

        private Map<Long, Contato> contatosMap;
        private Random random;

        private List<String> caixaPostal;


    public Telefone(){
            this.contatosMap = new HashMap<>();
            this.random = new Random();
        }



        public boolean sortearValorBooleano() {
            return random.nextBoolean();
        }

        private Contato contatoSelecionado = null;

        public void adiciocarContato(Long id,String nome, Integer telefone){
            contatosMap.put(id, new Contato(nome,telefone));
        }

         public Long pegarIdPorNome(String nome) {
            for (Map.Entry<Long, Contato> entry : contatosMap.entrySet()) {
                if (entry.getValue().getNome().equals(nome)) {
                     return entry.getKey();
                }
            }
            return null;
         }


    public void removerContato(String nome){
            Long idPeloNome = pegarIdPorNome(nome);
            if (!contatosMap.isEmpty()){
                contatosMap.remove(idPeloNome);
            }
        }


        public void exibirContatos(){
            System.out.println(contatosMap);
        }

        public Contato pesquisarPorNome(String nome){
            Contato numeroPorNome = null;
            if (!contatosMap.isEmpty()){
                numeroPorNome = contatosMap.get(nome);
            }

            return numeroPorNome;
        }

        public Contato selecionarContato(String nome){
            if (!contatosMap.isEmpty()){
                for (Contato c: contatosMap.values()){
                    if (c.getNome().equals(nome)){
                        contatoSelecionado = c;
                        System.out.println(contatoSelecionado);
                    }
                }
            }
            return contatoSelecionado;
        }



        public void call(){

            if (contatoSelecionado != null){
                System.out.println("Ligando para " + contatoSelecionado);

                boolean atendeu = sortearValorBooleano();

                if (atendeu){
                    System.out.println("Ligação Atendida");
                } else {
                    System.out.println("Não Atendeu");
                    System.out.println("Caixa postal");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Deixe a sua mensagem: ");
                    String mensagem = scanner.nextLine();
                    contatoSelecionado.adicionarMensagemDeVoz(mensagem);

                    System.out.println("Mensagem de voz adicionada à caixa postal.");
                }
            }
        }

    public void listarCaixaPostal(){
        if (contatoSelecionado != null) {
            List<String> caixaPostal = contatoSelecionado.getCaixaPostal();
            if (!caixaPostal.isEmpty()) {
                System.out.println("Mensagens de Voz da Caixa Postal:");
                for (int i = 0; i < caixaPostal.size(); i++) {
                    System.out.println("Mensagem " + (i + 1) + ": " + caixaPostal.get(i));
                }
            } else {
                System.out.println("Caixa postal vazia.");
            }
        }
    }


    public void receberChamadaDeContatoAleatorio() {
        if (!contatosMap.isEmpty()) {
            List<Contato> contatos = new ArrayList<>(contatosMap.values());
            int indiceAleatorio = random.nextInt(contatos.size());
            Contato contatoAleatorio = contatos.get(indiceAleatorio);

            System.out.println(contatoAleatorio + " está ligando para você.");

            boolean atendeu = sortearValorBooleano();

            if (atendeu) {
                System.out.println("Você atendeu a ligação.");
            } else {
                System.out.println("Chamada perdida.");
                contatoAleatorio.adicionarMensagemDeVoz("Você tentou ligar, mas a chamada foi perdida.");
            }
        } else {
            System.out.println("Não há contatos disponíveis para fazer uma chamada.");
        }
    }




        public static void main(String[] args) {


        }
}
