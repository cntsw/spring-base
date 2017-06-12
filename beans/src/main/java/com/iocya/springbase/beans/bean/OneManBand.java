package com.iocya.springbase.beans.bean;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Euler on 2017/6/13.
 */
public class OneManBand implements Performer {
    private List<Instrument> instrumentList;
    private Map<String, Instrument> instrumentMap;
    private Set<String> intrumentNameSet;

    public void setInstrumentList(List<Instrument> instrumentList) {
        this.instrumentList = instrumentList;
    }

    public void setInstrumentMap(Map<String, Instrument> instrumentMap) {
        this.instrumentMap = instrumentMap;
    }

    public void setIntrumentNameSet(Set<String> intrumentNameSet) {
        this.intrumentNameSet = intrumentNameSet;
    }

    @Override
    public void perform() {
        for (Instrument instrument : instrumentList) {
            instrument.play();
        }
        System.out.println("-");
        instrumentMap.forEach((name, instrument) -> {
            System.out.print(name + ": ");
            instrument.play();
        });
        System.out.println("-");
        intrumentNameSet.forEach(System.out::println);
    }
}
