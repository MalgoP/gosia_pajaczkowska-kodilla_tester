package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampLength;
    private double stampWidth;
    private boolean stamped;

    public Stamp(String stampName, double stampLength, double stampWidth, boolean stamped) {
        this.stampName = stampName;
        this.stampLength = stampLength;
        this.stampWidth = stampWidth;
        this.stamped = stamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampLength() {
        return stampLength;
    }

    public double getStampWidth() {
        return stampWidth;
    }

    public boolean isTricked() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampLength, stampLength) == 0 && Double.compare(stamp.stampWidth, stampWidth) == 0 && stamped == stamp.stamped && stampName.equals(stamp.stampName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampLength, stampWidth, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampLength=" + stampLength +
                ", stampWidth=" + stampWidth +
                ", stamped=" + stamped +
                '}';
    }
}
