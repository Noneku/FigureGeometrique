import com.afpa.www.Exeptions.ExeptionFigureTaille;
import com.afpa.www.Triangle.triangle_equilateral;
import com.afpa.www.bean.Carre;
import com.afpa.www.bean.Triangle;

public class Main {
    public static void main(String[] args) {
        try{
            Carre carre = new Carre(23);

        } catch (ExeptionFigureTaille e) {
            throw new RuntimeException(e);
        }

    }
}