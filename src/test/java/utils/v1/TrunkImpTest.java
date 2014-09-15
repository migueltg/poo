package utils.v1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utils.Trunk;

public class TrunkImpTest {

    private Trunk trunk;

    @Before
    public void before() {
        this.trunk = new TrunkImp();
    }

    @Test
    public void testPutGetNew() {
        String s = "UNO";
        this.trunk.put("uno", s);
        assertSame(s, this.trunk.get("uno"));
    }

    @Test
    public void testPutGetUpdate() {
        String s = "UNO", s2 = "DOS";
        this.trunk.put("uno", s);
        this.trunk.put("uno", s2);
        assertSame(s2, this.trunk.get("uno"));
    }

    @Test
    public void testRemove() {
        String s = "UNO";
        this.trunk.put("uno", s);
        this.trunk.remove("uno");
        assertNull(this.trunk.get("uno"));
    }

    @Test
    public void testIsFull() {
        for (int i = 0; i < Trunk.MAX_SIZE; i++) {
            this.trunk.put("i" + i, ".");
        }
        assertTrue(this.trunk.isFull());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(this.trunk.isEmpty());
    }

}
