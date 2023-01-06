package tp.maven.faktury;

import junit.framework.TestCase;
import org.junit.Test;

public class TESTMETest extends TestCase {

    @Test
    public void sumSqr() {
        TESTME testThis = new TESTME();
        assertEquals(2, testThis.sumSqr(1,1));
    }
}