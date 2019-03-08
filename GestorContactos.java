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
					//eliminarContacto();
					break;
				case 3:
					//mostrarTodos();
					break;
				case 4:
					//mostrarFiltrados();
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
	  aux = new Contacto();
		aux.setNombre(nombre);
		aux.setApellido(apellido);
		aux.setFechaNacimiento(fechaNac);
		aux.setTelefono(telefono);
		contactos.add(aux);
	}

	private static void eliminarContacto() {}

	private static void mostrarTodos() {}

	private static void mostrarFiltrados() {}

}
