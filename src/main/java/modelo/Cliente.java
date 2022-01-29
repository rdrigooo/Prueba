package modelo;

public class Cliente {

	private String runCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String aniosCliente;
	private CategoriaEnum nombreCategoria;

	public Cliente(String runCliente, String nombreCliente, String apellidoCliente, String aniosCliente,
			CategoriaEnum nombreCategoria) {
		super();
		this.runCliente = runCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.aniosCliente = aniosCliente;
		this.nombreCategoria = nombreCategoria;
	}

	public String getRunCliente() {
		return runCliente;
	}

	public void setRunCliente(String runCliente) {
		this.runCliente = runCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getAniosCliente() {
		return aniosCliente;
	}

	public void setAniosCliente(String aniosCliente) {
		this.aniosCliente = aniosCliente;
	}

	public CategoriaEnum getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(CategoriaEnum nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	@Override
	public String toString() {
		StringBuilder client = new StringBuilder();
		client.append(String.format("Run del cliente: %s \n", getRunCliente()));
		client.append(String.format("Nombre del cliente: %s \n", getNombreCliente()));
		client.append(String.format("Apellido del cliente: %s \n", getApellidoCliente()));
		client.append(String.format("A�os como cliente: %s \n", getAniosCliente()));
		client.append(String.format("Categor�a del cliente: %s \n", getNombreCategoria()));

		return client.toString();
	}

}
