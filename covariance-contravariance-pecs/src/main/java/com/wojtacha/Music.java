package com.wojtacha;

class Music extends Entertainment {
    protected boolean isClassic;
    protected int noOfSongs;

    void play() {
        System.out.printf("Play la la la la...");
    }

    @Override
    void entertain() {
        System.out.println("Crowd listening carefully.");
    }
}
