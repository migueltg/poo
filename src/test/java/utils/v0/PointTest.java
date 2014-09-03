package utils.v0;

import utils.Point;

public class PointTest {

    public void testPoint() {
        Point point = new Point();
        if (point.getX() == 0 && point.getY() == 0)
            System.out.println("...Prueba constructor sin parámetros CORRECTA");
        else
            System.out.println("ERROR: p. constructor sin parámetros" + point.getX() + ","
                    + point.getY());
    }

    public void testPointIntInt() {
        Point point = new Point(2, 3);
        if (point.getX() == 2 && point.getY() == 3)
            System.out.println("...Prueba constructor con parámetros CORRECTA");
        else
            System.out.println("ERROR: p. constructor con parámetros" + point.getX() + ","
                    + point.getY());
    }

    public void testModule() {
        Point point = new Point(2, 3);
        if (point.module() > 3.6055 && point.module() < 3.6056)
            System.out.println("...Prueba modulo CORRECTA");
        else
            System.out.println("ERROR: p. modulo:" + point.toString() + ":" + point.phase());
    }

    public void testPhase() {
        Point point = new Point(2, 3);
        if (point.phase() > 0.9827 && point.phase() < 0.9828)
            System.out.println("...Prueba fase CORRECTA");
        else
            System.out.println("ERROR: p. fase:" + point.toString() + ":" + point.phase());
    }

    public void testTranslate() {
        Point point = new Point(2, 3);
        point.translateOrigin(new Point(3, 2));
        if (point.getX() == -1 && point.getY() == 1)
            System.out.println("...Prueba translate CORRECTA");
        else
            System.out.println("ERROR: p. translate:" + point.toString());
    }

    public void testToString() {
        Point point = new Point(2, 3);
        if ("Point[2,3]".equals(point.toString()))
            System.out.println("...Prueba toString CORRECTA");
        else
            System.out.println("ERROR: p. toString:" + point.toString());
    }

    public void test() {
        this.testPoint();
        this.testPointIntInt();
        this.testModule();
        this.testPhase();
        this.testTranslate();
        this.testToString();
    }

    public static void main(final String[] args) {
        new PointTest().test();
    }
}
