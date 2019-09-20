package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NuevaVentana extends JDialog{
	
	private final JPanel contentPanel = new JPanel();
	private JLabel lblFormatoFecha, lblFormatoHora;
	//private Map<String,Object> variables=new HashMap<String,Object>();
	
	public NuevaVentana() {
		iniciarVentana();
		iniciarComponentes();
	}

	public void iniciarVentana() {
		setTitle("NUEVA VENTANA");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

	}

	public void iniciarComponentes() {

		// Etiquetas y Cajas de texto de los contenidos a insertar en la tabla
		
		// *******     ETIQUETAS Y CAJAS DE TEXTO
		/*JOptionPane.showMessageDialog(null,"EJEMPLO DE INSERCIÓN BÁSICA EN DEPARTAMENTO",null, JOptionPane.ERROR_MESSAGE, null);
		JLabel lblNomDepartamento = new JLabel("NOMBRE DEL DEPARTAMENTO");
		lblNomDepartamento.setBounds(42, 33, 95, 14);
		contentPanel.add(lblNomDepartamento);*/

		JTextField txtNomDepartamento;
		txtNomDepartamento = new JTextField();
		txtNomDepartamento.setColumns(10);
		txtNomDepartamento.setBounds(147, 30, 95, 20);		
		contentPanel.add(txtNomDepartamento);
		

		/*// ********
		JLabel lblDenDeporte = new JLabel("NOMBRE DEL CAMPO:");
		lblDenDeporte.setBounds(42, 58, 105, 14);
		contentPanel.add(lblDenDeporte);

		JTextField txtDenDeporte;
		txtDenDeporte = new JTextField();
		txtDenDeporte.setColumns(10);
		txtDenDeporte.setBounds(147, 55, 105, 20);
		contentPanel.add(txtDenDeporte);
*/
		

		// a�adimos un panel en el que incluir los botones abajo
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		// a�adimos los botones----Aceptar
		JButton okButton = new JButton("ACEPTAR");
		okButton.setActionCommand("DAceptar");
		//okButton.addActionListener(new AccionesControl(this, variables));
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		// ---y cancelar
		JButton cancelButton = new JButton("CANCELAR");
		cancelButton.setActionCommand("Cancelar");
		//cancelButton.addActionListener(new AccionesControl(this, variables));
		buttonPane.add(cancelButton);
	}

	
}

