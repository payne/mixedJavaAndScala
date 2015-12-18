package mixedJavaAndScala;

import static org.junit.Assert.*;

import sample2.Person;
import sample2.impl.PersonImpl;
import org.junit.Test;

public class SecondTest {

    @Test
    public void test() {
        Person matt = new PersonImpl("Matt");
        assertEquals("Matt", matt.getName());
        System.out.println("Test SecondTest passed!  woot.");
    }

}
