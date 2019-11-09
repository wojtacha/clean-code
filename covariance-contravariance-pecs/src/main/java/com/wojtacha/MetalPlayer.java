package com.wojtacha;

import java.util.HashSet;
import java.util.Set;

class MetalPlayer {
    // Producer extends
    Set<? extends Entertainment> createMetalAlbum() {
        Set<Metal> songs = new HashSet<>();
        songs.add(new Metal(false, "Thunderstruck"));
        songs.add(new Metal(false,"Back in Black"));
        return songs;
    }
}
