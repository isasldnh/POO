package POO;

public class Cliente2 {
	private int idade;
	private String genero;
	private double altura;
	
	public Cliente2 (int anos, String gen, double alt) {
		idade=anos;
		genero=gen;
		altura=alt;
	}
	
	public int getAnos() {
		int Anos = idade;
		return Anos;
	}
	
	public String getGenero() {
		String Genero = genero;
		return Genero;
	}
	
	public double getAltura() {
		double Altura = altura;
		return Altura;
	}
}
