/**
  * 
  * 
  * proceso Objeto y clase 
  * @author Breidys Patino
  */ 

package fruit;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Fruit {

    int i = 0;
    String color;

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();

        for (int i = 0; i <= 10; i++) {

            colors.add("Elemento" + 1);
        }

        Fruit1 f;
        f = new Fruit1("", "");
        String c = f.ObtenerColor();
        

    }

}
