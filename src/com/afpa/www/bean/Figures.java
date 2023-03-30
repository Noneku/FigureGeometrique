package com.afpa.www.bean;

import com.afpa.www.Exeptions.ExeptionCreationFigureTaille;

import java.util.ArrayList;

public abstract class Figures {
    private double surface;
    private double perimetre;


    public double calculPerimetre(ArrayList<Double> arrayList){
        double sum = 0;
        for (double i: arrayList) {
            sum += i;
        }
        return perimetre = sum;
    }
    protected double calculSurface(Double Perimetre){
        double longeurLargeur = Perimetre / 2;
        surface = (longeurLargeur * longeurLargeur);
        return surface;
    }

    public void changeTaille(ArrayList<Double> arrayList, double multiply) throws ExeptionCreationFigureTaille {
        if(multiply == 0) throw new ExeptionCreationFigureTaille(("Nombre Invalid is 0"));
        //On crée un nouveaux tableau qui va remplacer l'état de l'ancien tableaux
        ArrayList<Double> newArrayList = new ArrayList<>();
        //On boucle sur les élements du tableaux afin de les ajouter dans [newArrayList] et de multiplier chaque valeur par l'argument multiply
        for (Double coteDeLaFigure: arrayList) {
            newArrayList.add(coteDeLaFigure * multiply);
        }
        //On remplace les anciens élements du tableaux par les nouveaux
        //this.taille = newArrayList;
        //En cas de changement de taille, on re-calcul le Perimétre avec les nouvelles valeurs
        //calculPerimetre(taille);
    }

    //Getters
    public double getSurface() {
        return surface;
    }

    public double getPerimetre() {
        return perimetre;
    }
    //Setter

    public void setSurface(double surface) {
        this.surface = surface;
    }
}
