package vista;

import java.util.Scanner;

import servicio.ClienteServicio;
import servicio.ExportadorCsv;
import servicio.ExportadorTxt;

public class Menu {

	private ClienteServicio clienteServicio;
	private ArchivoServicio archivoServicio;
	private ExportadorCsv exportarCsv;
	private ExportadorTxt exportarTxt;
	private String fileName = "Clientes";
	private String fileName1 = "DBClientes.csv";
	private Scanner scanner;

	public void listarCliente() {

	}

	public void agregarCliente() {

	}

	public void editarCliente() {

	}

	public void importarDatos() {

	}

	public void exportarDatos() {

	}
	public void terminarPrograma() {
		
	}

	public final void iniciarMenu() {
		System.out.println("1. Listar Clientes \n" + "2. Agregar Cliente \n" + "3. Editar Cliente \n"
				+ "4. Cargar Datos \n" + "5. Exportar Datos \n" + "6. Salir");
		System.out.println("Ingrese una opción: ");
		int opcion = scanner.nextInt();

		switch (opcion) {
		case 1:
			listarCliente();
			break;
		case 2:
			agregarCliente();
			break;
		case 3:
			editarCliente();
			break;
		case 4:
			importarDatos();
			break;
		case 5:
			exportarDatos();
			break;
		case 6:
			terminarPrograma();
			break;

		default:
			System.out.println("opción ingresada no es válida");
			break;
		}

	}

}
