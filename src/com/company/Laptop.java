package com.company;

public class Laptop {

    private double pos_x, pos_y, range;

    public Laptop(double pos_x, double pos_y, double range) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.range = range;
    }

    public double getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public double getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public double getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
