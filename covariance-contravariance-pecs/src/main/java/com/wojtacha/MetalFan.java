package com.wojtacha;

import java.util.Set;

class MetalFan {
    //Consumer super
    void consume(Set<? super Metal> allOfThatShit) {
        Set<Metal> songs = (Set<Metal>) allOfThatShit; // that's the dummest cast but it's not the point here
        songs.forEach(Metal::rock);
    }
}
