package POO;

public class ObjetoCliente {

	public static void main(String[] args) {

		Cliente2 cliente1 = new Cliente2 (29, "nao binarie", 1.75);
		System.out.println("A altura do cliente �: " +cliente1.getAltura());
		System.out.println("O g�nero do cliente �: " +cliente1.getGenero());
		System.out.println("A idade do cliente �: " +cliente1.getAnos());
	}

}
