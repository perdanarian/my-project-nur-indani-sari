/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.AnotherSimpleThread;
import com.model.SimpleThread;

/**
 *
 * @author Asus
 */
public class AnotherTwoThreadsTest1 {
    public static void main (String[] args) {
new AnotherSimpleThread("Bali");
new AnotherSimpleThread("Jogja");
new SimpleThread("Medan").start();
new SimpleThread("Jakarta").start();
// Pertanyaan: ada berapa thread yang aktif?
}}

