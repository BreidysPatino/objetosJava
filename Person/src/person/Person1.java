package person;

import java.util.Date;
import javax.swing.JOptionPane;

public class Person1 {

    String name;
    String lastName1;
    String lastName2;
    Date birthDay;
    float height;

    public Person1(String name, String lastName1) {
        this.name = name;
        this.lastName1 = lastName1;

    }

    public Date ObtenerFecha() {
        
        JOptionPane.showMessageDialog(null, "La fecha de cumpleaños es: " + birthDay);
        return birthDay;
    }

}
