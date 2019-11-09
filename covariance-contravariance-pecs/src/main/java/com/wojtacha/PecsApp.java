package com.wojtacha;

import java.util.Set;

class PecsApp {
    public static void main(String[] args) {
        Set metals = new MetalPlayer().createMetalAlbum();
        new MetalFan().consume(metals);
    }
}
