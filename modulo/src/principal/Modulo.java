package principal;

public class Modulo {
	private String nombre;
	private int horas;
	private String codigo;

	public Modulo(String nombre, int horas, String codigo) {

		this.nombre = nombre;
		this.horas = horas;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Modulo: " + nombre + " horas: " + horas + ", codigo: " + codigo;
	}
	
	

}
