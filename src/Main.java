import com.afpa.www.Exeptions.ExeptionCreationFigureTaille;
import com.afpa.www.bean.Carre;
import com.afpa.www.bean.Triangle;

public class Main {
    public static void main(String[] args) {
        try{
            Carre carre = new Carre(30);
            Carre carre2 = new Carre(60);
            Triangle triangle = new Triangle(32,32,02);
            System.out.println(carre.getTaille());
            System.out.println(carre.getPerimetre());
            System.out.println(carre.getSurface());
            System.out.println("-------------------------------------");
            System.out.println(carre2.getTaille());
            System.out.println(carre2.getPerimetre());
            System.out.println(carre2.getSurface());
            System.out.println("-------------------------------------");
            System.out.println(triangle.getTaille());
            System.out.println(triangle.getPerimetre());

        }catch (ExeptionCreationFigureTaille e) {
            throw new RuntimeException(e);
        }

    }
}