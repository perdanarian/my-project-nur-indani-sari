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
public class TimerBacaAnggota {
private int waktuInterval;
    public TimerBacaAnggota(int waktuInterval) {
        this.waktuInterval=waktuInterval;
        Timer timer = new Timer();
        timer.schedule(new TugasBacaAnggota(),0,waktuInterval);
    }
}
