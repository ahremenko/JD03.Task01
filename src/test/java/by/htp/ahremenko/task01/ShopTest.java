package by.htp.ahremenko.task01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void getServiceTotal() {
        int cashierAmount = 1; // how many cashiers
        List<Integer> clients = new ArrayList();  // clients in order
        clients.add(5);
        clients.add(3);
        clients.add(4);
        Shop shop = new Shop();
        Integer actual = shop.getServiceTotal(clients,cashierAmount);
        Integer expected = 12;
        assertEquals(expected, actual);

        cashierAmount = 2;
        clients.clear();
        clients.add(10);
        clients.add(2);
        clients.add(3);
        clients.add(3);
        actual = shop.getServiceTotal(clients,cashierAmount);
        expected = 10;
        assertEquals(expected, actual);

        cashierAmount = 2;
        clients.clear();
        clients.add(2);
        clients.add(3);
        clients.add(10);
        actual = shop.getServiceTotal(clients,cashierAmount);
        expected = 12;
        assertEquals(expected, actual);

        cashierAmount = 5;
        clients.clear();
        clients.add(6);
        clients.add(7);
        clients.add(8);
        actual = shop.getServiceTotal(clients,cashierAmount);
        expected = 8;
        assertEquals(expected, actual);

    }
}