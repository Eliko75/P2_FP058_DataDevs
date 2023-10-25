package vista;

public class GestionOS { 
	public void inicio() {
		
		boolean salir = false;
		String opcion;
		
		do {
			
			System.out.println("1. Añadir Artículo");
			System.out.println("2. Mostrar Artículos");
			System.out.println("3. Añadir Clientes");
			System.out.println("4. Mostrar Clientes");
			System.out.println("5. Mostrar Clientes Estándar");
			System.out.println("6. Mostrar Clientes Premium");
			System.out.println("7. Añadir Pedido");
			System.out.println("8. Eliminar Pedido");
			System.out.println("9. Mostar pedidos pendientes");
			System.out.println("10. Mostrar pedidos enviados" );
			System.out.println("0. Salir" );
			opcion = pedirOpcion();
			switch (opcion) {
			case "1":
				añadirArticulo();
				break;
				
			case "2":
				mostrarArticulos();
				break;
			case "3":
				añadirClientes();
				break;	
			case "4":
				mostrarClientes();
				break;
			case "5":
				mostrarClientesEstandar();
				break;
			case "6":
				mostrarClientesPremium();
				break;	
			case "7":
				añadirPedido();
				break;	
			case "8":
				eliminarPedido();
				break;
			case "9":
				mostrarPedidosPendientes();
				break;	
			case "10":
				mostrarPedidosEnviados();
				break;	
			case "0":
				salir = true;
				break;	
			}
			
		}while(!salir);
		
		
	}

	private void mostrarPedidosEnviados() {
		// TODO Auto-generated method stub
		
	}

	private void mostrarPedidosPendientes() {
		// TODO Auto-generated method stub
		
	}

	private void eliminarPedido() {
		// TODO Auto-generated method stub
		
	}

	private void añadirPedido() {
		// TODO Auto-generated method stub
		
	}

	private void mostrarClientesPremium() {
		// TODO Auto-generated method stub
		
	}

	private void mostrarClientesEstandar() {
		// TODO Auto-generated method stub
		
	}

	private void mostrarClientes() {
		// TODO Auto-generated method stub
		
	}

	private void añadirClientes() {
		// TODO Auto-generated method stub
		
	}

	private void mostrarArticulos() {
		// TODO Auto-generated method stub
		
	}

	private void añadirArticulo() {
		// TODO Auto-generated method stub
		
	}

	private String pedirOpcion() {
		// TODO Auto-generated method stub
		return null;
	}

}
