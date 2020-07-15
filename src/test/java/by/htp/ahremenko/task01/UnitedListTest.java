package by.htp.ahremenko.task01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UnitedListTest {

    @Test
    public void perform() {
        List<List<Integer>> allLists = new ArrayList<List<Integer>>();

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        allLists.add(l1);

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        allLists.add(l2);

        UnitedList.perform(allLists);
        Integer[] actual = new Integer[allLists.get(0).size()];
        for (int i = 0; i < allLists.get(0).size(); i++) {
            actual[i] = allLists.get(0).get(i);
        }
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5, 6 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void perform2() {
        List<List<Integer>> allLists = new ArrayList<List<Integer>>();

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        allLists.add(l1);

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(6);
        l2.add(9);
        allLists.add(l2);

        UnitedList.perform(allLists);
        Integer[] actual = new Integer[allLists.get(0).size()];
        for (int i = 0; i < allLists.get(0).size(); i++) {
            actual[i] = allLists.get(0).get(i);
        }
        Integer[] expected = new Integer[]{1, 3, 4, 5, 5, 6, 6, 9 };
        assertArrayEquals(expected, actual);
    }
}