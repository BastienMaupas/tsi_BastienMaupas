package Ex4;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        Consumer consumer= new Consumer();
        Producer producer = new Producer();
        producer.start();
//       consumer.start();
    }
}
