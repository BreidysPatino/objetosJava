/**
  * 
  * 
  * proceso Objeto y clase 
  * @author Breidys Patino
  */ 

package creditcard;

import javax.swing.JOptionPane;

public class CreditCard {

    public static void main(String[] args) {
        int progress;
        int capital ;
        double commision;
        int currentInterest;
        int i = 0;
        
        
        for (i = 0; i <= 9999; i++) {
            progress= Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la venta"));
             capital =  i ++;
            }  
        }
        commision = progress * 0.16;
        currentInterest = capital * 1.04; 
        
    }


    
    

