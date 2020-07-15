package by.htp.ahremenko.task01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ClerkTest {

    @Test
    public void canBeChanged() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(25);
        list.add(25);
        list.add(50);
        Boolean actual = Clerk.canBeChanged(list);
        Boolean expected = true;
        assertEquals(expected, actual);

        list.add(50);
        list.add(100);
        list.add(25);
        actual = Clerk.canBeChanged(list);
        expected = false;
        assertEquals(expected, actual);
    }
}