package ThreadConcepts;

public class Counter {
     int count = 0;
    public synchronized int increment(){
        count++;
        System.out.println("Count after increment: " + count +", Thread name is "+Thread.currentThread().getName());
        return count;
    }

}
