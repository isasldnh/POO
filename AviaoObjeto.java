package POO;

public class AviaoObjeto {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao(100, "Avianca", "branco", 3965);
		System.out.println("O voo possui " +aviao1.getNumeroAssentos()+ " assentos.");
		System.out.println("O avi�o � da empresa " +aviao1.getCompanhiaAerea());
		System.out.println("A cor da aeronave � " +aviao1.getCor());
		System.out.println("O n�mero do voo � " +aviao1.getNumeroVoo());

	}

}
