package com.afpa.www.test;

import com.afpa.www.Exeptions.ExeptionCreationFigureTaille;
import com.afpa.www.bean.Carre;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFigure {
    @Test
    public void testCreationFigureTaille() throws ExeptionCreationFigureTaille {
        assertThrows(ExeptionCreationFigureTaille.class, ()-> new Carre(0));
        assertThrows(ExeptionCreationFigureTaille.class, ()-> new Carre(-1));
    }
    @Test
    public void testCalculPerimetre() {
    
    }

    @Test
    public void changeTaille() {

    }
}
