package fast.bloc;

public class Nota {

	private int id;
	private String nombreUsuario;
	private String titulo;
	private String categoria;
	private String color;
	private String texto;
	private String urlimagen;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public String getColor() {
		return color;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getUrlimagen() {
		return urlimagen;
	}
	public void setUrlimagen(String urlimagen) {
		this.urlimagen = urlimagen;
	}
	
}
