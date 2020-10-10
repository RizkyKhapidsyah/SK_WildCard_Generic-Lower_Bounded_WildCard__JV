package com.rizkykhapidsyah;

public class Lingkaran extends Bentuk {

    private double r;

    public Lingkaran(double rParam) {
        this.r = rParam;
    }

    @Override
    public double dapatkanLuas() {
        return Math.PI * r * r;
    }
}