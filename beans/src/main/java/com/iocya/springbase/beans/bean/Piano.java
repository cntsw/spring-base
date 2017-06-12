package com.iocya.springbase.beans.bean;

/**
 * Created by Euler on 2017/6/13.
 */
public class Piano implements Instrument {
    public Piano() {
    }

    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}