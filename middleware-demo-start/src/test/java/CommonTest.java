import org.junit.Test;

import java.sql.Timestamp;

public class CommonTest {
    @Test
    public void test1() {
        long ts = 1751613402012L;
        System.out.println(new Timestamp(ts));
    }
}
