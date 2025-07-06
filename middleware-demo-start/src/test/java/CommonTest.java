import org.junit.Test;

import java.sql.Timestamp;

public class CommonTest {
    @Test
    public void test1() {
        long ts = 1751561128861L;
        System.out.println(new Timestamp(ts));
    }
}
