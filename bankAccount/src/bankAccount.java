 /**
  * 
  * 
  * proceso Objeto y clase 
  * @author Breidys Patino
  */ 
import javax.swing.JOptionPane;


public class bankAccount {
   int accountNumber;
   boolean actived= false;
   
   
   public void state(){
       if (this.actived == true)
       JOptionPane.showMessageDialog(null,"la cuenta esta activa");
       else 
       JOptionPane.showMessageDialog(null,"la cuenta esta inactiva");
   }
   
   
   
}
