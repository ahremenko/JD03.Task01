package by.htp.ahremenko.task01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Shop {

    public static Map<Integer,Integer> stats = new HashMap<Integer,Integer>();  // array with total time of service for each cashier

    public Integer getServiceTotal(List<Integer> l, int cashierAmount) {
        ExecutorService executor = Executors.newFixedThreadPool(cashierAmount);
        Line customers = new Line(l);

        for (int i = 1; i <= cashierAmount; i++) {
            executor.submit(new Cashier(this, customers, i));
        }
        executor.shutdown();
        try {
            executor.awaitTermination(20, TimeUnit.SECONDS);  // total limit for all process - to increase if need!
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        Integer totalTime = 0;
        for (Map.Entry<Integer,Integer> cashier : stats.entrySet())
        {
            if (cashier.getValue() > totalTime)
                totalTime = cashier.getValue();
        }
        return totalTime;
    }

}
