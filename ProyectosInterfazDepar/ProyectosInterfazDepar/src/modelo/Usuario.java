package modelo;

public class Usuario {
 private String nombreUsuario;
 private char[] pwd;
public Usuario(String idUsuario, char[] pwd) {
	super();
	this.nombreUsuario = idUsuario;
	this.pwd = pwd;
}
public String getNombreUsuario() {
	return nombreUsuario;
}
public void setNombreUsuario(String nombreUsuario) {
	this.nombreUsuario = nombreUsuario;
}
public String getIdUsuario() {
	return nombreUsuario;
}
public void setIdUsuario(String idUsuario) {
	this.nombreUsuario = idUsuario;
}
public char[] getPwd() {
	return pwd;
}
public void setPwd(char[] pwd) {
	this.pwd = pwd;
}
 

}
