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
public class TimerSimpanAnggota {
private int waktuInterval;

    public TimerSimpanAnggota(int waktuInterval) {
        this.waktuInterval = waktuInterval;
        Timer timer = new Timer();
        timer.schedule(new TugasSimpanAnggota(), 10000, waktuInterval);


    }
}
