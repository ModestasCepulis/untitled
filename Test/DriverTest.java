import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class DriverTest {


    @Rule
            public Timeout globalTimeout = Timeout.millis(900);//times out everything
    Driver driverDude = new Driver("Obama",123);

    @Test
    public void testDriverInstante() {

        assertEquals(123,driverDude.getDriverNum());
        assertEquals("Obama",driverDude.getDriverName());


    }

    @Test (expected = IllegalArgumentException.class)
    public void testDriverNumberFail() {

        Driver secondoDrivero = new Driver("Pauler",15);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDriverNameFail() {

        Driver secondoDrivero = new Driver("",145);
    }

    /*@Test
    public void expectedAsString() {
        String expected_result = ""
    }*/

    @Test
    public void testCheckStatus() {
        assertFalse(driverDude.check_status());
    }

    @Test
    public void testWaitTillBanned() {
        driverDude.waitTillbanned();
    }
}