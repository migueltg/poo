package figure;

import upm.jbb.IO;

public class FiguresController {
    private FiguresHandler mf;

    public FiguresController() {
        this.mf = new FiguresHandler();
    }

    public void addTriangulo() {
        Triangle triangulo = (Triangle) IO.in.read(Triangle.class, "Dame un triangulo");
        this.mf.addFigura(triangulo);
    }

    public void addCuadrado() {
        Quadrilateral cuadrado = (Quadrilateral) IO.in.read(Quadrilateral.class, "Dame un triangulo");
        this.mf.addFigura(cuadrado);
    }

    public void verFiguras() {
        IO.out.println(this.mf.getFiguras());
    }

    public static void main(String[] args) {
        IO.in.addController(new FiguresController());
    }
}
