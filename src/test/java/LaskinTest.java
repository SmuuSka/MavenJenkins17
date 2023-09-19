import org.junit.Test;

import static org.junit.Assert.*;

public class LaskinTest {

    private Laskin laskin = new Laskin();
    private static double DELTA = 0.001;
    @Test
    public void laskeEtaisyys() {
        assertEquals("Lasketaan etäisyys kahden pisteen välillä",5.0,laskin.laskeEtaisyys(1,1,4,5), DELTA);
    }
}