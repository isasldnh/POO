package POO;

public class ObjetoCliente {

	public static void main(String[] args) {

		Cliente2 cliente1 = new Cliente2 (29, "nao binarie", 1.75);
		System.out.println("A altura do cliente é: " +cliente1.getAltura());
		System.out.println("O gênero do cliente é: " +cliente1.getGenero());
		System.out.println("A idade do cliente é: " +cliente1.getAnos());
	}

}
