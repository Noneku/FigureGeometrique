package com.afpa.www.test;

import com.afpa.www.Exeptions.ExeptionCreationFigureTaille;
import com.afpa.www.bean.Carre;
import com.afpa.www.bean.Triangle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFigure {
    @Test
    public void testCreationFigureTaille() {
        assertThrows(ExeptionCreationFigureTaille.class, ()-> new Carre(0));
        assertThrows(ExeptionCreationFigureTaille.class, ()-> new Carre(-1));
    }
    @Test
    public void testCalculPerimetre() throws ExeptionCreationFigureTaille {
        Carre carre = new Carre(20);
        Triangle triangle = new Triangle(20,30,45);

        ArrayList<Double> tailleCarre = carre.getTaille();
        ArrayList<Double> tailleTriangle = triangle.getTaille();

        assertEquals(tailleCarre.get(0)*4, carre.getPerimetre());
        assertEquals(tailleTriangle.get(0) + tailleTriangle.get(1) + tailleTriangle.get(2), triangle.getPerimetre());
    }

    @Test
    public void testCalculSurface() throws ExeptionCreationFigureTaille {
        Carre carre = new Carre(20);
        double longeurLargeur = carre.getPerimetre() / 2;
        assertEquals(longeurLargeur * longeurLargeur, carre.getSurface());

    }

    @Test
    public void changeTaille() {

    }
}
