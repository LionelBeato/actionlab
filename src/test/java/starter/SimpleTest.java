package starter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class SimpleTest {


    @Test
    public void myTest(){
        int expected = 7;
        int actual = 5;
        assertEquals(expected, actual);
    }

}
