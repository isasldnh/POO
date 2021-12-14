package POO;

public class Aviao {
	private int numeroAssentos;
	private String companhiaAerea;
	private String cor;
	private int numeroVoo;
	
	public Aviao(int assento, String empresa, String cores, int Voo) {
		numeroAssentos=assento;
		companhiaAerea=empresa;
		cor=cores;
		numeroVoo=Voo;
	}

	public int getNumeroAssentos() {
		return numeroAssentos;
	}

	public String getCompanhiaAerea() {
		return companhiaAerea;
	}

	public String getCor() {
		return cor;
	}

	public int getNumeroVoo() {
		return numeroVoo;
	}
	
	
}
