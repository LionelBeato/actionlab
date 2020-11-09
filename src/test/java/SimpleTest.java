import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    public void test(){
        int expected = 5;
//        int actual = 3;
        int actual = 4;
        assertEquals(expected, actual);
    }

}
