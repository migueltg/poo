package utils.v0;

import utils.Point;

public class WrangPointTest {

    public void testPointIntInt() {
        Point point = new Point(2, 3);
        System.out.println(point.toString());
    }

    public void testModule() {
        Point point = new Point(2, 3);
        System.out.println(point.toString() + ": modulo: " + point.module());
    }

    public void testPhase() {
        Point point = new Point(2, 3);
        System.out.println(point.toString()+ ": fase: " + point.phase());
    }

    public void test() {
        this.testPointIntInt();
        this.testModule();
        this.testPhase();
    }

    public static void main(final String[] args) {
        new WrangPointTest().test();
    }
}
