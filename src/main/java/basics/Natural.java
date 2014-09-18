package basics;

public class Natural {
    private int natural;

    public Natural(int natural) {
        if (natural < 0) {
            throw new IllegalArgumentException("valor negativo no válido para la clase natural");
        } else {
            this.natural = natural;
        }
    }

    public int getNatural() {
        return natural;
    }

}
