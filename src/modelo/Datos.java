package modelo;

public class Datos {
	private ListaArticulos listaArticulos;
	private ListaClientes listaClientes;
	private ListaPedidos listaPedidos;
	
	public Datos () {
		listaArticulos = new ListaArticulos ();
		listaClientes = new ListaClientes ();
		listaPedidos = new ListaPedidos ();
	}

	public void setListaArticulos(ListaArticulos listaArticulos) {
		this.listaArticulos = listaArticulos;
	}

	public void setListaClientes(ListaClientes listaClientes) {
		this.listaClientes = listaClientes;
	}

	public void setListaPedidos(ListaPedidos listaPedidos) {
		this.listaPedidos = listaPedidos;
	}

	public Datos(ListaArticulos listaArticulos, ListaClientes listaClientes, ListaPedidos listaPedidos) {
		this.listaArticulos = listaArticulos;
		this.listaClientes = listaClientes;
		this.listaPedidos = listaPedidos;
	}

	public ListaArticulos getListaArticulos() {
		return listaArticulos;
	}

	public ListaClientes getListaClientes() {
		return listaClientes;
	}

	public ListaPedidos getListaPedidos() {
		return listaPedidos;
	}

}
