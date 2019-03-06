package com.jdk.juc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;

public class CallMain {

    public  static  void main(String[] arg) {

        CalCallBack calCallBack = new CalCallBack();

        FutureTask<Integer> futureTask = new FutureTask<Integer>(calCallBack);

        new Thread(futureTask).start();
        Semaphore
        try {
            Integer count = futureTask.get();

            System.out.println(count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
