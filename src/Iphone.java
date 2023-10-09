import java.sql.SQLOutput;

public class Iphone {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.desligar();

    }

    public boolean ligado = false;

    public void ligar(){
        ligado= true;
        System.out.println("Aparelho Ligado");
    }

    public void desligar(){
        ligado= false;
        System.out.println("Aparelho desligado");
    }
}
