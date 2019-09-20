package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import dao.BBDDps;

import modelo.Usuario;

import javax.swing.ImageIcon;



public class ControlUsuario extends JDialog implements ActionListener {
	
	private JPanel contentPane;	
	//private Map<String,Object> variables=new HashMap<String,Object>();
	private JTextField txtUsuario;
	private JLabel lblPwd;
	JPasswordField txtPwd;
	JDialog jd;
    /*JFrame jf;
	
	public ControlUsuario(JFrame jf) {
		this.jf=jf;
	}*/
	public ControlUsuario()  {
		setModal(true);
		inicioVentana();
		inicioComponentes();
	}
	public ControlUsuario(JDialog jd) {
		this.jd=jd;
	}

	public void inicioVentana() {
		this.setTitle("Control de usuarios");
		Image icono = Toolkit.getDefaultToolkit().getImage("images/icon.jpg");
		this.setIconImage(icono);
		//Forma de cerrar la ventana
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Tamaño x,y,alto, ancho
		this.setBounds(300, 100,600, 500);
		//para situarla en un punto
		//this.setLocation(100, 300);
		//Para centrarla en la pantalla
		 this.setLocationRelativeTo(null); 
		 //No/si modificable el tamaño
		 this.setResizable(true);   
		
		//Contenido dentro 
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(java.awt.Color.darkGray);
		contentPane.setLayout(new BorderLayout(2,2));
	}

	public void inicioComponentes() {
//Ventana inicial, creación de etiqueta
		JPanel centro=new JPanel();
		centro.setLayout(null);
		centro.setBackground(java.awt.Color.lightGray);		
		contentPane.add(centro,BorderLayout.CENTER);
		
		JLabel lblImagen = new JLabel();
		lblImagen.setBounds(250, 50, 100, 100);
		lblImagen.setBackground(java.awt.Color.lightGray);
					
		//Añadimos una imagen
		ImageIcon imagen= new ImageIcon("C:\\Users\\Leticia\\Pictures\\descarga.jpg");
		Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
		lblImagen.setIcon(icono);
		
		this.repaint();
		
		centro.add(lblImagen);
		
		JLabel lblTitNombre=new JLabel("APLICACIÓN EJEMPLO");
		lblTitNombre.setBounds(160, 170, 400, 20);
		lblTitNombre.setFont(new Font(Font.SANS_SERIF,Font.ITALIC,26));
		lblTitNombre.setAlignmentX(CENTER_ALIGNMENT);
		centro.add(lblTitNombre);
		
		//Añadimos un campo de texto para el usuario y contraseña:
		JPanel panelUC=new JPanel();
		panelUC.setLayout(null);
		panelUC.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		panelUC.setBackground(Color.MAGENTA);
		panelUC.setBounds(150,220,300,100);
	
		
		JLabel lblUsuario = new JLabel("USUARIO:");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(15, 5, 100, 40);
		lblUsuario.setFont(new Font(Font.SANS_SERIF,Font.ITALIC,12));
		panelUC.add(lblUsuario);
		
		txtUsuario=new JTextField();
		//variables.put("usuario", txtUsuario);
		txtUsuario.setText("Usuario");
		txtUsuario.setBounds(125, 5, 100, 40);
		txtUsuario.setBackground(Color.PINK);
		panelUC.add(txtUsuario);
		
		lblPwd = new JLabel("CONTRASEÑA:");
		lblPwd.setForeground(Color.WHITE);
		lblPwd.setFont(new Font(Font.SANS_SERIF,Font.ITALIC,12));
		lblPwd.setBounds(10, 45, 100, 40);
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		panelUC.add(lblPwd);
		 
		txtPwd=new JPasswordField();
		txtPwd.setText("Password");
		txtPwd.getText();
		//variables.put("pwd", txtPwd);
		txtPwd.setBackground(Color.PINK);
		//x,y,ancho,alto
		txtPwd.setBounds(125, 45, 100, 40);
		panelUC.add(txtPwd);
		centro.add(panelUC);
		
	     JButton   btnAceptar = new JButton();
	     btnAceptar.setBackground(Color.PINK);
	     
	    btnAceptar.setText("ACEPTAR");   
	    btnAceptar.setBounds(150, 350, 115, 30);  
	    centro.add(btnAceptar);
	    JButton   btnCancelar = new JButton();
	    btnCancelar.setBackground(Color.PINK);
	    btnCancelar.setText("CANCELAR");  
	    btnCancelar.setBounds(265, 350, 115, 30); 
        centro.add(btnCancelar);

		btnAceptar.setActionCommand("ComprobarUsuario");
		btnAceptar.addActionListener(this);
		
		btnCancelar.setActionCommand("CancelarUsuario");
		btnCancelar.addActionListener(this);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		Object opcion=e.getActionCommand();
		
if (opcion.equals("ComprobarUsuario")) {
			
			try {
				BBDDps enlace = new BBDDps();
				
				if (enlace.comprobarUsuario(new Usuario(txtUsuario.getText(),txtPwd.getPassword()))) {
							jd=new JDialog();	
					jd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					jd.setVisible(false);
					jd.dispose();
					System.out.println("BIENVENIDO");
					//System.exit(0);
				}
				else {
					JOptionPane.showMessageDialog(null,"USUARIO NO REGISTRADO",null, JOptionPane.ERROR_MESSAGE, null);
					System.exit(0);
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				}
		if (opcion.equals("CancelarUsuario")) {
			JOptionPane.showMessageDialog(null,"La aplicación finaliza aquí",null, JOptionPane.ERROR_MESSAGE, null);
			//ImageIcon icon = new ImageIcon("images/icon.jpg");
			//JOptionPane.showMessageDialog(null,"La aplicación finaliza aquí","Error", JOptionPane.ERROR_MESSAGE,icon);
			System.exit(0);
		}
		
	}
}

