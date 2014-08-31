package utils;

public class PointTest{

    public void testPunto() {
        Punto punto = new Punto();
        if (punto.getX() == 0 && punto.getY() == 0)
            System.out.println("Prueba constructor sin par�metros CORRECTA");
        else
            System.out.println("ERROR: p. constructor sin par�metros");
    }

    public void testPuntoIntInt() {
        Punto punto = new Punto(2, 2);
        if (punto.getX() == 2 && punto.getY() == 2)
            System.out.println("Prueba constructor con par�metros CORRECTA");
        else
            System.out.println("ERROR: p. constructor con par�metros");
    }

    public void testModulo() {
        Punto punto = new Punto(2, 3);
        if (punto.modulo() > 3.6055 && punto.modulo() < 3.6056)
            System.out.println("Prueba modulo CORRECTA");
        else
            System.out.println("ERROR: p. modulo:" + punto.toString() + ":" + punto.fase());
    }

    public void testFase() {
        Punto punto = new Punto(3, 3);
        if (punto.fase() > 0.7853 && punto.fase() < 0.7854)
            System.out.println("Prueba fase CORRECTA");
        else
            System.out.println("ERROR: p. fase:" + punto.toString() + ":" + punto.fase());
    }

    public void test() {
        this.testPunto();
        this.testPuntoIntInt();
        this.testModulo();
        this.testFase();
    }

    public static void main(final String[] args) {
        new PruebaPunto().test();
    }
}
