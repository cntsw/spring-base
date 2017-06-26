package com.iocya.springbase.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instrumentalist implements Performer {
    @Value("#{'SpEL can be used here: 2^8=' + 2^8}")
    private String song;

    private Instrument instrument;

    @Autowired // or use @Inject , JSR-330
    @Qualifier("guitar")// or use @Name, JSR-330
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    private Instrument instrument1;

    @Autowired
    @StringedInstrument
    public void heresYourInstrument(Instrument instrument) {
        this.instrument1 = instrument;
    }

    private Instrument instrument2;

    @Autowired
    public Instrumentalist(@StringedInstrument Instrument instrument) {
        this.instrument2 = instrument;
    }

    @Autowired(required = false) // 非强制注入, 如果bean不存在则不注入
    @StringedInstrument
    private Instrument instrument3;

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

    @Override
    public String toString() {
        return "Instrumentalist{" +
                "song='" + song + '\'' +
                ", \ninstrument=" + instrument + "\n" +
                ", instrument1=" + instrument1 + "\n" +
                ", instrument2=" + instrument2 + "\n" +
                ", instrument3=" + instrument3 + "\n" +
                '}';
    }
}