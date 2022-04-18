package priority;

public class PriorityMain {
    public static void main(String[] args) {

        Thread min = new PriorityThread(" min");
        Thread max = new PriorityThread(" max");
        Thread norm = new PriorityThread(" norm");
        Thread ave = new PriorityThread(" ave");

        min.start();
        max.start();
        ave.start();
        norm.start();

    }



}
