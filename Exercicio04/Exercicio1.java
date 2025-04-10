import java.util.Random;

public class Exercicio1 {
		
	static class Aluno {
		public String matricula;
		public String nome;
		public int creditos;
		
		public Aluno() {
			Random randomGenerator = new Random();
			matricula = "";
			for (int i = 1; i <= 6; i++) {
				matricula += (char) ('0' + randomGenerator.nextInt(10));
			}
			nome = "";
			nome += (char)('A' + randomGenerator.nextInt(26));
			for (int i = 2; i <= 5; i++) {
				nome += (char) ('a' + randomGenerator.nextInt(26));
			}
			creditos = randomGenerator.nextInt(121);
		}
	}

	public static void main(String[] args) {
		int n = 15;
		Aluno[] alunos = new Aluno[n];
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = new Aluno();
		}
		imprime(alunos);
		alunos = ordenaCreditos(alunos);
		imprime(alunos);
		alunos = ordenaMatricula(alunos);
		imprime(alunos);
	}
	
	static Aluno[] ordenaCreditos (Aluno[] A) {
		Aluno[] B = new Aluno[A.length];
		// to do
		return B;
	}

	static Aluno[] ordenaMatricula (Aluno[] A) {
		// to do
	}

	static void imprime (Aluno[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.printf("%-15s%-15s%10d\n", A[i].matricula, A[i].nome, A[i].creditos);
		}
		System.out.print("\n\n\n");
	}
}
