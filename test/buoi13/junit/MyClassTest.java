package buoi13.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void phepChia() {

        MyClass myClass = new MyClass();

        assertEquals("10 chia 2 phai bang 5",
                5,myClass.phepChia(10,2));

    }
}