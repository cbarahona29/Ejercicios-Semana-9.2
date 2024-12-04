
package EjercicioSemana9;


import EjercicioSemana9.Menu;
import javax.swing.JOptionPane;

public class Retiro extends Menu {

    public int ret(int saldoa) {
        int retiro;

        try {
            retiro = Integer.parseInt(JOptionPane.showInputDialog("Favor escriba la cantidad que desea retirar"));
            if (retiro <= 0) {
                JOptionPane.showMessageDialog(null, "Favor ingrese un número positivo", "Negativo", JOptionPane.INFORMATION_MESSAGE);
            } else if (retiro > saldoa) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                saldoa -= retiro;
                JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + saldoa);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return saldoa;
    }
}