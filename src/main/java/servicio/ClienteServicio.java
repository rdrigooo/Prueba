package servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.CategoriaEnum;
import modelo.Cliente;

public class ClienteServicio {

	private List<Cliente> listaClientes;
	Scanner scanner = new Scanner(System.in);
	CategoriaEnum estado;

	public ClienteServicio(List<Cliente> listaClientes) {

		listaClientes = new ArrayList<>();
	}

	public void retornolistarCliente() {
		for (Cliente cliente : listaClientes)
			System.out.println(cliente.toString());
	}

	@SuppressWarnings("static-access")
	public void agregarCliente() {
		System.out.println("--------------- Crear Cliente------------------------");
		System.out.println("Ingresa RUN del Cliente:");
		String RUN = scanner.nextLine();
		System.out.println("Ingresa Nombre del Cliente: ");
		String Nombre = scanner.nextLine();
		System.out.println("Ingresa Apellido del Cliente: ");
		String Apellido = scanner.nextLine();
		System.out.println("Ingresa años como Cliente: ");
		String Años = scanner.nextLine();
		System.out.println("Categoíra del Cliente: %s" + estado.Activo);

		Cliente cliente = new Cliente(RUN, Nombre, Apellido, Años, estado);

		listaClientes.add(cliente);

	}

	public void editarCliente(Cliente cliente) {
		System.out.println("Seleccione qué desea hacer: ");
		System.out.println("1.-Cambiar el estado del Cliente \n" + "2.-Editar los datos ingresados del Cliente");
		System.out.println("Ingrese una opción: ");
		int opcion = scanner.nextInt();

		System.out.println("--------------------------------------");
		System.out.println("Ingrese RUN del cliente a modificar estado: ");
		String run = scanner.nextLine();
		if (run.equals(cliente.getRunCliente())) {
			switch (opcion) {
			case 1:
				System.out.println("------Actualizando estado del cliente --------");
				System.out.println("El estado del cliente es: %s");
				System.out.println("1.-Si desea cambiar el estado del cliente a INACTIVO");
				System.out.println("2.-Si desea mantener el estado del cliente ACTIVO");
				String eleccion = scanner.nextLine();
				switch (eleccion) {
				case "1":
					cliente.setNombreCategoria(estado.Inactivo);
					System.out.println("Estado del Cliente cambiado a INACTIVO");
					break;
				case "2":
					cliente.setNombreCategoria(estado.Activo);
					System.out.println("Estado de Cliente se a conservado ACTIVO");
					break;

				default:
					System.out.println("Actualizacion escogida no valida");
					break;
				}

				break;
			case 2:
				System.out.println("-----------Actualizando datos del Cliente-----------");
				buscarCliente(run);
				System.out.println("1.El RUN del cliente es: %s");
				System.out.println("2.El Nombre del cliente es es: %s");
				System.out.println("3.El Apellido del Cliente es: %s ");
				System.out.println("4.Los Años como cliente son: %s");

				System.out.println("Ingrese opcion a editar del cliente");
				String opcion2 = scanner.nextLine();

				switch (opcion2) {
				case "1":
					System.out.println("Ingrese nuevo RUN del Cliente: ");
					String nuevoRun = scanner.nextLine();
					cliente.setRunCliente(nuevoRun);
					break;
				case "2":
					System.out.println("Ingrese nuevo Nombre del Cliente: ");
					String nuevoNombre = scanner.nextLine();
					cliente.setNombreCliente(nuevoNombre);
					break;
				case "3":
					System.out.println("Ingrese Nuevo Apellido del Cliente");
					String nuevoApellido = scanner.nextLine();
					cliente.setApellidoCliente(nuevoApellido);
					break;
				case "4":
					System.out.println("Ingrese la nueva cantidad de años como Cliente:");
					String nuevosAnios = scanner.nextLine();
					cliente.setAniosCliente(nuevosAnios);
					break;

				default:
					System.out.println("Opción ingresada no es valida");
					break;
				}

				break;
			default:
				System.out.println("opción ingresada no es valida");
				break;
			}
		} else {
			System.out.println("Cliente no registrado");
		}

	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public Cliente buscarCliente(String rut) {

		for (Cliente cliente : listaClientes) {
			if (cliente.getRunCliente().equals(rut)) {
				return cliente;
			}
		}
		return null;

	}

}
