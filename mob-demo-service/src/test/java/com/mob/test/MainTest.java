package com.mob.test;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/9/8:10:20
 */
public class MainTest {

    public static void main(String[] args) {
        for(int i=0;i<100000;i++){
            final int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(finalI);
                }
            }).start();

        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
