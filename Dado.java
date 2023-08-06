import java.util.Random;

public class Dado {
    int numeroDado;


    public int getNumeroDado() {
        return numeroDado;
    }

    public void randomNumber() {

        Random rnd = new Random();
        int numerorandom = rnd.nextInt(6)+1;
        this.numeroDado = numerorandom;

    }
}
