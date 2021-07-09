package com.ranzan.birdsgridview;

public class Bird {
    private int imageId;
    private String name;

    public Bird(int imageId, String name) {
        this.imageId = imageId;
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }
}
