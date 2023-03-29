package com.afpa.www.bean;

import com.afpa.www.Exeptions.ExeptionFigure;

import java.util.ArrayList;

public abstract class Figures {
    private static double surface;
    private static double perimetre;

    public ArrayList<Double> taille = new ArrayList<>();


    // On calcul le périmétre d'une figure
    //Proriété de type 'Protected' pour éviter l'utilisation des méthodes de Figures par les objets instanciés
    protected double calculPerimetre(ArrayList<Double> arrayList){

        double sum = 0;
        for (double i: arrayList) {
            sum += i;
        }
        return perimetre = sum;
    }

    public void changeTaille(ArrayList<Double> arrayList, double multiply) throws ExeptionFigure {
        if(multiply == 0) throw new ExeptionFigure(("Nombre Invalid is 0"));
        //On crée un nouveaux tableau qui va remplacer l'état de l'ancien tableaux
        ArrayList<Double> newArrayList = new ArrayList<>();
        //On boucle sur les élements du tableaux afin de les ajouter dans [newArrayList] et de multiplier chaque valeur par l'argument multiply
        for (Double coteDeLaFigure: arrayList) {
            newArrayList.add(coteDeLaFigure * multiply);
        }
        //On remplace les anciens élements du tableaux par les nouveaux
        this.taille = newArrayList;
        //En cas de changement de taille, on re-calcul le Perimétre avec les nouvelles valeurs
        calculPerimetre(taille);
    }

    //Methode associé pour les figures de Type Carré
    protected double calculSurface(double L, double l){
        this.surface = L * l;

        return surface;
    }
    //Getters
    public double getSurface() {
        return surface;
    }

    public double getPerimetre() {
        return perimetre;
    }
}
