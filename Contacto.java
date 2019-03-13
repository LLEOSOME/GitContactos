public class Contacto {

	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String telefono;

	public Contacto(){
  }

	public Contacto(String nombre, String apellido, String fechaNacimiento, String telefono){
	         this.nombre = nombre;
		       this.apellido = apellido;
					 this.fechaNacimiento = fechaNacimiento;
		       this.telefono = telefono;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return this.nombre + " - " + this.apellido + " - " + this.fechaNacimiento + " - " +this.telefono;
	}

}
