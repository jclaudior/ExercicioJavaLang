
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Deixem que o futuro diga a verdade e avalie cada um de acordo com o seu trabalho e realiza��es.";
		if(frase.contains("realiza��es")) {
			System.out.println("Encontrado a palavra realiza��es");
		}else {
			System.out.println("N�o encontrado a palavra realiza��es");
		}
		
		String comEspaco = " ola ";
		System.out.println(comEspaco);
		String semEspaco = comEspaco.strip();
		System.out.println(semEspaco);
		
		String vazia = "";
		if(vazia.isEmpty()) {
			System.out.println("A String esta vazia");
		}
		
		System.out.println("A frase tem "+frase.length()+" caracteres");
	}

}
