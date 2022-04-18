package queue;

import javax.swing.text.html.parser.Element;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingMain {
    public static void main(String[] args){
        final BlockingQueue<Element> queue = new ArrayBlockingQueue<>(3);
        AddingThread addingthread = new AddingThread(queue);
        TakingThread takingThread = new TakingThread(queue);
        new Thread(addingthread).start();
        new Thread(takingThread).start();



    }
}
