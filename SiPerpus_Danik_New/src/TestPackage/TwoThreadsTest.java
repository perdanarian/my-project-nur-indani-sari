/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

/**
 *
 * @author Asus
 */
public class TwoThreadsTest {
public static void main (String[] args) {
new SimpleThread("Bali").start();
new SimpleThread("Jogja").start();
}
}
