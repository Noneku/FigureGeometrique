package com.afpa.www.bean;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Figures {
    private double surface;
    private double perimetre;

    public double calculPerimetre(double tailleCotesA, double tailleCotesB, double tailleCotesC){

        perimetre = tailleCotesA + tailleCotesB + tailleCotesC;

        return this.perimetre;
    }
    public void doubleAll(){
        surface = surface * 2;
        perimetre = perimetre * 2;
    }

    //public double changeTaille(int[] cote, double x){
        //this.taille = x * cote;
        //return taille;
    //}
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
