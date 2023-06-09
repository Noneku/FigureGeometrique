package com.afpa.www.bean;

import com.afpa.www.bean.Figures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Triangle extends Figures {

    public Triangle(double tailleA, double tailleB, double tailleC) {
        Collections.addAll(taille, tailleA, tailleB, tailleC);
    }

    public ArrayList<Double> getTaille() {
        return taille;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "taille=" + taille +
                "} " + super.toString();
    }
}
