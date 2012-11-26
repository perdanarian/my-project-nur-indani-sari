/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import java.util.Timer;

/**
 *
 * @author Asus
 */
public class TimerSimpanPublikasi {
    private int waktuInterval;
public TimerSimpanPublikasi(int waktuInterval) {
    this.waktuInterval=waktuInterval;
    Timer timer = new Timer();
    timer.schedule(new TugasSimpanPublikasi(),10000,waktuInterval);


}
}
