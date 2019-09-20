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

import javax.swing.border.CompoundBorder;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;

public class VentanaPrincipal extends JFrame implements ActionListener {
	private JPanel ContentPane;
	private JButton bot1;
	private JButton exit;
	private JButton enter;
	private JButton bot2;
	
	public VentanaPrincipal() {
		
		this.setTitle("Ventana Principal");
		JDialog controlUsuario=new ControlUsuario();
		controlUsuario.setVisible(true);
		inicioVentana();
		inicioComponentes();
		}
	 /*setLayout(new BorderLayout());
     add(new Button("North"), BorderLayout.NORTH);
     add(new Button("South"), BorderLayout.SOUTH);
     add(new Button("East"), BorderLayout.EAST);
     add(new Button("West"), BorderLayout.WEST);
     add(new Button("Center"), BorderLayout.CENTER);*/
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
		
		exit = new JButton("EXIT");
		panel_5.add(exit);
		
		
		enter = new JButton("OPTION 2");
		panel_5.add(enter);
		
		
		bot2 = new JButton("OPTION 3");
		panel_5.add(bot2);
	
		
		bot1 = new JButton("SELECCIONA");
		bot1.addActionListener(this);
	
		panel_3.add(bot1);
		/*JLabel lblTitulo_5 = new JLabel("CENTER");
		lblTitulo_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblTitulo_5);*/
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == bot1) {
				NuevaVentana nv1 = new NuevaVentana();
				
				nv1.setVisible(true);

			}
			else {
				String nombre = "MUNDO"; 
				JOptionPane.showMessageDialog(this, "Hola " + nombre + "."); 
			}
			
		}}






