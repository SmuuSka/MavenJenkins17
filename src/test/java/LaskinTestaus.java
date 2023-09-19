import org.junit.Test;

import static org.junit.Assert.*;

public class LaskinTestaus {
    private static double DELTA = 0.001;
    private Laskin1 laskin = new Laskin1();
    @Test
    public void testLaskeEtaisyys() {
        assertEquals("Testataan pituutta", 5.0, laskin.laskeEtaisyys(1,1,4,5),DELTA);
    }
}