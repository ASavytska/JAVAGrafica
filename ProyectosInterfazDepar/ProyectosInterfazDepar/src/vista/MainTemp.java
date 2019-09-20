package vista;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class MainTemp {
	public static void main(String[] args) {
		//Llamamos a la ventana de inicio de usuario, que será el comienzo de nuestra aplicación
			/*EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						VentanaPrincipal frame = new VentanaPrincipal();
						frame.setVisible(true);
						NuevaVentana frame1 = new NuevaVentana();
						frame1.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	
}*/
			    JDialog.setDefaultLookAndFeelDecorated(true);
			    int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			    if (response == JOptionPane.NO_OPTION) {
			      System.out.println("No button clicked");
			    } else if (response == JOptionPane.YES_OPTION) {
			      System.out.println("Yes button clicked");
			    } else if (response == JOptionPane.CLOSED_OPTION) {
			      System.out.println("JOptionPane closed");
			    }
			  }
			}
