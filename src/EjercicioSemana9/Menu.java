
package EjercicioSemana9;

import EjercicioSemana9.Deposito;
import EjercicioSemana9.Retiro;
import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
        int opciones;
        int saldoa = 0;
        int cuenta;
        String cliente;
        cliente = JOptionPane.showInputDialog("Ingrese su nombre completo");
        
        cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta"));
        while (true) {
            try {
                opciones = Integer.parseInt(JOptionPane.showInputDialog("Favor selecione una opcion\n"
                    + "1. Depositar\n"
                    + "2. Retiro\n"
                    + "3. Salir"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            
            if (opciones == 3) {
                JOptionPane.showMessageDialog(null, "Saliendo.........Hasta la próxima vez");
                break;
            }
            
            switch (opciones) {
                case 1:
                    Deposito dep = new Deposito();
                    saldoa = dep.depo(saldoa); 
                    break;
                case 2:
                    Retiro ret = new Retiro();
                    saldoa = ret.ret(saldoa); 
                    break;   
                default:
                    JOptionPane.showMessageDialog(null, "Error.......Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}