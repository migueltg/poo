package figuras;

public class FiguraMain {

    public static void main(String[] args) {
        ManejadorFiguras mf = new ManejadorFiguras();
        mf.addFigura(new Cuadrado("c1",2));
        mf.addFigura(new Cuadrado("c2",3));
        mf.addFigura(new Triangulo("t1",2,3));
        
        System.out.println("Area total:"+mf.area());
        
    }

}
