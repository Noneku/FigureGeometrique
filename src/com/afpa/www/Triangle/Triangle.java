package com.afpa.www.Triangle;

import com.afpa.www.bean.Figures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Triangle extends Figures {
    private ArrayList<Double> taille = new ArrayList<>();

    public Triangle(double tailleA, double tailleB, double tailleC) {
        Collections.addAll(taille, tailleA, tailleB, tailleC);
        //On calcule directment le périmetre de l'objet que sera instancié
        super.calculPerimetre(taille);
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
