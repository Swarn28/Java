package Threads;

/*This question was asked to me in Ericsson interview.
 The interviewer wanted to know that, will the static synchronised method be accessed at the same time
  from both the threads ?

 He also asked me to write the threads creation using the ExecutorService and not the Thread class.
    I have created a method named executeES() which has that logic.
  https://chatgpt.com/share/cff25ec1-db63-47a2-b07c-db3aa42e663e
  */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
       // test.executeES();
        test.execute();


    }

    private void execute() {
        MyAccount account1 = new MyAccount();
        MyAccount account2 = new MyAccount();
        new Thread(
                () -> {
                    account1.myBalance();
                    account1.myName();
                })
                .start();

        new Thread(
                () -> {
                    account2.myBalance();
                    account2.myName();
                })
                .start();
    }

}

    /*private void executeES(){
        MyAccount account1 = new MyAccount();
        MyAccount account2 = new MyAccount();
        ExecutorService es = Executors.newFixedThreadPool(2);

        es.submit(() -> {
            account1.myBalance();
            account1.myName();
        });

        es.submit(() -> {
            account2.myBalance();
            account2.myName();
        });

    }*/


class MyAccount {
    public static synchronized void myName() {
        System.out.println("myName");
    }

    public synchronized void myBalance() {
        System.out.println("myBalance");
    }
}