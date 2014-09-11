package figuras;

import upm.jbb.IO;

public class ControladorFiguras {
    private ManejadorFiguras mf;

    public ControladorFiguras() {
        this.mf = new ManejadorFiguras();
    }

    public void addTriangulo() {
        Triangulo triangulo = (Triangulo) IO.in.read("figuras.Triangulo", "Dame un triangulo");
        this.mf.addFigura(triangulo);
    }

    public void addCuadrado() {
        Cuadrado cuadrado = (Cuadrado) IO.in.read("figuras.Cuadrado", "Dame un triangulo");
        this.mf.addFigura(cuadrado);
    }

    public void verFiguras() {
        IO.out.println(this.mf.getFiguras());
    }

    public static void main(String[] args) {
        IO.in.addController(new ControladorFiguras());
    }
}
