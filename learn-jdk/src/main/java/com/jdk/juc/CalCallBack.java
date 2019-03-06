package com.jdk.juc;

import java.util.concurrent.Callable;


/**
 *
  * class_name: CalCallBack
  * describe: do
  * @author: yangchao.cool@gmail.com
  * creat_date: 上午11:27
  *
 **/
public class CalCallBack implements Callable<Integer> {

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Integer call() throws Exception {


        int result = 0;

        for (int index = 0; index < 10 ; index ++) {
            result += index;
        }

        return result;
    }
}
