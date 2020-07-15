package by.htp.ahremenko.task01;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneNumberTest {

    @Test
    public void getPhoneNumber1() throws Exception {
        String actual = PhoneNumber.getPhoneNumber1(1,2,3,4,5,6,7,8,9,0);
        String expected = "(123) 456-7890";
        assertEquals(expected,actual);
    }

    @Test
    public void getPhoneNumber2() throws Exception {
        String actual = PhoneNumber.getPhoneNumber2(1,2,3,4,5,6,7,8,9,0);
        String expected = "(123) 456-7890";
        assertEquals(expected,actual);
    }
}