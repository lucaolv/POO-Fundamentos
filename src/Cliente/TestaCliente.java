package Cliente;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Lucas", "Rua Capajós", 23, 70707070, 546798145);
		Cliente cliente2 = new Cliente("Marielson", "Rua Alfredo", 24, 50505050, 349187921);
		
		cliente1.visualizar();
		cliente2.visualizar();
	}

}
