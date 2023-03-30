package com.afpa.www.test;

import com.afpa.www.Exeptions.ExeptionCreationFigureTaille;
import com.afpa.www.bean.Carre;
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
        ArrayList<Double> taille = carre.getTaille();
        assertEquals(taille.get(0)*4, carre.getPerimetre());
    }

    public void testCalculSurface() throws ExeptionCalculSurface {

    }

    @Test
    public void changeTaille() throws ExeptionCalculSurface {

    }
}
