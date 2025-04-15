import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		int[] A = criaVetorUnimodal(15);
		imprimeVetor(A);
		// System.out.println("------------------");
		// int pos1 = posMaior1(A);
		// System.out.printf("%10d\n", pos1);
		// int pos2 = posMaior2(A, 0, (A.length-1)); // 0 a 15 - 1, pois o vetor começa a contar do 0
		// System.out.printf("%10d\n", pos2); // Irá retornar o maior numero do vetor
		System.out.println(1<2);
		// System.out.println(A.length);
	}

	static int posMaior1 (int[] vetor) {
		int pos = 0;
		while (vetor[pos+1] > vetor[pos]) {
			pos = pos+1;
		}
		return pos;
	}
	
	static int posMaior2 (int[] vetor, int i, int f) {
		System.out.println("------------------");
		System.out.println("i: " + i + " f: " + f);
		if (i == f) { // i == f significa que a recursão 'fatiou' o vetor até chegar em um único elemento que é o maior
			return i;
		}
		// Parte interativa que encontrar o meio do vetor
		int m = (i + f) / 2;
		// Para ambos os casos, o vetor é divido em dois até chegar no maior elemento possível
		if (vetor[m] < vetor[m+1]) {
			return posMaior2(vetor, m+1, f); // Se o elemento do m for menor que o m+1, significa que o vetor vai ser divido do meio para frente, m+1 até f
		} else {
			return posMaior2(vetor, i, m); 	// Se o elemento do m for maior que o m+1, significa que o vetor vai ser divido do meio para trás, i até m
		}
	}

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

