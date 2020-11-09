import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
<<<<<<< HEAD:src/test/java/starter/SimpleTest.java
    public void myTest(){
        int expected = 7;
=======
    public void test(){
        int expected = 5;
>>>>>>> 0f0f0028d96c07b2ff4c2938ac5c592267dfd36d:src/test/java/SimpleTest.java
//        int actual = 3;
        int actual = 5;
        assertEquals(expected, actual);
    }

}
