package figure;

import upm.jbb.IO;

public class FiguresController {
    private FiguresHandler mf;

    public FiguresController() {
        this.mf = new FiguresHandler();
    }

    public void addTriangle() {
        Triangle triangulo = (Triangle) IO.in.read(Triangle.class, "Dame un triangulo");
        this.mf.addFigura(triangulo);
    }

    public void addQuadrilateral() {
        Quadrilateral cuadrado = (Quadrilateral) IO.in.read(Quadrilateral.class, "Dame un triangulo");
        this.mf.addFigura(cuadrado);
    }

    public void view() {
        IO.out.println(this.mf.getFigures());
    }

    public static void main(String[] args) {
        IO.in.addController(new FiguresController());
    }
}
