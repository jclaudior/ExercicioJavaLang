
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavra = "paralelepipedo";
		imprimirCaracterPorLinha(palavra);
		
	}
	
	public static void imprimirCaracterPorLinha(String palavra) {
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
	}

}
