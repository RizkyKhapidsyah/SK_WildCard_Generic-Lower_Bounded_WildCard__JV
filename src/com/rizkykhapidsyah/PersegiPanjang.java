package com.rizkykhapidsyah;

public class PersegiPanjang extends Bentuk {

    private double Panjang;
    private double Lebar;

    public PersegiPanjang(double PanjangParam, double LebarParam) {
        Panjang = PanjangParam;
        Lebar = LebarParam;
    }

    @Override
    public double dapatkanLuas() {
        return Panjang * Lebar;
    }
}
