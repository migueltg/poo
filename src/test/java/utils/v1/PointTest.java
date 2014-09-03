package utils.v1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import utils.Point;

public class PointTest {
    Point point;

    @Before
    public void before() {
        this.point = new Point(2, 3);
    }

    @Test
    public void testPoint() {
        this.point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    public void testPointIntInt() {
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
    }

    @Test
    public void testModule() {
        assertEquals(3.6055, point.module(), 10e-4);
    }

    @Test
    public void testPhase() {
        assertEquals(0.9828, point.phase(), 10e-4);
    }

    @Test
    public void testTranslate() {
        this.point.translateOrigin(new Point(1,1));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    public void testToString() {
        assertEquals("Point[2,3]", point.toString());
    }

}
