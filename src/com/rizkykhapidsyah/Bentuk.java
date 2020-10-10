package com.rizkykhapidsyah;

public abstract class Bentuk {
    @Override
    public String toString() {
        return String.valueOf(dapatkanLuas());
    }

    public abstract double dapatkanLuas();
}
