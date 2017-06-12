package com.iocya.springbase.beans.bean;

/**
 * Created by Euler on 2017/6/12.
 */
public class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public void perform() {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }


    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}