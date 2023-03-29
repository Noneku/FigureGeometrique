package com.afpa.www.bean;

public class Carre extends Figures{

    private double Longeur;
    private double Largeur;

    public Carre(double longeur, double largeur) {
        super();
        Longeur = longeur;
        Largeur = largeur;

        super.calculSurface(this.Longeur, this.Largeur);
    }

    public double getLongeur() {
        return Longeur;
    }

    public void setLongeur(double longeur) {
        Longeur = longeur;
    }

    public double getLargeur() {
        return Largeur;
    }

    public void setLargeur(double largeur) {
        Largeur = largeur;
    }

    @Override
    public String toString() {
        return "Carre{" +
                "Longeur=" + Longeur +
                ", Largeur=" + Largeur +
                '}';
    }
}
