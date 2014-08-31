package utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PointTest {
    //private Point[] points = {new Point(2, 3), new Point(3, 3), new Point(-4, 2), new Point(1, 0)};

    private int[] xs = {2, 3, -4, 1};

    private int[] ys = {1, 3, 2, 0};

    private double[] modules = {2.2360, 4.2426, 4.4721, 1};

    private double[] phases = {0.4636, 0.7854, -0.4636, 0};

    private String[] strings = {"Point[2,1]", "Point[3,3]", "Point[-4,2]", "Point[1,0]"};

    private void testPuntoIntInt(int x, int y) {
        Point pt = new Point(x, y);
        assertEquals(pt.getX(), x);
        assertEquals(pt.getY(), y);
    }

    @Test
    public void testPuntoIntInt() {
        for (int i = 0; i < xs.length; i++) {
            this.testPuntoIntInt(xs[i], ys[i]);
        }
    }

    @Test
    public void testPunto() {
        Point pt = new Point();
        assertEquals(pt.getX(), 0);
        assertEquals(pt.getY(), 0);
    }

    private void testModulo(int x, int y, double modulo) {
        Point pt = new Point(x, y);
        assertEquals(pt.module(), modulo, 0.0001);
    }

    @Test
    public void testModulo() {
        for (int i = 0; i < xs.length; i++) {
            this.testModulo(xs[i], ys[i], modules[i]);
        }
    }

    private void testFase(int x, int y, double fase) {
        Point pt = new Point(x, y);
        assertEquals(pt.phase(), fase, 0.0001);
    }

    @Test
    public void testFase() {
        for (int i = 0; i < xs.length; i++) {
            this.testFase(xs[i], ys[i], phases[i]);
        }
    }

    private void testTranslate(int x, int y) {
        Point pt = new Point(x, y);
        pt.translate(new Point(1, 1));
        assertEquals(pt.getX(), x - 1);
        assertEquals(pt.getY(), y - 1);
    }

    @Test
    public void testTranslate() {
        for (int i = 0; i < xs.length; i++) {
            this.testTranslate(xs[i], ys[i]);
        }
    }

    private void testToString(int x, int y, String cadena) {
        Point pt = new Point(x, y);
        assertEquals(pt.toString(), cadena);
    }

    @Test
    public void testToString() {
        for (int i = 0; i < xs.length; i++) {
            this.testToString(xs[i], ys[i], strings[i]);
        }
    }

}
