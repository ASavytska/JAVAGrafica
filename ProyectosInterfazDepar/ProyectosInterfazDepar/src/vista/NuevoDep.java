package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import control.AccionesControl;
import dao.BBDDps;
import modelo.Departamento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NuevoDep extends JDialog implements ActionListener{
	
	private final JPanel contentPanel = new JPanel();
	private JLabel lblFormatoFecha, lblFormatoHora;
	JDialog jd;
	JFrame jf;
	private JTextField txtNomDepartamento;
	public NuevoDep() {
		iniciarVentana();
		iniciarComponentes();
	}

	public void iniciarVentana() {
		setTitle("INSERTAR NUEVO ELEMENTO BÁSICO");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

	}

	public void iniciarComponentes() {

		// Etiquetas y Cajas de texto de los contenidos a insertar en la tabla
		
		// *******     ETIQUETAS Y CAJAS DE TEXTO
		JOptionPane.showMessageDialog(null,"EJEMPLO DE INSERCIÓN BÁSICA EN DEPARTAMENTO",null, JOptionPane.ERROR_MESSAGE, null);
		JLabel lblNomDepartamento = new JLabel("NOMBRE DEL DEPARTAMENTO");
		lblNomDepartamento.setBounds(42, 33, 95, 14);
		contentPanel.add(lblNomDepartamento);

		txtNomDepartamento = new JTextField();
		txtNomDepartamento.setColumns(10);
		txtNomDepartamento.setBounds(147, 30, 95, 20);		
		contentPanel.add(txtNomDepartamento);
		//variables.put("nomDepartamento", txtNomDepartamento);
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		// a�adimos los botones----Aceptar
		JButton okButton = new JButton("ACEPTAR");
		okButton.setActionCommand("DAceptar");
		okButton.addActionListener(this);
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		// ---y cancelar
		JButton cancelButton = new JButton("CANCELAR");
		cancelButton.setActionCommand("Cancelar");
		cancelButton.addActionListener(this);
		buttonPane.add(cancelButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
Object opcion=e.getActionCommand();
		
		/*if (opcion.equals("Primero")) {
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
			
		}*/
		
		
		
		if (opcion.equals("DAceptar")){
			BBDDps enlaceBD;
			try {
				enlaceBD = new BBDDps();
				if(enlaceBD.insertarDepartamento(new Departamento(txtNomDepartamento.getText()))) {
					JOptionPane.showMessageDialog(null,"NUEVO DEPARTAMENTO AÑADIDO",null, JOptionPane.INFORMATION_MESSAGE, null);
					jd.dispose();
				}
				else JOptionPane.showMessageDialog(null,"ERROR EN LA INSERCIÓN",null, JOptionPane.INFORMATION_MESSAGE, null);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if (opcion.equals("Cancelar")) {
    		System.exit(0);
		}
		
	}

	
}

