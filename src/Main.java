import com.afpa.www.Exeptions.ExeptionCreationFigureTaille;
import com.afpa.www.bean.Carre;

public class Main {
    public static void main(String[] args) {
        try{
            Carre carre = new Carre(-5);

        }catch (ExeptionCreationFigureTaille e) {
            throw new RuntimeException(e);
        }

    }
}