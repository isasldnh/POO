package POO;

public class AviaoObjeto {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao(100, "Avianca", "branco", 3965);
		System.out.println("O voo possui " +aviao1.getNumeroAssentos()+ " assentos.");
		System.out.println("O avião é da empresa " +aviao1.getCompanhiaAerea());
		System.out.println("A cor da aeronave é " +aviao1.getCor());
		System.out.println("O número do voo é " +aviao1.getNumeroVoo());

	}

}
