package com.kiralydavid.kiralydavid_firebase;

public class Varosok {
    private String nev, orszag, lakossag;

    public Varosok(String nev, String orszag, String lakossag) {
        this.nev = nev;
        this.orszag = orszag;
        this.lakossag = lakossag;
    }
    public Varosok(){};

    public String getNev() {
        return this.nev;
    }

    public String getOrszag() {
        return this.orszag;
    }

    public String getLakossag() {
        return this.lakossag;
    }
}
