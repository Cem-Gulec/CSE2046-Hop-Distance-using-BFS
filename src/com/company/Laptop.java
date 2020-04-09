package com.company;

public class Laptop {

    private float pos_x, pos_y, range;

    public Laptop(int pos_x, int pos_y, int range) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.range = range;
    }

    public float getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public float getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public float getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
