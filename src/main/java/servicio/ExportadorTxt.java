package servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import modelo.Cliente;

public class ExportadorTxt extends Exportador {

	@Override
	public void exportador(String fileName, List<Cliente> listaClientes) {

		fileName = String.format("%s//clientes.txt");
		File archivo = new File(fileName);
		if (archivo.exists()) {

			try {
				FileWriter fw = new FileWriter(archivo);
				BufferedWriter escritor = new BufferedWriter(fw);
				for (Cliente cliente : listaClientes) {
					String pro = String.format("%s,%s,%s,%s,%s", cliente.getRunCliente(), cliente.getNombreCliente(),
							cliente.getApellidoCliente(), cliente.getAniosCliente(), cliente.getNombreCategoria());
					escritor.write(pro);
					escritor.newLine();
				}
				escritor.close();

			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		} else {
			System.out.println("Archivo no existe en esa ruta");
		}

	}
		
	}
	
