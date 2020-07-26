
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavra = "Socorram-me, subi no ônibus em Marrocos";
		imprimirCaracterPorLinhaInverso(palavra);
		palavra = "anotaram a data da maratona";
		System.out.println();
		imprimirCaracterPorLinhaInverso(palavra);
		
	}
	
	public static void imprimirCaracterPorLinhaInverso(String palavra) {
		for(int i = palavra.length(); i > 0 ; i--) {
			System.out.print(palavra.charAt(i-1));
		}
	}
}
