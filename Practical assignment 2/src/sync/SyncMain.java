package sync;

public class SyncMain {

    public static void sleepThread(){
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SyncMain syncmain = new SyncMain();
        final TaskManager taskmanager = new TaskManager();
        Thread taskThread1 = new TaskThread("Thread no1", 1, taskmanager);
        Thread taskThread2 = new TaskThread("Thread no2", 2, taskmanager);
        Thread taskThread3 = new TaskThread("Thread no3", 3, taskmanager);
        Thread taskThread4 = new TaskThread("Thread no4", 4, taskmanager);
        Thread taskThread5 = new TaskThread("Thread no5", 5, taskmanager);

        taskThread1.start();
        SyncMain.sleepThread();

        taskThread2.start();
        SyncMain.sleepThread();

        taskThread3.start();
        SyncMain.sleepThread();

        taskThread4.start();
        SyncMain.sleepThread();

        taskThread5.start();
        SyncMain.sleepThread();

    }
}
