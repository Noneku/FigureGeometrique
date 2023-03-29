import com.afpa.www.Triangle.triangle_equilateral;

public class Main {
    public static void main(String[] args) {
        triangle_equilateral test = new triangle_equilateral(50,23,20);
        //Je calcule le périmetre de l'objet test, en lui attribuant la taille de ses côtés
        test.changeTaille(test.getTaille(), 9);
        System.out.println(test.getPerimetre());

    }
}