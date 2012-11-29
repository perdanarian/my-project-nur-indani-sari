/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import java.util.TimerTask;

/**
 *
 * @author Asus
 */
public class TugasBacaAnggota extends TimerTask{

    @Override
    public void run() {
        Perpustakaan.bacaTabelAnggota();
    }

}