package LigaDesliga;

public class LigaDesliga {
    public boolean ligado = false;

    public boolean ligar(){
        ligado= true;
        System.out.println("Aparelho Ligado");
        return ligado;
    }

    public boolean desligar(){
        ligado= false;
        System.out.println("Aparelho desligado");
        return ligado;
    }
}
