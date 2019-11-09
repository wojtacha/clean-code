package com.wojtacha;

import static java.lang.String.format;

class Metal extends Music {
    String title;
    private boolean isNothingElseMatters;

    Metal(boolean isNothingElseMatters, String title) {
        this.isNothingElseMatters = isNothingElseMatters;
        this.title = title;
    }

    void rock() {
        System.out.println(format("now playing: %s",title));
    }

    @Override
    void play() {
        System.out.println("Take me down to the Paradise City...");
    }

    @Override
    void entertain() {
        System.out.println("Girls took off their bras.");
    }
}
