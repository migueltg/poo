package basics;

public class RectanguloTest {
    
    public void testRectanguloIntInt(){
        Rectangulo rect = new Rectangulo(5,8);
        if (rect.getBase() == 5 && rect.getAltura() == 8)
            System.out.println("...Prueba constructor con parámetros CORRECTA");
        else
            System.out.println("ERROR: p. constructor con 5,8: " + rect.getBase() + ","
                    + rect.getAltura());
    }
    
    public void testRectangulo(){
        Rectangulo rect = new Rectangulo();
        if (rect.getBase() == 0 && rect.getAltura() == 0)
            System.out.println("...Prueba constructor sin parámetros CORRECTA");
        else
            System.out.println("ERROR: p. constructor sin parametros: " + rect.getBase() + ","
                    + rect.getAltura());
    }
    
    private void test() {
        this.testRectanguloIntInt();
        this.testRectangulo();
    }
    
    public static void main(String[] args) {
        new RectanguloTest().test();
    }
}