import java.util.Random;

public class Dado {
    //atributo de la clase dado
    int numeroDado;

    //obtener el valor del dado
    public int getNumeroDado() {
        return numeroDado;
    }

    //generar el numero dandom
    public void randomNumber() {

        Random rnd = new Random();
        int numerorandom = rnd.nextInt(6)+1;
        this.numeroDado = numerorandom;

    }
}
