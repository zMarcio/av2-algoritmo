import java.util.Random;

public class Exercicio1 {
		
	static class Crianca {
		public String nome;
		public int idade;
		public char turno;
		
		public Crianca() {
			Random randomGenerator = new Random();
			nome = "";
			nome += (char)('A' + randomGenerator.nextInt(26));
			for (int i = 2; i <= 10; i++) {
				nome += (char) ('a' + randomGenerator.nextInt(26));
			}
			idade = 6 + randomGenerator.nextInt(11);
			turno = (randomGenerator.nextInt(2) == 0) ? 'M' : 'T';
		}
	}

	public static void main(String[] args) {
		int n = 20;
		Crianca[] criancas = new Crianca[n];
		for (int i = 0; i < criancas.length; i++) {
			criancas[i] = new Crianca();
		}
		imprime(criancas);
		// organizaTurno (criancas);
		organizaIdade(criancas);
		imprime(criancas);
	}
	
	static void organizaTurno (Crianca[] A) {
		int i = -1;
		Crianca temp;
		for(int j = 0; j < A.length; j++){
			if(A[j]. turno == 'M'){
				i++;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
	}

	public static void organizaIdade(Crianca[] A) {
		int i = -1;
		Crianca temp;
		// crianças de 14 a 16 anos; crianças de 11 a 13 anos; e crianças de 6 a 10 anos. 
		for (int j = 0; j < A.length; j++) {
			if (A[j].idade >= 14) {
				i++;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		for (int j = i + 1; j < A.length; j++) {
			if (A[j].idade >= 11) {
				i++;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		// for (int j = i + 1; j < A.length; j++) {
		// 	if (A[j].idade >= 6) {
		// 		i++;
		// 		temp = A[i];
		// 		A[i] = A[j];
		// 		A[j] = temp;
		// 	}
		// }

	}
	

	static void imprime (Crianca[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.printf("%15s%7d%7c\n", A[i].nome, A[i].idade, A[i].turno);
		}
		System.out.print("\n\n\n");
	}
}
