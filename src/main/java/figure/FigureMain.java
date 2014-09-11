package figure;

public class FigureMain {

    public static void main(String[] args) {
        FiguresHandler fh = new FiguresHandler();
        fh.addFigura(new Quadrilateral("c1", 2));
        fh.addFigura(new Quadrilateral("c2", 3));
        fh.addFigura(new Triangle("t1", 2, 3));

        System.out.println(fh.toString());

        System.out.println("Area total:" + fh.area());
        System.out.println("Numero total de lados:" + fh.sides());
    }

}
