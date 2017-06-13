package com.iocya.springbase.beans.bean;

public class Piano implements Instrument {
    public Piano() {
    }

    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}