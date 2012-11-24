/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Asus
 */
public class AnotherSimpleThread implements Runnable {

    Thread thread;

    /** Creates a new instance of AnotherSimpleThread */
    public AnotherSimpleThread() {
    }

    public AnotherSimpleThread(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + thread.getName());
            try {
                thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("DONE! " + thread.getName());
    }
}
