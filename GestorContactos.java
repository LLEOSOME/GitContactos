import java.util.*;

public class GestorContactos {

	private static Scanner scan = new Scanner(System.in);
	private static List<Contacto> contactos = new ArrayList<>();


	public static void main(String[] args) {

		int opcion;
		do {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			System.out.println("+-------- Gestor de contactos --------+");
			System.out.println("|                                     |");
			System.out.println("| Seleccione una opción:              |");
			System.out.println("| 1) Crear contacto                   |");
			System.out.println("| 2) Eliminar contacto                |");
			System.out.println("| 3) Mostrar todos los contactos      |");
			System.out.println("| 4) Filtrar por nombre               |");
			System.out.println("| 0) Salir                            |");
			System.out.println("|                                     |");
			System.out.println("+-------------------------------------+");
			opcion = scan.nextInt();
			switch (opcion) {
				case 1:
					crearContacto();
					break;
				case 2:
					eliminarContacto();
					break;
				case 3:
					mostrarTodos();
					break;
				case 4:
					mostrarFiltrados();
					break;
				case 0:
					System.out.println("\n\nBye ;)");
					return;
				default:
					System.err.println("Opción inválida\n\n\n");
			}
		} while(opcion != 0);
	}

	private static void crearContacto() {
		String nombre;
		String apellido;
		String telefono;
		String fechaNac;
		Contacto aux;
		System.out.println("Ingresar nombre de contacto");
		nombre = scan.next();
		System.out.println("Ingresar apellido de contacto");
		apellido = scan.next();
		System.out.println("Ingresar fecha de nacimiento");
		fechaNac = scan.next();
		System.out.println("Ingresar telefono");
		telefono = scan.next();
		aux = new Contacto(nombre, apellido, fechaNac, telefono);
		contactos.add(aux);
	}

	private static void eliminarContacto() {
		String eliminar;
		boolean encontrado = false;
		System.out.println("Nombre de contacto a eliminar:");
		eliminar = scan.nextLine();
		if (contactos.isEmpty()){
			System.out.println("No Hay Contactos a Eliminar");
		} else {
			int i = 0;
				for (; i < contactos.size(); i++) {

						if (eliminar.equals(contactos.get(i).getNombre())) {
								System.out.println(i + 1 + ". " + contactos.get(i).getNombre()
								+ "-" + "Tf:"
								 + contactos.get(i).getTelefono());
								encontrado = true;
								break;
						}
					}
					 if(encontrado) {
						 System.out.println("Esta Seguro de Eliminarlo S/N");
						 String respuesta;
						 respuesta = scan.nextLine();
						 if(respuesta == "S"){
							 contactos.remove(i);
						 }else{
							 System.out.println("No se Eliminara Nada");
					 }

					}

		}
	}

	private static void mostrarTodos() {
	for (int i = 0; i < contactos.size(); i++) {
		 System.out.println(contactos.get(i).getNombre()+ " "+contactos.get(i).getApellido()+ ", "+
		 contactos.get(i).getFechaNacimiento()+ ", "+contactos.get(i).getTelefono());
	}
}

	private static void mostrarFiltrados() {

		String busqueda;
		System.out.println("Ingresa Nombre o Apellido a buscar: ");
		busqueda = scan.next();

		String nombre;
		String apellido;

		for (Contacto contacto : contactos) {
			nombre = contacto.getNombre();
			apellido = contacto.getApellido();

			if(nombre.toLowerCase().contains(busqueda)) {
				System.out.println("Resultado: " + nombre + " " + apellido);
			} else if (apellido.toLowerCase().contains(busqueda)) {
				System.out.println("Resultado: " + nombre + " " + apellido);
			}
		}

	}
}
