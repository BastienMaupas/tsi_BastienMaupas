package sync;

public class TaskThread extends Thread{

    String CurrentThread;
    int currentID;
    TaskManager TaskManager;

    public TaskThread(String CurrentThread, int currentID, TaskManager TaskManager) {
        this.CurrentThread = CurrentThread;
        this.currentID = currentID;
        this.TaskManager = TaskManager;
    }

    @Override
    public void run() {
        TaskManager.performTask(CurrentThread, currentID);
    }



}
