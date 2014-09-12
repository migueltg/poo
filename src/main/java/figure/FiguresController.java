package figure;

import upm.jbb.IO;

public class FiguresController {
    private FiguresHandler figuresHandler;

    public FiguresController() {
        this.figuresHandler = new FiguresHandler();
    }

    public void addTriangle() {
        Triangle triangulo = (Triangle) IO.in.read(Triangle.class, "Dame un triangulo");
        this.figuresHandler.addFigure(triangulo);
    }

    public void addQuadrilateral() {
        Quadrilateral cuadrado = (Quadrilateral) IO.in.read(Quadrilateral.class, "Dame un triangulo");
        this.figuresHandler.addFigure(cuadrado);
    }

    public void view() {
        IO.out.println(this.figuresHandler.getFigures());
    }

    public static void main(String[] args) {
        IO.in.addController(new FiguresController());
    }
}
