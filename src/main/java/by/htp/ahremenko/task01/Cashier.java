package by.htp.ahremenko.task01;

/*
 кассир -
 */
public class Cashier implements Runnable{
    private Shop shop;
    private Line line;
    private int cashierNo = 0;
    private int spentTime = 0;


    public Cashier(Shop s, Line l, int cashierNo) {
        this.shop = s;
        this.line = l;
        this.cashierNo = cashierNo;
    }

    public void run() {
        //System.out.println("Cashier #" + cashierNo + " opening...");
        Integer next = null;
        while ((next = line.getNextClient()) != null) {
            spentTime += next;
            //System.out.println("Cashier #" + cashierNo + " serviced: " + next);
            sleep(Long.valueOf(next*100));
        }
        shop.stats.put(cashierNo,spentTime);
        //System.out.println("Cashier # " + cashierNo + " closed. Spent time (s): " + spentTime);
    }

    private void sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

