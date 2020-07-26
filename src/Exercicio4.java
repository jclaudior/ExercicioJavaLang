public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "762";
				
		int result = 0;
		for (int i = 0; i < x.length(); i++) {
		   int digit = ((int) x.charAt(i) & 0xF);
		   for (int j = 0; j < x.length()-1-i; j++) {
		        digit *= 10;
		   }
		   result += digit;
		}
		
		
		System.out.println(result);
		
		
	}

}
