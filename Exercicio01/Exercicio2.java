import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		int[] A = criaVetorUnimodal(15);
		imprimeVetor(A);
		// System.out.println("------------------");
		int pos1 = posMaior1(A);
		System.out.printf("%10d\n", pos1);
		// int pos2 = posMaior2(A, 0, (A.length-1));
		// System.out.printf("%10d\n", pos2);

		// System.out.println(A.length);
	}

	static int posMaior1 (int[] vetor) {
		int pos = 0;
		while (vetor[pos+1] > vetor[pos]) {
			pos = pos+1;
		}
		return pos;
	}
	
	// Não entendi como se fazer, estava tentando fazer pesquisa binaria e surgiu isso PERGUNTAR AO PROFESSOR
	// static int posMaior2 (int[] vetor, int i, int f) {
	// 	if (i == f) {
	// 		return i;
	// 	}
	// 	int m = (i + f) / 2;
	// 	if (vetor[m] < vetor[m+1]) {
	// 		return posMaior2(vetor, m+1, f);
	// 	} else {
	// 		return posMaior2(vetor, i, m);
	// 	}
	// }

	static int[] imprimeVetor (int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%6d", vetor[i]);
		}
		return vetor;
	}

	
	static int[] criaVetorUnimodal (int n) {
		Random randomGenerator = new Random();
		int p = randomGenerator.nextInt(n-2) + 1;
		int[] vetor = new int[n];
		vetor[0] = randomGenerator.nextInt(10);
		for (int i = 1; i < n; i++) {
			vetor[i] = vetor[i-1] + randomGenerator.nextInt(10) + 1;
		}
		int a = p; int b = n-1;
		while (a < b) {
			int aux = vetor[a];
			vetor[a] = vetor[b];
			vetor[b] = aux;
			a++; b--;
		}
		return vetor;
	}

}

