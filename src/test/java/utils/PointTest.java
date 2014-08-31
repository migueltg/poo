package utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PointTest {
    // private Point[] points = {new Point(2, 3), new Point(3, 3), new Point(-4,2), new Point(1, 0)};

    private int[] xs = {2, 3, -4, 1};

    private int[] ys = {1, 3, 2, 0};

    private double[] modules = {2.2360, 4.2426, 4.4721, 1};

    private double[] phases = {0.4636, 0.7854, -0.4636, 0};

    private String[] strings = {"Point[2,1]", "Point[3,3]", "Point[-4,2]", "Point[1,0]"};

    private void testPuntoIntInt(int x, int y) {
        Point pt = new Point(x, y);
        assertEquals(x, pt.getX());
        assertEquals(y, pt.getY());
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
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
    }

    private void testModule(int x, int y, double module) {
        Point pt = new Point(x, y);
        assertEquals(module, pt.module(), 10e-4);
    }

    @Test
    public void testModule() {
        for (int i = 0; i < xs.length; i++) {
            this.testModule(xs[i], ys[i], modules[i]);
        }
    }

    private void testPhase(int x, int y, double phase) {
        Point pt = new Point(x, y);
        assertEquals(phase, pt.phase(), 10e-4);
    }

    @Test
    public void testPhase() {
        for (int i = 0; i < xs.length; i++) {
            this.testPhase(xs[i], ys[i], phases[i]);
        }
    }

    private void testTranslate(int x, int y) {
        Point pt = new Point(x, y);
        pt.translate(new Point(1, 1));
        assertEquals(x - 1, pt.getX());
        assertEquals(y - 1, pt.getY());
    }

    @Test
    public void testTranslate() {
        for (int i = 0; i < xs.length; i++) {
            this.testTranslate(xs[i], ys[i]);
        }
    }

    private void testToString(int x, int y, String string) {
        Point pt = new Point(x, y);
        assertEquals(string, pt.toString());
    }

    @Test
    public void testToString() {
        for (int i = 0; i < xs.length; i++) {
            this.testToString(xs[i], ys[i], strings[i]);
        }
    }

}