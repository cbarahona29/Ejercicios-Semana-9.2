
package EjercicioSemana9;


import EjercicioSemana9.Menu;
import javax.swing.JOptionPane;

public class Deposito extends Menu {

    public int depo(int Sactual) {
       
        int saldo = 0;

        try {
            saldo = Integer.parseInt(JOptionPane.showInputDialog("Favor escriba la cantidad que desea depositar"));
            if (saldo <= 0) {
                JOptionPane.showMessageDialog(null, "Favor ingrese un número positivo", "Negativo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                
                Sactual += saldo;
                JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + Sactual);
                return Sactual;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return Sactual;

        
    }

    
    }


        
        
        
    
