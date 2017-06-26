package com.iocya.springbase.beans.bean;

import org.springframework.stereotype.Component;

@Component
@StringedInstrument
public class Guitar implements Instrument {
    public Guitar() {
    }

    public void play() {
        System.out.println("Guitar Guitar Guitar");
    }
}