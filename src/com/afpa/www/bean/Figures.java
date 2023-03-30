package com.afpa.www.bean;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Figures {
    private double surface;
    private double perimetre;

    public double calculPerimetre(ArrayList<Double> arrayList){

        perimetre = 0;
        for (double i: arrayList) {
            perimetre += i;
        }
        return perimetre;
    }

    public void doubleAll(){
        surface = surface * 2;
        perimetre = perimetre * 2;
    }

    public double calculSurface(double L, double l){
        this.surface = L * l;

        return surface;
    }

    public double getSurface() {
        return surface;
    }

    public double getPerimetre() {
        return perimetre;
    }
}
