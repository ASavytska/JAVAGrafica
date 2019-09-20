package control;
/*
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import dao.BBDDps;
import modelo.Departamento;


public class AccionesControl implements ActionListener, ItemListener{
	JDialog jd;
	JFrame jf;
	
	public AccionesControl(JFrame jf, Map<String,Object> variables) {
		this.jf=jf;
	}
	public AccionesControl(JDialog jd, Map<String,Object> variables) {
		this.jd=jd;
	}

	public void actionPerformed(ActionEvent evento) {
		
		Object opcion=evento.getActionCommand();
		
		if (opcion.equals("Primero")) {
			JOptionPane.showMessageDialog(jf, "PULSADO EL BOTÓN", null, JOptionPane.INFORMATION_MESSAGE);
						
			JLabel lblNueva = new JLabel("NUEVO CONTENIDO");
			lblNueva.setHorizontalAlignment(SwingConstants.CENTER);
			lblNueva.setBounds(100,300,200,30);
			((JPanel)variables.get("panel")).add(lblNueva);
			((JPanel)variables.get("panel")).updateUI();
			
			//jf.getContentPane().getPaadd(lblNueva);

			JLabel lblNuevaOtra = new JLabel("OTRO NUEVO CONTENIDO");
			lblNuevaOtra.setHorizontalAlignment(SwingConstants.CENTER);
			lblNuevaOtra.setBounds(100,300,200,30);
			//((JPanel)variables.get("otroPanel")).add(lblNuevaOtra);
			
			
			((JButton)variables.get("botonNVI")).setVisible(true);
			((JButton)variables.get("botonNVICC")).setVisible(true);
			((JPanel)variables.get("otroPanel")).updateUI();
			
		}
		
		
		
		if (opcion.equals("DAceptar")){
			BBDDps enlaceBD;
			try {
				enlaceBD = new BBDDps();
				if(enlaceBD.insertarDepartamento(new Departamento(((JTextField).get("nomDepartamento")).getText()))) {
					JOptionPane.showMessageDialog(null,"NUEVO DEPARTAMENTO AÑADIDO",null, JOptionPane.INFORMATION_MESSAGE, null);
					jd.dispose();
				}
				else JOptionPane.showMessageDialog(null,"ERROR EN LA INSERCIÓN",null, JOptionPane.INFORMATION_MESSAGE, null);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		if (opcion.equals("Cancelar")) {
			jd.dispose();
		}
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		//String selectedValue = myComboBox.getSelectedValue().toString();
		if (e.getStateChange() == ItemEvent.SELECTED) {
	          Object item = e.getItem();
	          if (item.toString().equals("Técnico")) {
	        	  ((JLabel)variables.get("lblNivel")).setVisible(true);
	        	  ((JComboBox<String>)variables.get("niveles")).setVisible(true);
	          }
	       }
		
	}
}

*/