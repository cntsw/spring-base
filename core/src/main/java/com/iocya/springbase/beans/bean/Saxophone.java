package com.iocya.springbase.beans.bean;

import org.springframework.stereotype.Component;

@Component
public class Saxophone implements Instrument {
    public Saxophone() {
    }

    public void play() {
        System.out.println("TOT TOT TOT");
    }
}
