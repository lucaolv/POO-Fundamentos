package funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario("Victor", "Av. Dom Bosco", "Gerente", 27, 1198249825, 1);
		Funcionario funcionario2 = new Funcionario("Mara", "Rua Quatro", "Desenvolvedora Java", 35, 1198924434, 2);

		funcionario1.visualizar();
		funcionario2.visualizar();

	}

}
