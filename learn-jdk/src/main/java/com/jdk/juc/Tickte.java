package com.jdk.juc;

import java.lang.ref.SoftReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
  * class_name: Tickte
  * describe: do
  * @author: yangchao.cool@gmail.com
  * creat_date: 下午1:22
  *
 **/
public class Tickte implements  Runnable {

    private Lock lock = new ReentrantLock();

    private Integer tickte = 100;

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        while (true) {

            if (tickte > 0){

                lock.lock();
                System.out.println(Thread.currentThread().getName()+"完成售票,余票为: "+ --tickte);
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                lock.unlock();

            }


        }


    }
}
