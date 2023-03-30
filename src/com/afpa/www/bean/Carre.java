package com.afpa.www.bean;

import com.afpa.www.Exeptions.ExeptionCreationFigureTaille;

import java.util.ArrayList;
import java.util.Collections;

public class Carre extends Figures{

    private ArrayList<Double> taille = new ArrayList<>();
    private static double perimetre;
    public Carre(double longeurA) throws ExeptionCreationFigureTaille {
        if(longeurA <= 0)throw new ExeptionCreationFigureTaille("L'object instancié ne prend pas de paramètre Négatif OU à 0");
        Collections.addAll(taille, longeurA);
    }

    public ArrayList<Double> getTaille() {
        return taille;
    }

    @Override
    public double getPerimetre() {
        return taille.get(0) * 4;
    }

    protected static void calculSurface(){

    }

}
