package ThreadConcepts;

public class Calling {

    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t1 = new Thread(()->{
          for(int i =0;i<5;i++){
              c.increment();
          }
        });

        Thread t2 = new Thread(()->{
            for(int i =0;i<5;i++){
                c.increment();
            }
        });
        /*Thread1 t1 = new Thread1(c1);
        Thread2 t2 = new Thread2(c1);*/


        t1.start();
        t2.start();

        //c.increment();


    }
}
