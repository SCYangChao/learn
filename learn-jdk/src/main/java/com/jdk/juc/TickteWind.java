package com.jdk.juc;

import com.jdk.juc.Tickte;

public class TickteWind {

    public  static  void main(String[] arg){

        Tickte tickte = new Tickte();
        new Thread(tickte , "wind 1").start();
        new Thread(tickte , "wind 2").start();
        new Thread(tickte , "wind 3").start();

    }

}
