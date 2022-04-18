package priority;

public class PriorityThread extends Thread{

    String name;
    public PriorityThread(String name) {

        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + " " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
