/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

/**
 *
 * @author Asus
 */
public class SimpleThread extends Thread {
public SimpleThread(String str) {
super(str);
}
public void run() {
for (int i = 0; i < 10; i++) { System.out.println(i + " " + getName()); try {
sleep((long)(Math.random() * 1000));
} catch (InterruptedException e) {}
}
System.out.println("DONE! " + getName());
}
}

/* TwoThreadsTest.java */

