package ThreadConcepts;

public class Thread2 extends Thread{

    Counter c;

    public Thread2(Counter c){
        this.c = c;
    }

    public void run(){
        for(int i=0; i<5;i++){
            c.increment();
        }
    }
}