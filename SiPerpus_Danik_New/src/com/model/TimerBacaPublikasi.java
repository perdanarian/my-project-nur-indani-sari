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
public class TimerBacaPublikasi {
    private int waktuInterval;
    public TimerBacaPublikasi(int waktuInterval) {
        this.waktuInterval=waktuInterval;
        Timer timer = new Timer();
        timer.schedule(new TugasBacaPublikasi(),0,waktuInterval);
    }
}
