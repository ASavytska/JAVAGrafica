package vista;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.border.CompoundBorder;

//import control.AccionesControl;

import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaPMenu extends JFrame implements ActionListener{
	private JPanel ContentPane;
	private JButton bot1;
	private JButton exit;
	private JButton insertDept;
	private JButton bot2;
	//private Map<String,Object> variables=new HashMap<String,Object>();
	public VentanaPMenu() {
		
		this.setTitle("Ventana Principal");
		JDialog controlUsuario=new ControlUsuario();
		controlUsuario.setVisible(true);
		inicioVentana();
		inicioComponentes();
		}
	public void inicioVentana() {
		
		this.setTitle("VENTANA PRINCIPAL");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 750, 500);    		
    	this.ContentPane=new JPanel();		
		this.setContentPane(ContentPane);
	}
	public void inicioComponentes() {
		ContentPane.setLayout(new BorderLayout(0, 0));
		//ContentPane.setLayout(new BoxLayout(ContentPane, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEADING,30,30));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panel_2, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.GREEN);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panel_4,BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.PINK);
		panel_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		FlowLayout flowLayout = (FlowLayout) panel_5.getLayout();
		flowLayout.setAlignOnBaseline(true);
		getContentPane().add(panel_5,BorderLayout.CENTER);
	panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	
	//panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	//panel_1.setLayout(new BorderLayout(0, 0));
	JLabel lblTitulo_1 = new JLabel("LA CABECERA");
	lblTitulo_1.setVerticalAlignment(SwingConstants.TOP);
	//lblTitulo_1.setVerticalAlignment(SwingConstants.TOP);
	lblTitulo_1.setHorizontalAlignment(SwingConstants.LEFT);
	panel_1.add(lblTitulo_1);
	
	JCheckBox chckbxNewCheckBox = new JCheckBox("CONFIRMAR");
	chckbxNewCheckBox.setSelected(true);
	panel_2.add(chckbxNewCheckBox);
	

	
	//panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	//panel_4.setLayout(new BorderLayout(0, 0));
	JLabel lblTitulo_4 = new JLabel("SOUTH");
	lblTitulo_4.setHorizontalAlignment(SwingConstants.CENTER);
	panel_4.add(lblTitulo_4);
	
	insertDept = new JButton("INSERTAR DEPARTAMENTO");
	panel_5.add(insertDept);
	insertDept.setActionCommand("NuevoDeptInsertion");
	insertDept.addActionListener(this);
	
	
	bot2 = new JButton("INSERTAR EMPLEADO");
	panel_5.add(bot2);
	
	exit = new JButton("EXIT");
	panel_5.add(exit);
	exit.addActionListener(this);
	exit.setActionCommand("Salir");
	
	bot1 = new JButton("SELECCIONA");
	bot1.addActionListener(this);
	bot1.setActionCommand("NuevaVentana");
	panel_3.add(bot1);
	/*JLabel lblTitulo_5 = new JLabel("CENTER");
	lblTitulo_5.setHorizontalAlignment(SwingConstants.CENTER);
	panel_5.add(lblTitulo_5);*/
}
	
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        //DO SOMETHING
	    	Object opcion=e.getActionCommand();
	    	if (opcion.equals("NuevoDeptInsertion")) {
				NuevoDep vNuevoDep=new NuevoDep();			
				vNuevoDep.setVisible(true);
			}
	    	if (e.getSource() == exit) {
	    		System.exit(0);
			}
	    	if (opcion.equals("NuevaVentana")) {
NuevaVentana nv1 = new NuevaVentana();
				
				nv1.setVisible(true);

			}
	        /*Object fuente=e.getSource();
	    	if (fuente==exit) {
	    	
	    		System.exit(0);
	    	}
	    	if (fuente==bot1) {
                NuevaVentana nv1 = new NuevaVentana();
				
				nv1.setVisible(true);

	    		}*/
	    }
	}
	