package consumer;

public class Goods {
    int amount = 10;

    public synchronized void produce(int amount){


        this.amount = amount;
        notify();
    }

}
