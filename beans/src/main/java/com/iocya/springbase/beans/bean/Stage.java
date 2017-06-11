package com.iocya.springbase.beans.bean;

/**
 * Created by Euler on 2017/6/11.
 */
public class Stage {
    private Stage() {
    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
